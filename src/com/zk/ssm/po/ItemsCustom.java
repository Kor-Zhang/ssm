package com.zk.ssm.po;


/**
 * Title:ItemsCustom
 * <p>
 * Description:商品信息拓展类
 * <p>
 * @author Kor_Zhang
 * @date 2017年9月5日 下午7:02:40
 * @version 1.0
 */
public class ItemsCustom extends Items{

	@Override
	public String toString() {
		return "ItemsCustom [getId()=" + getId() + ", getName()=" + getName()
				+ ", getDescription()=" + getDescription() + ", getPrice()="
				+ getPrice() + ", getQuantity()=" + getQuantity() + "]";
	}
	
	
    
}