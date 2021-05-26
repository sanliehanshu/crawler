package com.yrihr.crawler.controller;

import cn.hutool.core.util.NumberUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yrihr.crawler.dto.GoodsDto;
import com.yrihr.crawler.entry.Goods;
import com.yrihr.crawler.mapper.GoodsMapper;
import com.yrihr.crawler.service.GoodsService;
import com.yrihr.crawler.vo.GoodsVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName : GoodsController
 * @Description :
 * @Author : ws
 * @Date: 2021-05-26 15:52
 * @Version 1.0
 */
@Slf4j
@RestController
@RequestMapping("/api/goods")
@RequiredArgsConstructor
public class GoodsController {

    private final GoodsService goodsService;
    private final GoodsMapper goodsMapper;

    @RequestMapping("/selectPage")
    public ResponseEntity selectPage(@RequestBody GoodsDto dto){
        if (dto != null && NumberUtil.isNumber(dto.getUserId() + "")) {
            long current = dto.getCurrent();
            long size = dto.getSize();
            GoodsVo goodsVo = new GoodsVo();
            goodsVo.setUserId(dto.getUserId());
            IPage<Goods> goodsIPage = goodsService.selectPage(current, size, goodsVo);
            if (goodsIPage != null && goodsIPage.getRecords().size() > 0) {
                return ResponseEntity.ok(goodsIPage);
            } else {
                return (ResponseEntity) ResponseEntity.EMPTY;
            }
        } else {
            return (ResponseEntity) ResponseEntity.badRequest();
        }
    }


    @RequestMapping("/selectList")
    public ResponseEntity selectPage(){
        QueryWrapper<Goods> wrapper = new QueryWrapper<>();
        wrapper.eq("create_time","2021-05-26 09:56:48");
        List<Goods> goods = goodsMapper.selectList(wrapper);
        return ResponseEntity.ok(goods);

    }
}
