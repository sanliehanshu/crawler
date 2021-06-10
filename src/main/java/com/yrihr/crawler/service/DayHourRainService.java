package com.yrihr.crawler.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yrihr.crawler.entry.DayHourRain;

/**
 * @ClassName : DayHourRainService
 * @Description :
 * @Author : ws
 * @Date: 2021-06-09 09:39
 * @Version 1.0
 */
public interface DayHourRainService extends IService<DayHourRain> {

    /**
     * 分表保存
     * @param dayHourRain
     * @return
     */
    Integer saveRiver(DayHourRain dayHourRain);
}
