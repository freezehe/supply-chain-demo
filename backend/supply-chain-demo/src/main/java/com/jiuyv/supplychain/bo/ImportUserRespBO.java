package com.jiuyv.supplychain.bo;

import java.io.Serializable;

/**
 * <p>Title: ImportUserRespBO</p>
 * <p>Description: </p>
 * @author he_jiebing@jiuyv.com
   @date   2021年4月21日 下午3:59:25
 */

public class ImportUserRespBO implements Serializable{
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -984324829223916785L;

	private String address;
	
	private String publicKey;
	
	private String privateKey;
	
	private String userName;
	
	private Integer type;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

	public String getPrivateKey() {
		return privateKey;
	}

	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
	
	
	
	

}
