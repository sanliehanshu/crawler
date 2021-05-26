package com.yrihr.crawler.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yrihr.crawler.entry.Rain;
import com.yrihr.crawler.vo.RainVo;

/**
 * @ClassName : RiverService
 * @Description :
 * @Author : ws
 * @Date: 2021-05-25 15:58
 * @Version 1.0
 */
public interface RainService extends IService<Rain> {

    /**
     * 分页查询
     * @param current
     * @param size
     * @param river
     * @return
     */
    IPage<Rain> selectPage(long current, long size, RainVo river);
}
