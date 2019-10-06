package com.workbook.gmall.user.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.workbook.gmall.entity.UmsMember;
import com.workbook.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Jigubigu
 * @version 1.0
 * @date 2019/10/4 14:42
 */
@RestController
public class UserController {

    //dubbo远程协议代理
    @Reference
    private UserService userService;

    @RequestMapping("/getAllUser")
    public List<UmsMember> getAllUser(){
        return userService.getAllUser();
    }
}
