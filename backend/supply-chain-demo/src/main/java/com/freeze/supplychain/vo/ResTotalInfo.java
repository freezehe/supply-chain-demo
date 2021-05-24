package com.freeze.supplychain.vo;

import java.io.Serializable;

/**
 * <p>Title: ResTotalInfo</p>
 * <p>Description: </p>
 * @author he_jiebing@jiuyv.com
   @date   2021年4月25日 下午4:54:04
 */

public class ResTotalInfo implements Serializable{
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 5194145318788589782L;
	
	/**
	 * 平台总用户数
	 */
	private Integer totalUsers;
	/**
	 * 平台总链路数
	 */
	private Integer totalChains;

	public Integer getTotalUsers() {
		return totalUsers;
	}

	public void setTotalUsers(Integer totalUsers) {
		this.totalUsers = totalUsers;
	}

	public Integer getTotalChains() {
		return totalChains;
	}

	public void setTotalChains(Integer totalChains) {
		this.totalChains = totalChains;
	}
	
	
	
	

}
