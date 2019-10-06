package com.workbook.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.workbook.gmall.entity.PmsBaseCatalog1;
import com.workbook.gmall.entity.PmsBaseCatalog2;
import com.workbook.gmall.entity.PmsBaseCatalog3;
import com.workbook.gmall.service.CatalogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Jigubigu
 * @version 1.0
 * @date 2019/10/6 17:37
 */
@RestController
@CrossOrigin
public class CatalogController {

    @Reference
    CatalogService catalogService;

    @PostMapping("/getCatalog1")
    public List<PmsBaseCatalog1> getCatalog1(){
        List<PmsBaseCatalog1> catalog1List = catalogService.getCatalog1s();
        return catalog1List;
    }

    @PostMapping("/getCatalog2")
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id){
        List<PmsBaseCatalog2> catalog2List = catalogService.getCatalog2s(catalog1Id);
        return catalog2List;
    }

    @PostMapping("/getCatalog3")
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id){
        List<PmsBaseCatalog3> pmsBaseCatalog3List = catalogService.getCatalog3s(catalog2Id);
        return pmsBaseCatalog3List;
    }
}
