package com.workbook.gmall.user.controller;

import com.workbook.gmall.user.entity.UmsMember;
import com.workbook.gmall.user.service.UserService;
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

    @Autowired
    private UserService userService;

    @RequestMapping("/getAllUser")
    public List<UmsMember> getAllUser(){
        return userService.getAllUser();
    }
}
