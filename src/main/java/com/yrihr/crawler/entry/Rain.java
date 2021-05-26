package com.yrihr.crawler.entry;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName : River
 * @Description :
 * @Author : ws
 * @Date: 2021-05-25 16:07
 * @Version 1.0
 */
@Data
public class Rain implements Serializable {

    private static final long serialVersionUID = -6332996061531597572L;

    @ApiModelProperty(value = "主键id")
    private Long id;

    @ApiModelProperty(value = "name")
    private String name;


    @ApiModelProperty(value = "用户id")
    private Integer flows;


    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
}
