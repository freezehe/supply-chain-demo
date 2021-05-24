package com.jiuyv.supplychain.vo;

import java.util.List;

/**
 * <p>Title: ResSignList</p>
 * <p>Description: </p>
 * @author he_jiebing@jiuyv.com
   @date   2021年4月23日 下午5:43:20
 */

public class ResSignList {
	/**
	 * 链id
	 */
	private Integer chainId;
	/**
	 * 链名称
	 */
	private String title;
	
	/**
	 * 角色list
	 */
	private List<ResQueryRole> roles;

	public Integer getChainId() {
		return chainId;
	}

	public void setChainId(Integer chainId) {
		this.chainId = chainId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<ResQueryRole> getRoles() {
		return roles;
	}

	public void setRoles(List<ResQueryRole> roles) {
		this.roles = roles;
	}

	
	
	

}
