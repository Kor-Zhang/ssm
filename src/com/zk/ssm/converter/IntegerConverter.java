package com.zk.ssm.converter;

import org.springframework.core.convert.converter.Converter;

/**
 * Title:NumberConverter
 * <p>
 * Description:将string转化为integer
 * <p>
 * @author Kor_Zhang
 * @date 2017年9月6日 上午11:36:01
 * @version 1.0
 */
public class IntegerConverter implements Converter<String, Integer> {

	/* (non-Javadoc)
	 * @see org.springframework.core.convert.converter.Converter#convert(java.lang.Object)
	 */
	@Override
	public Integer convert(String source) {
		
		return Integer.valueOf(source);
	}

}
