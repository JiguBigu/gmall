package com.workbook.gmall.manage.mapper;

import com.workbook.gmall.entity.PmsBaseCatalog3;

import java.util.List;

/**
 * @author Jigubigu
 * @version 1.0
 * @date 2019/10/6 19:00
 */
public interface Catalog3Mapper {
    List<PmsBaseCatalog3> selectById(String catalog2Id);
}
