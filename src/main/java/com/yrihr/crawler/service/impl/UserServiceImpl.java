package com.yrihr.crawler.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yrihr.crawler.entry.User;
import com.yrihr.crawler.mapper.UserMapper;
import com.yrihr.crawler.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @ClassName : UserServiceImpl
 * @Description :
 * @Author : ws
 * @Date: 2021-05-25 16:10
 * @Version 1.0
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    /**
     * @param user
     * @return
     */
    @Override
    public Integer saveUser(User user) {
        return baseMapper.insert(user);
    }
}
