package com.freeze.supplychain.vo;

import java.io.Serializable;

/**
 * <p>Title: IndexChainItemResp</p>
 * <p>Description: </p>
 * @author he_jiebing@jiuyv.com
   @date   2021年4月23日 下午5:01:06
 */

public class IndexChainItemResp implements Serializable{
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -8424454239281972402L;

	/**
	 * 参与者角色
	 */
	private String role;
	
	/**
	 * 参与者公司名
	 */
	private String participaterOrgName;
	/**
	 * 参与者数字身份
	 */
	private String participaterDidId;
	/**
	 * 参与者分成比例
	 */
	private Integer portion;
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getParticipaterOrgName() {
		return participaterOrgName;
	}
	public void setParticipaterOrgName(String participaterOrgName) {
		this.participaterOrgName = participaterOrgName;
	}
	public String getParticipaterDidId() {
		return participaterDidId;
	}
	public void setParticipaterDidId(String participaterDidId) {
		this.participaterDidId = participaterDidId;
	}
	public Integer getPortion() {
		return portion;
	}
	public void setPortion(Integer portion) {
		this.portion = portion;
	}
	
	

}
