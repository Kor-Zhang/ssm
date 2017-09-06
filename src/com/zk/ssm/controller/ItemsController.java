package com.zk.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zk.ssm.po.ItemsCustom;
import com.zk.ssm.po.ItemsQueryVo;
import com.zk.ssm.service.ItemsServiceI;

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
	 */
	@RequestMapping("/editAItem")
	public String editAItem(Model model,@RequestParam("id")String id){
		
		try {
			ItemsCustom item = itemsService.selectAItem(id);
			
			model.addAttribute("item", item);
			
		} catch (Exception e) {
			e.printStackTrace();
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
	@RequestMapping("/updateAItem")
	public String updateAItem(String id,ItemsQueryVo itemsQueryVo){
		
		try {
			
			itemsService.updateAItem(id, itemsQueryVo);
			
		} catch (Exception e) {
			e.printStackTrace();
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
}
