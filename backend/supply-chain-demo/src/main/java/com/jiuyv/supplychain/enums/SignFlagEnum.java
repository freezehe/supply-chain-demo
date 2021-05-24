package com.jiuyv.supplychain.enums;

/**
 * <p>Title: SignEnum</p>
 * <p>Description: </p>
 * @author he_jiebing@jiuyv.com
   @date   2021年4月24日 下午6:23:50
 */

public enum SignFlagEnum {
	
	/**
	 * 未签名
	 */
	UNSIGN(0),
	/**
	 * 已签名
	 */
	SIGNED(1);
	
	private int signFlag;
	
	SignFlagEnum(int signFlag){
		this.signFlag = signFlag;
	}

	public int getSignFlag() {
		return signFlag;
	}
	
	

}
