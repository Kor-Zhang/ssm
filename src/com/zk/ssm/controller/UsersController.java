package com.zk.ssm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zk.ssm.po.Users;
import com.zk.ssm.po.UsersCustom;

/**
 * Title:UsersController
 * <p>
 * Description:用户控制器
 * <p>
 * @author Kor_Zhang
 * @date 2017年9月7日 下午3:35:20
 * @version 1.0
 */
@Controller
@RequestMapping("/users")
public class UsersController {
	
	@RequestMapping("/login")
	public String login(HttpSession session,UsersCustom usersCustom){
		
		session.setAttribute("user", usersCustom);
		
		return "redirect:/items/selectItems.action";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session){
		
		session.removeAttribute("user");
		
		session.invalidate();
		
		return "users/login";
	}
}
