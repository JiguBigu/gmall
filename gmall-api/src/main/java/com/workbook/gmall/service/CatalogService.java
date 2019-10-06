package com.workbook.gmall.service;

import com.workbook.gmall.entity.PmsBaseCatalog1;
import com.workbook.gmall.entity.PmsBaseCatalog2;
import com.workbook.gmall.entity.PmsBaseCatalog3;

import java.util.List;

/**
 * @author Jigubigu
 * @version 1.0
 * @date 2019/10/6 18:00
 */
public interface CatalogService {
    List<PmsBaseCatalog1> getCatalog1s();

    List<PmsBaseCatalog2> getCatalog2s(String catalog1Id);

    List<PmsBaseCatalog3> getCatalog3s(String catalog2Id);
}
