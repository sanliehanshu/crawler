package com.yrihr.crawler.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yrihr.crawler.entry.DayRainSiteId;

import java.util.List;

/**
 * @ClassName : DayRainSiteIdMapper
 * @Description :
 * @Author : ws
 * @Date: 2021-06-08 15:14
 * @Version 1.0
 */
public interface DayRainSiteIdMapper extends BaseMapper<DayRainSiteId> {

    /**
     * 逐日站点id
     * @return
     */
    List<String> siteIdList();


    /**
     * 降摘站点id
     * @return
     */
    List<String> siteIdDayHourList();
}
