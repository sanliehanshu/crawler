package com.yrihr.crawler.dto;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

/**
 * @ClassName : RiverDto
 * @Description :
 * @Author : ws
 * @Date: 2021-05-25 17:40
 * @Version 1.0
 */
@Data
public class RiverDto extends Page {
    private Integer flows;
}
