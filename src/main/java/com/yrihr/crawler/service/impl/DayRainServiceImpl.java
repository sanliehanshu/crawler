package com.yrihr.crawler.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yrihr.crawler.entry.DayRain;
import com.yrihr.crawler.mapper.DayRainMapper;
import com.yrihr.crawler.service.DayRainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName : DayRainServiceImpl
 * @Description :
 * @Author : ws
 * @Date: 2021-06-08 15:43
 * @Version 1.0
 */
@Service
@RequiredArgsConstructor
public class DayRainServiceImpl extends ServiceImpl<DayRainMapper, DayRain> implements DayRainService {

    /**
     * 分表保存
     *
     * @param dayRain
     * @return
     */
    @Override
    @DS("sharding")
    @Transactional(rollbackFor = Exception.class)
    public Integer saveRiver(DayRain dayRain) {
        return baseMapper.insert(dayRain);
    }
}
