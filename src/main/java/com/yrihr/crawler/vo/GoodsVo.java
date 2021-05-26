package com.yrihr.crawler.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName : GoodsVo
 * @Description :
 * @Author : ws
 * @Date: 2021-05-26 15:58
 * @Version 1.0
 */
@Data
public class GoodsVo implements Serializable {
    private static final long serialVersionUID = -8564718290897704824L;

    @ApiModelProperty(value = "name")
    private String name;

    @ApiModelProperty(value = "用户id")
    private Integer userId;
}
