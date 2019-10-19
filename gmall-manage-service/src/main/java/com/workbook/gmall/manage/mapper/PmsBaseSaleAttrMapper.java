package com.workbook.gmall.manage.mapper;

import com.workbook.gmall.entity.PmsBaseSaleAttr;
import com.workbook.gmall.entity.PmsProductSaleAttr;

import java.util.List;

/**
 * @author Jigubigu
 * @version 1.0
 * @date 2019/10/19 18:39
 */
public interface PmsBaseSaleAttrMapper {
    List<PmsBaseSaleAttr> selectAllBaseSaleAttr();
}
