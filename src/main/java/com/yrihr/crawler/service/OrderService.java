package com.yrihr.crawler.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yrihr.crawler.entry.Order;

/**
 * @ClassName : OrderService
 * @Description :
 * @Author : ws
 * @Date: 2021-05-26 16:17
 * @Version 1.0
 */
public interface OrderService extends IService<Order> {

    /**
     * 根据id修改Order
     * @param id
     * @return
     */
    Integer updateOrderById(Long id);
}
