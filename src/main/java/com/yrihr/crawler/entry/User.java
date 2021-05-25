package com.yrihr.crawler.entry;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName : User
 * @Description :
 * @Author : ws
 * @Date: 2021-05-11 10:24
 * @Version 1.0
 */

@Data
@TableName("t_user")
public class User implements Serializable {
    private static final long serialVersionUID = 1036349637578097500L;

    private Long id;
    private String username;
    private Integer userId;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
}
