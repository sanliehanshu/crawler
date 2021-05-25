package com.yrihr.crawler.entry;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 * @ClassName : Test
 * @Description :
 * @Author : ws
 * @Date: 2021-05-08 09:13
 * @Version 1.0
 */
@Data
public class Goods implements Serializable {


    private static final long serialVersionUID = -6332996061531597572L;

    @ApiModelProperty(value = "主键id")
    private Long id;

    @ApiModelProperty(value = "name")
    private String name;


    @ApiModelProperty(value = "用户id")
        private Integer userId;


    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

}
