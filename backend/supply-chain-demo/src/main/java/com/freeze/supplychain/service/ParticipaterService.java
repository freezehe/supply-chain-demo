package com.freeze.supplychain.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.freeze.supplychain.common.R;
import com.freeze.supplychain.entity.ParticipaterEntity;

/**
 * 
 *
 * @author he_jiebing@jiuyv.com
 * @date 2021-04-20 15:58:29
 */
public interface ParticipaterService extends IService<ParticipaterEntity> {
	
	/**
	 * 获取所有参与者
	 * @return
	 */
	R queryAll();

}

