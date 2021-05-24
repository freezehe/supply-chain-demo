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
@TableName("contract")
public class ContractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键id
	 */
	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;
	/**
	 * 合约名称
	 */
	private String contractName;
	/**
	 * 合约地址
	 */
	private String addr;
	/**
	 * 合约类型
	 */
	private String type;
	/**
	 * 合约描述
	 */
	private String contractDescribe;
	/**
	 * 插入时间
	 */
	private Date insertedAt;
	/**
	 * 更新时间
	 */
	private Date updatedAt;
	/**
	 * 链ID
	 */
	private Integer chainId;
	/**
	 * 创建合约的用户did
	 */
	private String ownerDid;
	
	
	public String getContractName() {
		return contractName;
	}
	public void setContractName(String contractName) {
		this.contractName = contractName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getContractDescribe() {
		return contractDescribe;
	}
	public void setContractDescribe(String contractDescribe) {
		this.contractDescribe = contractDescribe;
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
	public Integer getChainId() {
		return chainId;
	}
	public void setChainId(Integer chainId) {
		this.chainId = chainId;
	}
	public String getOwnerDid() {
		return ownerDid;
	}
	public void setOwnerDid(String ownerDid) {
		this.ownerDid = ownerDid;
	}
	
	

}
