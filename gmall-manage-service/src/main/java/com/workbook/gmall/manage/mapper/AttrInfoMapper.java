package com.workbook.gmall.manage.mapper;

import com.workbook.gmall.entity.PmsBaseAttrInfo;

import java.util.List;

/**
 * @author Jigubigu
 * @version 1.0
 * @date 2019/10/6 22:05
 */
public interface AttrInfoMapper {
    List<PmsBaseAttrInfo> selectInfoListById(String catalog3Id);
}
