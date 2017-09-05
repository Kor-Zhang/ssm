package com.zk.ssm.bean;

import java.io.Serializable;

/**
 * Title:OrderDetail
 * <p>
 * Description:数据库中ORDERDETAIL表对映的订单详情类
 * <p>
 * @author Kor_Zhang
 * @date 2017年9月5日 上午10:23:05
 * @version 1.0
 */
public class OrderDetail implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -7614909649042976729L;

	private Orders order;//订单
	private Items item;//商品
	private Integer quantity;//数量
	private Double price;//价格
	public Orders getOrder() {
		return order;
	}
	public void setOrder(Orders order) {
		this.order = order;
	}
	public Items getItem() {
		return item;
	}
	public void setItem(Items item) {
		this.item = item;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public OrderDetail() {
		super();
	}
	public OrderDetail(Orders order, Items item, Integer quantity, Double price) {
		super();
		this.order = order;
		this.item = item;
		this.quantity = quantity;
		this.price = price;
	}
	@Override
	public String toString() {
		return "OrderDetail [order=" + order + ", item=" + item + ", quantity="
				+ quantity + ", price=" + price + "]";
	}
	
	
}
