package com.yrihr.crawler.entry;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @ClassName : Order
 * @Description :
 * @Author : ws
 * @Date: 2021-05-11 11:47
 * @Version 1.0
 */
@Data
@TableName("t_order")
public class Order {
    private Long id;
    private String name;
}
