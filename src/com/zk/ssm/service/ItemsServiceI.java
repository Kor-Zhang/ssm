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
	
	
	
	/**
	 * Title:selectAItem
	 * <p>
	 * Description:通过主键获取一个item
	 * <p>
	 * @author Kor_Zhang
	 * @date 2017年9月6日 上午8:41:26
	 * @version 1.0
	 * @param id
	 * @return
	 */
	public ItemsCustom selectAItem(String id) throws Exception;
	
	
	
	
	/**
	 * Title:updateAItem
	 * <p>
	 * Description:通过updateAItem的id修改商品
	 * <p>
	 * @author Kor_Zhang
	 * @date 2017年9月6日 上午8:45:13
	 * @version 1.0
	 * @param id
	 * @param itemCustom
	 * @throws Exception 
	 */
	public void updateAItem(String id,ItemsCustom itemCustom) throws Exception;
}
