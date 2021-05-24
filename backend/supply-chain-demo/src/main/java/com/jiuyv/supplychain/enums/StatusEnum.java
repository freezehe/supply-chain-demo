package com.jiuyv.supplychain.enums;

/**
 * <p>Title: StatusEnum</p>
 * <p>Description: </p>
 * @author he_jiebing@jiuyv.com
   @date   2021年4月24日 下午6:16:29
 */

public enum StatusEnum {
	
	/**
	 * 草稿
	 */
	DRAFT("draft"),
	
	/**
	 * 已确认
	 */
	CONFIRMED("confirmed");
	
	private String status;
	
	StatusEnum(String status){
        this.status = status;
    }

	public String getStatus() {
		return status;
	}
	

}
