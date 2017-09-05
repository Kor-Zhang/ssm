package com.zk.ssm.mapper;

import java.util.List;

import com.zk.ssm.po.ItemsCustom;
import com.zk.ssm.po.ItemsQueryVo;


public interface ItemsMapperCustom {
	/**
	 * Title:
	 * <p>
	 * Description:查询items
	 * <p>
	 * @author Kor_Zhang
	 * @date 2017年9月5日 下午7:15:05
	 * @version 1.0
	 * @param vo
	 * @return
	 */
	public List<ItemsCustom> selectItems(ItemsQueryVo vo) throws Exception;
}