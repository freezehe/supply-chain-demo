package com.jiuyv.supplychain.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jiuyv.supplychain.entity.ItemEntity;

/**
 * 
 * 
 * @author he_jiebing@jiuyv.com
 * @date 2021-04-20 15:58:29
 */
@Mapper
public interface ItemDao extends BaseMapper<ItemEntity> {

	/**
	 * 根据链ID查询供应商信息
	 * @param chainId
	 * @return
	 */
	List<ItemEntity> queryByChainId(@Param("chainId") Integer chainId);

	/**
	 * 查询供应商信息
	 * @param query
	 * @return
	 */
	ItemEntity queryInfo(ItemEntity query);
	
}
