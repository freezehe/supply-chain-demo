package com.freeze.supplychain.vo;

import java.io.Serializable;

/**
 * <p>Title: ResQueryRole</p>
 * <p>Description: </p>
 * @author he_jiebing@jiuyv.com
   @date   2021年4月25日 下午1:45:55
 */

public class ResQueryRole implements Serializable{
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -3729999213247765230L;
	
	/**
	 * 角色
	 */
	private String role;
	/**
	 * 参与方id
	 */
	private Integer participaterId;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Integer getParticipaterId() {
		return participaterId;
	}

	public void setParticipaterId(Integer participaterId) {
		this.participaterId = participaterId;
	}
	
	

}
