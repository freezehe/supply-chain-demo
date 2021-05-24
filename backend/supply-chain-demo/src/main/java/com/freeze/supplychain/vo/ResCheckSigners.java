package com.freeze.supplychain.vo;

import java.io.Serializable;
import java.util.List;

/**
 * <p>Title: ResCheckSigners</p>
 * <p>Description: </p>
 * @author he_jiebing@jiuyv.com
   @date   2021年4月25日 上午11:07:22
 */

public class ResCheckSigners implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -4111179933805664520L;
	
	/**
	 * 已签名的
	 */
	private List<String> signedOrgNames;
	/**
	 * 需要签名的
	 */
	private List<String> needSignOrgNames;

	public List<String> getSignedOrgNames() {
		return signedOrgNames;
	}

	public void setSignedOrgNames(List<String> signedOrgNames) {
		this.signedOrgNames = signedOrgNames;
	}

	public List<String> getNeedSignOrgNames() {
		return needSignOrgNames;
	}

	public void setNeedSignOrgNames(List<String> needSignOrgNames) {
		this.needSignOrgNames = needSignOrgNames;
	}
	
	

}
