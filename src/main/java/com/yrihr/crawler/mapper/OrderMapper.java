package com.yrihr.crawler.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yrihr.crawler.entry.Goods;
import com.yrihr.crawler.entry.Order;
import org.springframework.stereotype.Repository;

/**
 * @ClassName : TestMapper
 * @Description :
 * @Author : ws
 * @Date: 2021-05-08 09:20
 * @Version 1.0
 */
@Repository
public interface OrderMapper extends BaseMapper<Order> {
}
