package com.workbook.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.workbook.gmall.entity.PmsBaseCatalog1;
import com.workbook.gmall.entity.PmsBaseCatalog2;
import com.workbook.gmall.entity.PmsBaseCatalog3;
import com.workbook.gmall.manage.mapper.Catalog1Mapper;
import com.workbook.gmall.manage.mapper.Catalog2Mapper;
import com.workbook.gmall.manage.mapper.Catalog3Mapper;
import com.workbook.gmall.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Jigubigu
 * @version 1.0
 * @date 2019/10/6 18:46
 */
@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private Catalog1Mapper catalog1Mapper;

    @Autowired
    private Catalog2Mapper catalog2Mapper;

    @Autowired
    private Catalog3Mapper catalog3Mapper;

    @Override
    public List<PmsBaseCatalog1> getCatalog1s() {
        List<PmsBaseCatalog1> catalog1List = catalog1Mapper.selectAllCatalog();
        return catalog1List;
    }

    @Override
    public List<PmsBaseCatalog2> getCatalog2s(String catalog1Id) {
        List<PmsBaseCatalog2> catalog2List = catalog2Mapper.selectById(catalog1Id);
        return catalog2List;
    }

    @Override
    public List<PmsBaseCatalog3> getCatalog3s(String catalog2Id) {
        List<PmsBaseCatalog3> catalog3List = catalog3Mapper.selectById(catalog2Id);
        return catalog3List;
    }
}
