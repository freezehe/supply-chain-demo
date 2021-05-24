package com.freeze.supplychain.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.freeze.supplychain.dao.ItemDao;
import com.freeze.supplychain.entity.ItemEntity;
import com.freeze.supplychain.service.ItemService;


@Service("itemService")
public class ItemServiceImpl extends ServiceImpl<ItemDao, ItemEntity> implements ItemService {

    

}