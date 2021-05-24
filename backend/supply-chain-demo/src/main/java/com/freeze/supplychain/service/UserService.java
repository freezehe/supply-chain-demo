package com.freeze.supplychain.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.freeze.supplychain.common.R;
import com.freeze.supplychain.entity.UserEntity;
import com.freeze.supplychain.vo.LoginVO;
import com.freeze.supplychain.vo.RegisterVO;

/**
 * 
 *
 * @author he_jiebing@jiuyv.com
 * @date 2021-04-20 15:58:29
 */
public interface UserService extends IService<UserEntity> {
	
	/**
	 * 注册接口
	 * @param userEntity
	 * @return
	 */
	R register(RegisterVO registerVO);
	
	/**
	 * 登录
	 * @param loginVO
	 * @return
	 */
	R login(LoginVO loginVO);
	
	/**
	 * 获取用户信息
	 * @param userId
	 * @return
	 */
	R getUserInfo(Integer userId);
	
	/**
	 * 登出
	 * @return
	 */
	R logout();
	
	/**
	 * 获取首页未登陆信息数据
	 * @return
	 */
	R getTotalInfo();

}

