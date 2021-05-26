package com.yrihr.crawler.service.impl;

import cn.hutool.core.util.RandomUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yrihr.crawler.entry.Order;
import com.yrihr.crawler.mapper.OrderMapper;
import com.yrihr.crawler.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName : OrderServiceImpl
 * @Description :
 * @Author : ws
 * @Date: 2021-05-26 16:17
 * @Version 1.0
 */
@Service
@RequiredArgsConstructor
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

    /**
     * 根据id修改Order
     *
     * @param id
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public Integer updateOrderById(Long id) {
        Order order = baseMapper.selectById(id);
        order.setName(RandomUtil.randomString(10));
        return baseMapper.updateById(order);
    }
}
