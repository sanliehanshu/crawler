package com.yrihr.crawler.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yrihr.crawler.entry.DayHourRain;
import com.yrihr.crawler.mapper.DayHourRainMapper;
import com.yrihr.crawler.service.DayHourRainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName : DayHourRainServiceImpl
 * @Description :
 * @Author : ws
 * @Date: 2021-06-09 09:39
 * @Version 1.0
 */
@Service
@RequiredArgsConstructor
public class DayHourRainServiceImpl  extends ServiceImpl<DayHourRainMapper, DayHourRain> implements DayHourRainService {
    /**
     * 分表保存
     *
     * @param dayHourRain
     * @return
     */
    @Override
    @DS("sharding")
    @Transactional(rollbackFor = Exception.class)
    public Integer saveRiver(DayHourRain dayHourRain) {
        return baseMapper.insert(dayHourRain);
    }
}
