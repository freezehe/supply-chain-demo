package com.jiuyv.supplychain.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jiuyv.supplychain.dao.ItemDao;
import com.jiuyv.supplychain.entity.ItemEntity;
import com.jiuyv.supplychain.service.ItemService;


@Service("itemService")
public class ItemServiceImpl extends ServiceImpl<ItemDao, ItemEntity> implements ItemService {

    

}