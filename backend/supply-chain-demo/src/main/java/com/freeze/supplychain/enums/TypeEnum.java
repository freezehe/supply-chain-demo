 package com.freeze.supplychain.enums;

/**
 * <p>Title: TypeEnum</p>
 * <p>Description: </p>
 * @author he_jiebing@jiuyv.com
   @date   2021年4月24日 下午6:37:23
 */

public enum TypeEnum {
	
	EVIDENCE("evidence");
	
	private String type;
	
	TypeEnum(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
	
	
}
