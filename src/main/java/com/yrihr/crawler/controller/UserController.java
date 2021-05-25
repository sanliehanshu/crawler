package com.yrihr.crawler.controller;

import cn.hutool.core.util.RandomUtil;
import com.yrihr.crawler.entry.User;
import com.yrihr.crawler.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {


    private final UserService userService;

    @RequestMapping("/save")
    public ResponseBody saveUser(){
        for (int i = 0; i < 1000; i++) {
            User user = new User();
            user.setUserId(RandomUtil.randomInt(1,12000));
            user.setUsername(RandomUtil.randomString(10));
            userService.saveUser(user);
        }
        return null;
    }
}
