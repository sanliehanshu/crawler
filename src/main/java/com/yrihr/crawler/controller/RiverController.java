package com.yrihr.crawler.controller;

import cn.hutool.core.util.RandomUtil;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yrihr.crawler.dto.RainDto;
import com.yrihr.crawler.dto.RiverDto;
import com.yrihr.crawler.entry.Rain;
import com.yrihr.crawler.entry.River;
import com.yrihr.crawler.service.RainService;
import com.yrihr.crawler.service.RiverService;
import com.yrihr.crawler.vo.RainVo;
import com.yrihr.crawler.vo.RiverVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : RiverController
 * @Description :
 * @Author : ws
 * @Date: 2021-05-25 16:29
 * @Version 1.0
 */
@Slf4j
@RestController
@RequestMapping("/api/river")
@RequiredArgsConstructor
public class RiverController {


    private final RiverService riverService;
    private final RainService rainService;

    @RequestMapping("/save")
    public ResponseEntity saveRiver(){
        for (int i = 0; i < 1000; i++) {
            River river = new River();
            river.setFlows(RandomUtil.randomInt(1,12000));
            river.setName(RandomUtil.randomString(10));
            riverService.saveRiver(river);
        }
        return null;
    }

    /**
     * 经过测试分表对分页没有影响
     * @param river
     * @return
     */
    @RequestMapping("/selectRiverPage")
    public ResponseEntity selectRiverPage(@RequestBody RiverDto river){
        if (river != null) {
            long current = river.getCurrent();
            long size = river.getSize();
            RiverVo riverVo = new RiverVo();
            riverVo.setFlows(river.getFlows());
            IPage<River> riverIPage = riverService.selectPage(current, size, riverVo);
            if (riverIPage != null) {
                return ResponseEntity.ok(riverIPage);
            } else {
                return (ResponseEntity) ResponseEntity.EMPTY;
            }
        } else {
            return (ResponseEntity) ResponseEntity.badRequest();
        }
    }

    /**
     * 分库存储指定数据源分页 经过测试没有问题
     * @param rainDto
     * @return
     */
    @RequestMapping("/selectRainPage")
    public ResponseEntity selectRainPage(@RequestBody RainDto rainDto){
        if (rainDto != null) {
            long current = rainDto.getCurrent();
            long size = rainDto.getSize();
            RainVo rainVo = new RainVo();
            rainVo.setFlows(rainDto.getFlows());
            IPage<Rain> riverIPage = rainService.selectPage(current, size, rainVo);
            if (riverIPage != null) {
                return ResponseEntity.ok(riverIPage);
            } else {
                return (ResponseEntity) ResponseEntity.EMPTY;
            }
        } else {
            return (ResponseEntity) ResponseEntity.badRequest();
        }
    }
}
