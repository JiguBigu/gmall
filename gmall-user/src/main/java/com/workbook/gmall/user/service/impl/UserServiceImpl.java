package com.workbook.gmall.user.service.impl;

import com.workbook.gmall.user.entity.UmsMember;
import com.workbook.gmall.user.mapper.UserMapper;
import com.workbook.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
