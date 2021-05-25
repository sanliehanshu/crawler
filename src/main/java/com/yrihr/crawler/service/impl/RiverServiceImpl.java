package com.yrihr.crawler.service.impl;

import cn.hutool.core.util.NumberUtil;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yrihr.crawler.entry.River;
import com.yrihr.crawler.mapper.RiverMapper;
import com.yrihr.crawler.service.RiverService;
import com.yrihr.crawler.vo.RiverVo;
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
public class RiverServiceImpl extends ServiceImpl<RiverMapper, River> implements RiverService {


    /**
     * 保存
     *
     * @param river
     * @return
     */
    @Override
    @DS("sharding")
    public Integer saveRiver(River river) {
        return baseMapper.insert(river);
    }

    /**
     * 分页查询
     *
     * @param current
     * @param size
     * @param river
     * @return
     */
    @Override
    @DS("sharding")
    public IPage<River> selectPage(long current, long size, RiverVo river) {
        QueryWrapper<River> wrapper = new QueryWrapper();
        wrapper.orderByAsc("id");
        if (river != null && NumberUtil.isNumber(river.getFlows() + "")) {
            wrapper.ge("flows",river.getFlows());
        }
        Page<River> page = new Page<>(current, size);
        page = baseMapper.selectPage(page,wrapper);
        return page;
    }
}
