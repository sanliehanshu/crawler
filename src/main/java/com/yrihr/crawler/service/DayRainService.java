package com.yrihr.crawler.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yrihr.crawler.entry.DayRain;

/**
 * @ClassName : DayRainService
 * @Description :
 * @Author : ws
 * @Date: 2021-06-08 15:43
 * @Version 1.0
 */
public interface DayRainService extends IService<DayRain> {

    /**
     * 分表保存
     * @param dayRain
     * @return
     */
    Integer saveRiver(DayRain dayRain);
}
