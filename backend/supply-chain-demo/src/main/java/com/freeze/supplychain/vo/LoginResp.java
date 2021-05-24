package com.freeze.supplychain.vo;

import java.io.Serializable;

/**
 * <p>Title: LoginResp</p>
 * <p>Description: </p>
 * @author he_jiebing@jiuyv.com
   @date   2021年4月23日 下午4:49:52
 */

public class LoginResp implements Serializable{
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 4440655140010457080L;
	/**
	 * 用户id
	 */
	private Integer userId;
	
	/**
	 * 参与者id
	 */
	private Integer participaterId;
	
	

	public Integer getParticipaterId() {
		return participaterId;
	}

	public void setParticipaterId(Integer participaterId) {
		this.participaterId = participaterId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	

}
