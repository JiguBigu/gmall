package com.workbook.gmall.manage.mapper;

import com.workbook.gmall.entity.PmsProductInfo;

import java.util.List;

/**
 * @author Jigubigu
 * @version 1.0
 * @date 2019/10/19 17:47
 */
public interface SpuMapper {
    List<PmsProductInfo> selectAllSpu(String catalog3Id);
}
