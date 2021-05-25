package com.yrihr.crawler.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yrihr.crawler.entry.River;
import com.yrihr.crawler.vo.RiverVo;

/**
 * @ClassName : RiverService
 * @Description :
 * @Author : ws
 * @Date: 2021-05-25 15:58
 * @Version 1.0
 */
public interface RiverService extends IService<River> {

    /**
     * 保存
     * @param river
     * @return
     */
    Integer saveRiver(River river);

    /**
     * 分页查询
     * @param current
     * @param size
     * @param river
     * @return
     */
    IPage<River> selectPage(long current, long size, RiverVo river);
}
