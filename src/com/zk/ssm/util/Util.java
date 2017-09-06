package com.zk.ssm.util;

import org.apache.log4j.Logger;

/**
 * Title:Util
 * <p>
 * Description:工具类
 * <p>
 * 
 * @author Kor_Zhang
 * @date 2017年8月31日 下午3:14:15
 * @version 1.0
 */
public class Util {
	public static final Logger l = Logger.getLogger(Util.class);

	/**
	 * 
	 * Title:eject
	 * <p>
	 * Description:如果表达式成立,抛出异常
	 * <p>
	 * @author Kor_Zhang
	 * @date 2017年9月6日 下午3:56:51
	 * @version 1.0
	 * @param expr
	 * @param msg
	 * @throws Exception
	 */
	public static void eject(Boolean expr, String msg) throws Exception {
		if (expr) {
			throw new Exception(msg);
		}
	}
}
