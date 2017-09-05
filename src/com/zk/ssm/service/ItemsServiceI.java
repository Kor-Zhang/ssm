package com.zk.ssm.service;

import java.util.List;

import com.zk.ssm.po.ItemsCustom;
import com.zk.ssm.po.ItemsQueryVo;

/**
 * Title:ItemsServiceI
 * <p>
 * Description:商品管理的service
 * <p>
 * @author Kor_Zhang
 * @date 2017年9月5日 下午7:30:50
 * @version 1.0
 */
public interface ItemsServiceI {
	/**
	 * Title:
	 * <p>
	 * Description:查询items
	 * <p>
	 * @author Kor_Zhang
	 * @date 2017年9月5日 下午7:30:48
	 * @version 1.0
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	public List<ItemsCustom> selectItems(ItemsQueryVo vo) throws Exception;
}
