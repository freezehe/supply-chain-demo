package com.freeze.supplychain.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.freeze.supplychain.common.R;
import com.freeze.supplychain.dao.ParticipaterDao;
import com.freeze.supplychain.entity.ParticipaterEntity;
import com.freeze.supplychain.service.ParticipaterService;

/**
 * 
* <p>Title: ParticipaterServiceImpl</p>
* <p>Description: </p>
* @author he_jiebing@jiuyv.com
  @date   2021年5月24日 上午11:35:17
 */

@Service("participaterService")
public class ParticipaterServiceImpl extends ServiceImpl<ParticipaterDao, ParticipaterEntity> implements ParticipaterService {

	@Autowired
	private ParticipaterDao participaterDao;
	
	@Override
	public R queryAll() {
		List<ParticipaterEntity> list = participaterDao.queryAll();
		return R.ok(list);
	}
}