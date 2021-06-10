package com.yrihr.crawler.entry;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName : DayHourRain
 * @Description :
 * @Author : ws
 * @Date: 2021-06-09 09:34
 * @Version 1.0
 */
@Data
public class DayHourRain implements Serializable {
    private static final long serialVersionUID = 1260104159161079476L;

    private Long id;
    private Double rainfall;
    private Date startTime;
    private Date endTime;
    private String siteId;
    private Date createTime;
    private Date updateTime;
}
