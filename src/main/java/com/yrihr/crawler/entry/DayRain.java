package com.yrihr.crawler.entry;

import com.fasterxml.jackson.annotation.JsonFormat;
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
public class DayRain implements Serializable {

    private static final long serialVersionUID = -6332996061531597572L;

    @ApiModelProperty(value = "主键id")
    private Long id;

    @ApiModelProperty(value = "站点id")
    private String siteId;

    @ApiModelProperty(value = "日降雨")
    private Double rainfall;

    @ApiModelProperty(value = "时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date time;

    @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updateTime;
}
