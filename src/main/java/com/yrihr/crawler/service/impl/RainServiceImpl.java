package com.yrihr.crawler.service.impl;

import cn.hutool.core.util.NumberUtil;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yrihr.crawler.entry.Rain;
import com.yrihr.crawler.mapper.RainMapper;
import com.yrihr.crawler.service.RainService;
import com.yrihr.crawler.vo.RainVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @ClassName : RiverServiceImpl
 * @Description :
 * @Author : ws
 * @Date: 2021-05-25 16:09
 * @Version 1.0
 */
@Service
@RequiredArgsConstructor
public class RainServiceImpl extends ServiceImpl<RainMapper, Rain> implements RainService {



    /**
     * 分页查询
     *
     * @param current
     * @param size
     * @param river
     * @return
     */
    @Override
    @DS("sharding1")
    public IPage<Rain> selectPage(long current, long size, RainVo river) {
        QueryWrapper<Rain> wrapper = new QueryWrapper();
        wrapper.orderByAsc("id");
        if (river != null && NumberUtil.isNumber(river.getFlows() + "")) {
            wrapper.ge("flows",river.getFlows());
        }
        Page<Rain> page = new Page<>(current, size);
        page = baseMapper.selectPage(page,wrapper);
        return page;
    }
}
