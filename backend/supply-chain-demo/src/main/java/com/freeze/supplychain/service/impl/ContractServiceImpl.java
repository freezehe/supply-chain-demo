package com.freeze.supplychain.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.freeze.supplychain.dao.ContractDao;
import com.freeze.supplychain.entity.ContractEntity;
import com.freeze.supplychain.service.ContractService;



@Service("contractService")
public class ContractServiceImpl extends ServiceImpl<ContractDao, ContractEntity> implements ContractService {

   

}