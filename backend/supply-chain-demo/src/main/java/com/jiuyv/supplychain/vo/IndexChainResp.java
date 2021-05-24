package com.jiuyv.supplychain.vo;

import java.io.Serializable;
import java.util.List;

/**
 * <p>Title: IndexResp</p>
 * <p>Description: </p>
 * @author he_jiebing@jiuyv.com
   @date   2021年4月23日 下午4:57:42
 */

public class IndexChainResp implements Serializable{
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2824440759297963642L;
	/**
	 * 链ID
	 */
	private Integer chainId;
	/**
	 * 公司名
	 */
	private String orgName;
	/**
	 * 链名称
	 */
	private String title;
	/**
	 * 链描述
	 */
	private String desc;
	/**
	 * 状态
	 */
	private String status;
	/**
	 * 合约地址
	 */
	private String contractAddress;
	/**
	 * 证据key
	 */
	private String evidenceKey; 
	
	/**
	 * 供应商信息
	 */
	private List<IndexChainItemResp> itemList;
	
	public Integer getChainId() {
		return chainId;
	}

	public void setChainId(Integer chainId) {
		this.chainId = chainId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getContractAddress() {
		return contractAddress;
	}

	public void setContractAddress(String contractAddress) {
		this.contractAddress = contractAddress;
	}

	public String getEvidenceKey() {
		return evidenceKey;
	}

	public void setEvidenceKey(String evidenceKey) {
		this.evidenceKey = evidenceKey;
	}

	public List<IndexChainItemResp> getItemList() {
		return itemList;
	}

	public void setItemList(List<IndexChainItemResp> itemList) {
		this.itemList = itemList;
	}
	
	
	
	

}
