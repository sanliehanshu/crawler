package com.yrihr.crawler.entry;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @ClassName : Common
 * @Description :
 * @Author : ws
 * @Date: 2021-05-11 16:10
 * @Version 1.0
 */
@Data
@TableName("t_common")
public class Common {
    private Long id;
    private String type;
}
