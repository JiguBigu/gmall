package com.workbook.gmall.manage.mapper;

import com.workbook.gmall.entity.PmsBaseCatalog2;

import java.util.List;

/**
 * @author Jigubigu
 * @version 1.0
 * @date 2019/10/6 19:00
 */
public interface Catalog2Mapper {
    List<PmsBaseCatalog2> selectById(String catalog1_id);
}
