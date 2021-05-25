package com.yrihr.crawler.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yrihr.crawler.entry.User;

/**
 * @ClassName : UserService
 * @Description :
 * @Author : ws
 * @Date: 2021-05-25 15:58
 * @Version 1.0
 */
public interface UserService extends IService<User> {

    /**
     *
     * @param user
     * @return
     */
    Integer saveUser(User user);
}
