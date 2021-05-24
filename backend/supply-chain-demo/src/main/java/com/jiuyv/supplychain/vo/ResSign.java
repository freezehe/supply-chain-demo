package com.jiuyv.supplychain.vo;

import java.io.Serializable;

/**
 * <p>Title: ResSign</p>
 * <p>Description: </p>
 * @author he_jiebing@jiuyv.com
   @date   2021年4月25日 下午12:40:06
 */

public class ResSign implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -7444495267581574228L;
	
	/**
	 * 交易hash
	 */
	private String txHash;

	public String getTxHash() {
		return txHash;
	}

	public void setTxHash(String txHash) {
		this.txHash = txHash;
	}
	
	

}
