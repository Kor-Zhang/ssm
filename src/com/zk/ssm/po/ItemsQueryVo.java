package com.zk.ssm.po;


/**
 * Title:ItemsVo
 * <p>
 * Description:商品查询信息包装类
 * <p>
 * @author Kor_Zhang
 * @date 2017年9月5日 下午7:02:58
 * @version 1.0
 */
public class ItemsQueryVo{
	private Items item;
	
	private ItemsCustom itemsCustom;

	public Items getItem() {
		return item;
	}

	public void setItem(Items item) {
		this.item = item;
	}

	public ItemsCustom getItemsCustom() {
		return itemsCustom;
	}

	public void setItemsCustom(ItemsCustom itemsCustom) {
		this.itemsCustom = itemsCustom;
	}

	@Override
	public String toString() {
		return "ItemsVo [item=" + item + ", itemsCustom=" + itemsCustom + "]";
	}

	public ItemsQueryVo(Items item, ItemsCustom itemsCustom) {
		super();
		this.item = item;
		this.itemsCustom = itemsCustom;
	}

	public ItemsQueryVo() {
		super();
	}
	
	
}