package com.jiuyv.supplychain.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jiuyv.supplychain.dao.ContractDao;
import com.jiuyv.supplychain.entity.ContractEntity;
import com.jiuyv.supplychain.service.ContractService;



@Service("contractService")
public class ContractServiceImpl extends ServiceImpl<ContractDao, ContractEntity> implements ContractService {

   

}