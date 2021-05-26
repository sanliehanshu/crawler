package com.yrihr.crawler.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yrihr.crawler.entry.Goods;
import com.yrihr.crawler.vo.GoodsVo;

/**
 * @ClassName : GoodsService
 * @Description :
 * @Author : ws
 * @Date: 2021-05-26 15:49
 * @Version 1.0
 */
public interface GoodsService extends IService<Goods> {

    /**
     * 分页
     * @param currentPage 当前为第几页
     * @param pageSize 每页显示几个
     * @return
     */
    IPage<Goods> selectPage(long currentPage, long pageSize, GoodsVo goodsVo);
}
