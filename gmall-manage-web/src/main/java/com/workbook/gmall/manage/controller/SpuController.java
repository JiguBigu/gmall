package com.workbook.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.workbook.gmall.entity.PmsProductInfo;
import com.workbook.gmall.entity.PmsProductSaleAttr;
import com.workbook.gmall.service.SpuService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Jigubigu
 * @version 1.0
 * @date 2019/10/19 17:40
 */
@RestController
@CrossOrigin
public class SpuController {

    @Reference
    SpuService spuService;

    @RequestMapping("spuList")
    public List<PmsProductInfo> spuList(String catalog3Id){
        List<PmsProductInfo> pmsProductInfos = spuService.getSpuList(catalog3Id);
        return pmsProductInfos;
    }


}
