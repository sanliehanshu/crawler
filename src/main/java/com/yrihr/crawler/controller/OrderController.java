package com.yrihr.crawler.controller;

import cn.hutool.core.util.RandomUtil;
import com.yrihr.crawler.entry.Order;
import com.yrihr.crawler.mapper.OrderMapper;
import com.yrihr.crawler.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : GoodsController
 * @Description :
 * @Author : ws
 * @Date: 2021-05-26 15:52
 * @Version 1.0
 */
@Slf4j
@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;
    private final OrderMapper orderMapper;

    @PostMapping ("/update")
    public void update(){
        Order order = orderMapper.selectById(1397451767437324290L);
        order.setName(RandomUtil.randomString(10));
        Order order1 = orderMapper.selectById(1397451767437324290L);
        order1.setName(RandomUtil.randomString(10));
        Order order2 = orderMapper.selectById(1397451767437324290L);
        order2.setName(RandomUtil.randomString(10));
        orderMapper.updateById(order1);
        orderMapper.updateById(order2);
        orderMapper.updateById(order);
    }
}
