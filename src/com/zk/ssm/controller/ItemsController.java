package com.zk.ssm.controller;

import java.io.File;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.druid.util.IOUtils;
import com.zk.ssm.po.ItemsCustom;
import com.zk.ssm.po.ItemsQueryVo;
import com.zk.ssm.service.ItemsServiceI;
import com.zk.ssm.util.Util;
import com.zk.ssm.validation.ValidGroup0;

/**
 * Title:ItemsController
 * <p>
 * Description:
 * <p>
 * @author Kor_Zhang
 * @date 2017年9月5日 下午8:45:37
 * @version 1.0
 */
@Controller
//窄化请求映射
@RequestMapping("/items")
public class ItemsController {
	@Autowired
	private ItemsServiceI itemsService;
	

	//限制访问方法可以为POST,GET
	@RequestMapping(value="/selectItems",method={RequestMethod.GET,RequestMethod.POST})
	public String selectItems(Model model,ItemsQueryVo itemsQueryVo) throws Exception{

		
		List<ItemsCustom> items = itemsService.selectItems(itemsQueryVo);
		
		
		model.addAttribute("items",items);
		
		
		return "items/itemsList";
	}
	
	
	/**
	 * Title:selectItem
	 * <p>
	 * Description:根据id获取需要修改的商品信息
	 * <p>
	 * @author Kor_Zhang
	 * @date 2017年9月6日 上午8:36:57
	 * @version 1.0
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping("/editAItem")
	public String editAItem(Model model,@RequestParam("id")String id) throws Exception{
		
		try {
			ItemsCustom itemsCustom = itemsService.selectAItem(id);
			
			Util.eject(itemsCustom == null, "商品不存在!");
			
			model.addAttribute("itemsCustom", itemsCustom);
			
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		return "items/editItem";
	}
	
	
	/**
	 * Title:updateAItem
	 * <p>
	 * Description:通过id更新一个item
	 * <p>
	 * @author Kor_Zhang
	 * @date 2017年9月6日 上午9:06:25
	 * @version 1.0
	 * @return
	 */
	//在需要校验的pojo添加注解@Validated
	//pojo后加BindingResult
	//一个pojo的@Validated对应其BindingResult(一前一后)
	@RequestMapping("/updateAItem")
	public String updateAItem(Model model,
			@Validated(value={ValidGroup0.class}) ItemsQueryVo itemsQueryVo,
			BindingResult bindingResult,
			MultipartFile item_pic){
		
		try {
		//获取结果信息
			if(bindingResult.hasErrors()){
				List<ObjectError> allErrors = bindingResult.getAllErrors();

				//出错
				model.addAttribute("allErrors", allErrors);
				
				Util.eject();
				
			}
			
			//上传图片
			if(item_pic != null && !item_pic.isEmpty()){
				//存储图片的物理路径
				String pic_path = "E:\\upload\\temp\\";
				
				//生成新的名称,如a.jpg
				String newFileName = itemsQueryVo.getItemsCustom().getId() + ".png";
				
				//写入的文件
				File dest = new File(pic_path + newFileName);
				
				//写入
				item_pic.transferTo(dest);
				
			}
			
			
			itemsService.updateAItem(itemsQueryVo);
			
		} catch (Exception e) {
			e.printStackTrace();
			//回显数据
			model.addAttribute("itemsCustom",itemsQueryVo.getItemsCustom());
			//出错,到达修改页面
			
			return "items/editItem";
		}
		
		return "redirect:/items/selectItems.action";
	}
	
	/**
	 * Title:deleteItems
	 * <p>
	 * Description:批量删除商品
	 * <p>
	 * @author Kor_Zhang
	 * @date 2017年9月6日 下午3:15:13
	 * @version 1.0
	 * @param deleteIds
	 * @return
	 */
	@RequestMapping("deleteItems")
	public String deleteItems(String[] deleteIds){

		try {
			
			itemsService.deleteItems(deleteIds);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return "redirect:/items/selectItems.action";
	}
	
	
	
	/**
	 * Title:itemsView
	 * <p>
	 * Description:查询一个商品,返回json格式
	 * <p>
	 * @author Kor_Zhang
	 * @date 2017年9月7日 下午2:11:48
	 * @version 1.0
	 * @param id
	 * @return
	 * @throws Exception
	 */
	//itemsView/{id}表示将路径的内容保存为{id:"xx"}的键值对格式
	//@PathVariable("id")表示取出键为id的值
	@RequestMapping("/itemsView/{id}")
	public @ResponseBody ItemsCustom itemsView(@PathVariable("id") String id) throws Exception{
		
		return itemsService.selectAItem(id);
		
	}
	
	
}
