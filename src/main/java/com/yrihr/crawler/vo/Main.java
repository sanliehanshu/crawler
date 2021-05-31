package com.yrihr.crawler.vo;

import cn.hutool.core.util.RandomUtil;

/**
 * @ClassName : Main
 * @Description :
 * @Author : ws
 * @Date: 2021-05-31 16:58
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
        int random = RandomUtil.randomInt(1, 60);
        while (60 % random > 0) {
            System.out.println(random+"====="+60 % random);
            random = RandomUtil.randomInt(1, 60);
        }
        System.out.println("当前最新的随机数："+random);
    }
}
