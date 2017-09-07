package com.zk.ssm.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.validator.internal.util.privilegedactions.GetResource;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.zk.ssm.util.Util;

/**
 * Title:UsersStatusInterceptor
 * <p>
 * Description:判断用户的登录状态
 * <p>
 * @author Kor_Zhang
 * @date 2017年9月7日 下午3:14:21
 * @version 1.0
 */
public class UsersStatusInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		Util.l.info("UsersStatusInterceptor#preHandle");
		
		String url = request.getRequestURI();
		
		if(url.indexOf("login.action")>=0){//判断是否请求登录页面
			return true;
		}
		
		
		if(request.getSession().getAttribute("user") != null){
			return true;
		}
		//未登录
		
		//转发到登录页面
		request.getRequestDispatcher("/WEB-INF/view/users/login.jsp").forward(request, response);;
		
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

		Util.l.info("UsersStatusInterceptor#postHandle");
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

		Util.l.info("UsersStatusInterceptor#afterCompletion");

	}

}
