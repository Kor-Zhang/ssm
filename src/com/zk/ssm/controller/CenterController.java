package com.zk.ssm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zk.ssm.po.Users;
import com.zk.ssm.po.UsersCustom;

/**
 * Title:UsersController
 * <p>
 * Description:中心控制器
 * <p>
 * @author Kor_Zhang
 * @date 2017年9月7日 下午3:35:20
 * @version 1.0
 */
@Controller
@RequestMapping("/")
public class CenterController {
	
	/**
	 * Title:jsp
	 * <p>
	 * Description:因为无法直接访问WEB-INF下的jsp,所有利用controller转发访问jsp
	 * <p>
	 * @author Kor_Zhang
	 * @date 2017年9月7日 下午3:46:40
	 * @version 1.0
	 * @param jsp
	 * @return
	 */
	@RequestMapping("/jsp")
	public String jsp(String jsp){
		
		return jsp;
	}
}
