package com.yrihr.crawler;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.TimeInterval;
import cn.hutool.core.util.RandomUtil;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yrihr.crawler.entry.Common;
import com.yrihr.crawler.entry.Goods;
import com.yrihr.crawler.entry.Order;
import com.yrihr.crawler.entry.User;
import com.yrihr.crawler.mapper.CommonMapper;
import com.yrihr.crawler.mapper.OrderMapper;
import com.yrihr.crawler.mapper.TestMapper;

import com.yrihr.crawler.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CrawlerApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    TestMapper testMapper;

    @Autowired
    UserMapper userMapper;

    @Autowired
    OrderMapper orderMapper;

    @Autowired
    CommonMapper commonMapper;

    @Test
    void addTest(){
        for (int i = 0; i < 10000000; i++) {
        Goods test = new Goods();
        test.setName(RandomUtil.randomString(10));
        test.setUserId(RandomUtil.randomInt(1,40000000));
        testMapper.insert(test);
        }
    }

    @Test
    void addTest2(){
        for (int i = 0; i < 10000000; i++) {
            Goods test = new Goods();
            test.setName(RandomUtil.randomString(10));
            test.setUserId(RandomUtil.randomInt(1,40000000));
            testMapper.insert(test);
        }
    }

    @Test
    void addTest3(){
        for (int i = 0; i < 10000000; i++) {
            Goods test = new Goods();
            test.setName(RandomUtil.randomString(10));
            test.setUserId(RandomUtil.randomInt(1,40000000));
            testMapper.insert(test);
        }
    }

    @Test
    void addTest4(){
        for (int i = 0; i < 10000000; i++) {
            Goods test = new Goods();
            test.setName(RandomUtil.randomString(10));
            test.setUserId(RandomUtil.randomInt(1,40000000));
            testMapper.insert(test);
        }
    }

    @Test
    void addTest5(){
        for (int i = 0; i < 10000000; i++) {
            Goods test = new Goods();
            test.setName(RandomUtil.randomString(10));
            test.setUserId(RandomUtil.randomInt(1,40000000));
            testMapper.insert(test);
        }
    }

    @Test
    void addTest6(){
        for (int i = 0; i < 10000000; i++) {
            Goods test = new Goods();
            test.setName(RandomUtil.randomString(10));
            test.setUserId(RandomUtil.randomInt(1,40000000));
            testMapper.insert(test);
        }
    }

    @Test
    void addTest7(){
        for (int i = 0; i < 10000000; i++) {
            Goods test = new Goods();
            test.setName(RandomUtil.randomString(10));
            test.setUserId(RandomUtil.randomInt(1,40000000));
            testMapper.insert(test);
        }
    }

    @Test
    void addTest8(){
        for (int i = 0; i < 10000000; i++) {
            Goods test = new Goods();
            test.setName(RandomUtil.randomString(10));
            test.setUserId(RandomUtil.randomInt(1,40000000));
            testMapper.insert(test);
        }
    }

    @Test
    void addTest9(){
        for (int i = 0; i < 10000000; i++) {
            Goods test = new Goods();
            test.setName(RandomUtil.randomString(10));
            test.setUserId(RandomUtil.randomInt(1,40000000));
            testMapper.insert(test);
        }
    }

    @Test
    void deleteTest(){
        QueryWrapper<Goods> queryWrapper = new QueryWrapper<>();
        queryWrapper.ge("user_id",0);
        testMapper.delete(queryWrapper);
    }

    @Test
    void getTest(){
        QueryWrapper<Goods> queryWrapper = new QueryWrapper<>();
//        queryWrapper.ge("user_id",10000000/2);
//        queryWrapper.eq("user_id",30178138);
        TimeInterval timer = DateUtil.timer();
        queryWrapper.orderByDesc("id");
        queryWrapper.last("limit 0,20");
        List<Goods> goods = testMapper.selectList(queryWrapper);
        System.out.println(goods.size());
        System.out.println("花费时间："+timer.interval());
    }

    @Test
    void addUser(){
        for (int i = 0; i < 10; i++) {
            User test = new User();
            test.setUsername(RandomUtil.randomString(10));
            test.setUserId(RandomUtil.randomInt(1,10000));
            userMapper.insert(test);
        }
    }

    @Test
    void addOrder(){
        for (int i = 0; i < 10; i++) {
            Order test = new Order();
            test.setName(RandomUtil.randomString(10));
            orderMapper.insert(test);
        }
    }

    @Test
    void getUser(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.ge("user_id","6092");
        List<User> goods = userMapper.selectList(queryWrapper);
        for (int i = 0; i < goods.size(); i++) {
            System.out.println(goods.get(i).toString());
        }
    }


    @Test
    void addCommon(){
        for (int i = 0; i < 10; i++) {
            Common test = new Common();
            test.setType(RandomUtil.randomString(10));
            commonMapper.insert(test);
        }
    }

}
