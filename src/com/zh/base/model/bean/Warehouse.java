package com.zh.base.model.bean;

import com.zh.core.model.IDataObject;

/**
 * 
* @Title: Warehouse.java 
* @Package com.zh.base.model.bean 
* @Description: 仓库信息
* @date 2015年3月25日 下午7:32:36 
* @author taozhaoping 26078
* @author mail taozhaoping@gmail.com
* @version V1.0
 */
public class Warehouse extends IDataObject {

	private Integer id;
	
	/**
	 * 名称
	 */
	private String name;
	
	/**
	 * 地址
	 */
	private String address;
	
	/**
	 * 状态
	 */
	private Integer state;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}
	
	
}