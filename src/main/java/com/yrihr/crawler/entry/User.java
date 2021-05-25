package com.yrihr.crawler.entry;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @ClassName : User
 * @Description :
 * @Author : ws
 * @Date: 2021-05-11 10:24
 * @Version 1.0
 */

@Data
@TableName("t_user")
public class User {
    private Long id;
    private String username;
    private Integer userId;
}
