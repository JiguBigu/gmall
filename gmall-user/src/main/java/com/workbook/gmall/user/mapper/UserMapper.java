package com.workbook.gmall.user.mapper;


import com.workbook.gmall.entity.UmsMember;

import java.util.List;

/**
 * @author Jigubigu
 * @version 1.0
 * @date 2019/10/4 14:43
 */
public interface UserMapper{

    List<UmsMember> selectAllUser();
}
