package com.zk.ssm.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.zk.ssm.util.Util;

/**
 * Title:HandlerInterceptor2
 * <p>
 * Description:
 * <p>
 * @author Kor_Zhang
 * @date 2017年9月7日 下午3:14:16
 * @version 1.0
 */
public class HandlerInterceptor2 implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {

		Util.l.info("HandlerInterceptor1#preHandle");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		Util.l.info("HandlerInterceptor1#postHandle");

	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		Util.l.info("HandlerInterceptor1#afterCompletion");

	}

}
