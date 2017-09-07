package com.zk.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zk.ssm.po.ItemsCustom;

/**
 * Title:JsonTestController
 * <p>
 * Description:json交互测试
 * <p>
 * @author Kor_Zhang
 * @date 2017年9月7日 上午11:26:13
 * @version 1.0
 */
@Controller
@RequestMapping("/")
public class JsonTestController {
	
	/**
	 * Title:requestJson
	 * <p>
	 * Description:请求json,返回json
	 * <p>
	 * @author Kor_Zhang
	 * @date 2017年9月7日 上午11:27:16
	 * @version 1.0
	 * @param model
	 * @return 
	 */
	//@RequestBody将json转成了java对象
	//@@ResponseBody将java对象转成了json
	@RequestMapping("/requestJson")
	public @ResponseBody ItemsCustom requestJson(@RequestBody ItemsCustom itemsCustom){
		return itemsCustom;
	}
	
	/**
	 * Title:requestKeyValue
	 * <p>
	 * Description:请求key/value,返回json
	 * <p>
	 * @author Kor_Zhang
	 * @date 2017年9月7日 下午1:38:45
	 * @version 1.0
	 * @param itemsCustom
	 * @return
	 */
	@RequestMapping("/requestKeyValue")
	public @ResponseBody ItemsCustom requestKeyValue(ItemsCustom itemsCustom){
		return itemsCustom;
	}
	
	
}
