package com.yrihr.crawler.service.impl;

import cn.hutool.core.util.NumberUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yrihr.crawler.entry.Goods;
import com.yrihr.crawler.mapper.GoodsMapper;
import com.yrihr.crawler.service.GoodsService;
import com.yrihr.crawler.vo.GoodsVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @ClassName : GoodsServiceImpl
 * @Description :
 * @Author : ws
 * @Date: 2021-05-26 15:51
 * @Version 1.0
 */
@Service
@RequiredArgsConstructor
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {
    /**
     * @param currentPage 当前为第几页
     * @param pageSize    每页显示几个
     * @return
     */
    @Override
    public IPage<Goods> selectPage(long currentPage, long pageSize, GoodsVo goodsVo) {
        QueryWrapper<Goods> wrapper = new QueryWrapper<>();
        if (goodsVo != null && NumberUtil.isNumber(goodsVo.getUserId() + "")) {
            //对应InlineShardingStrategy。使用Groovy的表达式，提供对SQL语句中的=和IN的分片操作支持，只支持单分片键。对于简单的分片算法，
            // 可以通过简单的配置使用，从而避免繁琐的Java代码开发，如: t_user_$->{u_id % 8} 表示t_user表根据u_id模8，而分成8张表，表名称为t_user_0到t_user_7。
//            wrapper.ge("user_id", 0);
            wrapper.eq("create_time", "2021-05-26 09:56:48");
        }
        Page<Goods> page = new Page<>(currentPage, pageSize);
        page = baseMapper.selectPage(page, wrapper);
        return page;
    }
}
