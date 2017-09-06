package com.zk.ssm.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.zk.ssm.mapper.ItemsMapper;
import com.zk.ssm.mapper.ItemsMapperCustom;
import com.zk.ssm.po.Items;
import com.zk.ssm.po.ItemsCustom;
import com.zk.ssm.po.ItemsQueryVo;
import com.zk.ssm.service.ItemsServiceI;
import com.zk.ssm.util.Util;

public class ItemsService implements ItemsServiceI {
	
	@Autowired
	private ItemsMapperCustom itemsMapperCustom;
	
	@Autowired
	private ItemsMapper itemsMapper;
	

	/* (non-Javadoc)
	 * @see com.zk.ssm.service.ItemsServiceI#selectAItem(java.lang.String)
	 */
	@Override
	public ItemsCustom selectAItem(String id) {
		
		Items item = itemsMapper.selectByPrimaryKey(id);
		
		ItemsCustom itemc = new ItemsCustom();
		
		BeanUtils.copyProperties(item, itemc);
		
//		return (ItemsCustom) itemsMapper.selectByPrimaryKey(id);
		return itemc;
	}


	/* (non-Javadoc)
	 * @see com.zk.ssm.service.ItemsServiceI#selectItems(com.zk.ssm.po.ItemsQueryVo)
	 */
	@Override
	public List<ItemsCustom> selectItems(ItemsQueryVo vo) throws Exception {
		return itemsMapperCustom.selectItems(vo);
	}


	/* (non-Javadoc)
	 * @see com.zk.ssm.service.ItemsServiceI#updateAItem(java.lang.String, com.zk.ssm.po.ItemsCustom)
	 */
	@Override
	public void updateAItem(String id, ItemsCustom itemCustom) throws Exception {
		
		Util.eject(id == null || id.equals(""), "id不能为空");
		
		itemCustom.setId(id);
		
		itemsMapper.updateByPrimaryKeySelective(itemCustom);
		
	}


	

}
