package com.workbook.gmall.user.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.workbook.gmall.entity.UmsMember;
import com.workbook.gmall.service.UserService;
import com.workbook.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Jigubigu
 * @version 1.0
 * @date 2019/10/4 14:43
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        return userMapper.selectAllUser();
    }
}
