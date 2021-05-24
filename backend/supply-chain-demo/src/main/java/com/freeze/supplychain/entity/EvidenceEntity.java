package com.freeze.supplychain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author hejiebing
 * @email 18817326785@163.com
 * @date 2021-04-20 15:58:29
 */
@TableName("evidence")
public class EvidenceEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键id
	 */
	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;
	/**
	 * 存证key
	 */
	private String evidenceKey;
	/**
	 * 存证value
	 */
	private String evidenceValue;
	/**
	 * 存证描述
	 */
	private String evidenceDescribe;
	/**
	 * 智能合约id
	 */
	private Integer contractId;
	/**
	 * 存证所有供应方
	 */
	private String owners;
	/**
	 * 插入时间
	 */
	private Date insertedAt;
	/**
	 * 更新时间
	 */
	private Date updatedAt;
	/**
	 * 交易hash
	 */
	private String txId;
	/**
	 * 已签名的供应商
	 */
	private String signers;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	public String getEvidenceKey() {
		return evidenceKey;
	}
	public void setEvidenceKey(String evidenceKey) {
		this.evidenceKey = evidenceKey;
	}
	public String getEvidenceValue() {
		return evidenceValue;
	}
	public void setEvidenceValue(String evidenceValue) {
		this.evidenceValue = evidenceValue;
	}
	public String getEvidenceDescribe() {
		return evidenceDescribe;
	}
	public void setEvidenceDescribe(String evidenceDescribe) {
		this.evidenceDescribe = evidenceDescribe;
	}
	public Integer getContractId() {
		return contractId;
	}
	public void setContractId(Integer contractId) {
		this.contractId = contractId;
	}
	public Date getInsertedAt() {
		return insertedAt;
	}
	public void setInsertedAt(Date insertedAt) {
		this.insertedAt = insertedAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getTxId() {
		return txId;
	}
	public void setTxId(String txId) {
		this.txId = txId;
	}
	public String getOwners() {
		return owners;
	}
	public void setOwners(String owners) {
		this.owners = owners;
	}
	public String getSigners() {
		return signers;
	}
	public void setSigners(String signers) {
		this.signers = signers;
	}
	
	
	

}
