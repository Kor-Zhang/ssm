package com.zk.ssm.bean;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * Title:Orders
 * <p>
 * Description:数据库中ORDERS表对应的订单类
 * <p>
 * @author Kor_Zhang
 * @date 2017年9月5日 上午10:18:53
 * @version 1.0
 */
public class Orders implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2984717765186661547L;
	
	private String id;//主键id
	private Timestamp createTime;//创建时间
	private Integer status;//状态
	private Users user;//所属用户
	
	private List<OrderDetail> orderDetails;//订单对应的订单详情

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orders(String id, Timestamp createTime, Integer status, Users user,
			List<OrderDetail> orderDetails) {
		super();
		this.id = id;
		this.createTime = createTime;
		this.status = status;
		this.user = user;
		this.orderDetails = orderDetails;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", createTime=" + createTime + ", status="
				+ status + ", user=" + user + ", orderDetails=" + orderDetails
				+ "]";
	}
	
	
}
