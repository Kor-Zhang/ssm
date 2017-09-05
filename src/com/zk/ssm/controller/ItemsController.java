package com.zk.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zk.ssm.po.ItemsCustom;
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
public class ItemsController {
	@Autowired
	private ItemsServiceI itemsService;
	
	@RequestMapping("/selectItems")
	public ModelAndView selectItems() throws Exception{

		List<ItemsCustom> items = itemsService.selectItems(null);
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("items",items);
		
		mav.setViewName("items/itemsList");
		
		return mav;
	}
}
