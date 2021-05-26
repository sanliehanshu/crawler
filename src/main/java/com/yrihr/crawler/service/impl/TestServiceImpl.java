package com.yrihr.crawler.service.impl;

import cn.hutool.core.util.NumberUtil;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yrihr.crawler.entry.Test;
import com.yrihr.crawler.mapper.TestMapper;
import com.yrihr.crawler.service.TestService;
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
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements TestService {


    /**
     * 保存
     *
     * @param river
     * @return
     */
    @Override
    @DS("sharding")
    public Integer saveRiver(Test river) {
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
    public IPage<Test> selectPage(long current, long size, RiverVo river) {
        QueryWrapper<Test> wrapper = new QueryWrapper();
        wrapper.orderByAsc("id");
        if (river != null && NumberUtil.isNumber(river.getFlows() + "")) {
            wrapper.ge("flows",river.getFlows());
        }
        Page<Test> page = new Page<>(current, size);
        page = baseMapper.selectPage(page,wrapper);
        return page;
    }
}
