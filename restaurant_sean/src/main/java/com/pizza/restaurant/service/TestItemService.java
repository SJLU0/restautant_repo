package com.pizza.restaurant.service;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pizza.restaurant.entity.TestItem;
import com.pizza.restaurant.mapper.TestItemMapper;
import org.springframework.stereotype.Service;

@Service
public class TestItemService extends ServiceImpl<TestItemMapper, TestItem> {
}

