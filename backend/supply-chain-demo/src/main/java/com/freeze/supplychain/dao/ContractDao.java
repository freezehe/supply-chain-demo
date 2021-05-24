package com.freeze.supplychain.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.freeze.supplychain.entity.ContractEntity;

/**
 * 
 * 
 * @author he_jiebing@jiuyv.com
 * @date 2021-04-20 15:58:29
 */
@Mapper
public interface ContractDao extends BaseMapper<ContractEntity> {

	/**
	 * 根据链ID查询合约信息
	 * @param chainId
	 * @return
	 */
	ContractEntity queryByChainId(@Param("chainId") Integer chainId);
	
}
