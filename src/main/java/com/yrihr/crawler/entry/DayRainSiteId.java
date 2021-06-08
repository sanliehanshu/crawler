package com.yrihr.crawler.entry;

import lombok.Data;

/**
 * @ClassName : DayRainSiteId
 * @Description : 主要作用是根据HH_DAYPP唯一id分批次查询HH_DAYPP信息保存到分库的mysql里
 * @Author : ws
 * @Date: 2021-06-08 15:04
 * @Version 1.0
 */
@Data
public class DayRainSiteId {

    private String siteId;
}
