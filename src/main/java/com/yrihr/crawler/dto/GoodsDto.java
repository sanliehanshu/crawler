package com.yrihr.crawler.dto;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName : GoodsDto
 * @Description :
 * @Author : ws
 * @Date: 2021-05-26 17:42
 * @Version 1.0
 */
@Data
public class GoodsDto extends Page implements Serializable {
    private static final long serialVersionUID = 6674030270910516085L;


    private Integer userId;
}
