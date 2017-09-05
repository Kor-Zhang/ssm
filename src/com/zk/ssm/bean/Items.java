package com.zk.ssm.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Title:Items
 * <p>
 * Description:数据库ITEMS表对应的商品类
 * <p>
 * @author Kor_Zhang
 * @date 2017年9月5日 上午10:13:14
 * @version 1.0
 */
public class Items implements Serializable {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 4165816264738101623L;
	private String id;//主键id
	private String name;//商品名称
	private String description;//商品描述
	private Double price;//商品价格
	private Integer quantity;//商品数量
	private List<OrderDetail> orderDetails;//商品对应的订单详情
	public Items() {
		super();
	}
	public Items(String id, String name, String description, Double price,
			Integer quantity, List<OrderDetail> orderDetails) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.orderDetails = orderDetails;
	}
	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", description="
				+ description + ", price=" + price + ", quantity=" + quantity
				+ ", orderDetails=" + orderDetails + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}
	
}
