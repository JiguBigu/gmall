package com.workbook.gmall.service;

import com.workbook.gmall.entity.PmsBaseAttrInfo;

import java.util.List;

/**
 * @author Jigubigu
 * @version 1.0
 * @date 2019/10/6 22:02
 */
public interface AttrService {
    List<PmsBaseAttrInfo> getAttrInfoList(String catalog3Id);
}
