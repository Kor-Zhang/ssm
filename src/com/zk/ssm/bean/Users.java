package com.zk.ssm.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Title:Users
 * <p>
 * Description:数据库USERS表对应的用户类
 * <p>
 * @author Kor_Zhang
 * @date 2017年9月5日 上午10:15:32
 * @version 1.0
 */
public class Users implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 4064939759541428128L;
	
	
	private String id;//id
	private String username;//名称
	private String password;//密码
	private List<Orders> orders;//用户所属订单
	@Override
	public String toString() {
		return "Users [id=" + id + ", username=" + username + ", password="
				+ password + ", orders=" + orders + "]";
	}
	public Users(String id, String username, String password,
			List<Orders> orders) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.orders = orders;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Orders> getOrders() {
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	
}
