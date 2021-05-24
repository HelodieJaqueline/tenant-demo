package com.zhangrui.tenant.service.impl;

import com.zhangrui.tenant.entity.User;
import com.zhangrui.tenant.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author: ZhangRui
 * @create: 2021-05-24 15:22
 **/
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserService userService;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return userService.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User record) {
        return userService.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userService.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(Long id) {
        return userService.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userService.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userService.updateByPrimaryKey(record);
    }
}
