package com.zk.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.zk.ssm.mapper.ItemsMapperCustom;
import com.zk.ssm.po.ItemsCustom;
import com.zk.ssm.po.ItemsQueryVo;
import com.zk.ssm.service.ItemsServiceI;

public class ItemsService implements ItemsServiceI {
	
	@Autowired
	private ItemsMapperCustom itemsMapperCustom;
	
	@Override
	public List<ItemsCustom> selectItems(ItemsQueryVo vo) throws Exception {
		return itemsMapperCustom.selectItems(vo);
	}

}
