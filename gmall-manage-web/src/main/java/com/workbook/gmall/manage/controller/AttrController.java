package com.workbook.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.workbook.gmall.entity.PmsBaseAttrInfo;
import com.workbook.gmall.entity.PmsBaseAttrValue;
import com.workbook.gmall.entity.PmsBaseSaleAttr;
import com.workbook.gmall.entity.PmsProductSaleAttr;
import com.workbook.gmall.service.AttrService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Jigubigu
 * @version 1.0
 * @date 2019/10/6 21:56
 */
@RestController

public class AttrController {


    @Reference
    AttrService attrService;

    @RequestMapping("/attrInfoList")
    @CrossOrigin
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id){
        List<PmsBaseAttrInfo> pmsBaseAttrInfoList = attrService.getAttrInfoList(catalog3Id);
        return pmsBaseAttrInfoList;
    }

    @RequestMapping("/saveAttrInfo")
    @CrossOrigin
    public String saveAttrInfo(@RequestBody PmsBaseAttrInfo pmsBaseAttrInfo){
        if(pmsBaseAttrInfo == null){
            return "success";
        }
        PmsBaseAttrInfo pmsBaseAttrInfo1 = pmsBaseAttrInfo;

        boolean success =false;
        success = attrService.saveAttrInfo(pmsBaseAttrInfo);
        String successStr = "";
        if(success){
            successStr = "success";
        }else {
            successStr = "default";
        }
        return successStr;
    }

    @PostMapping("getAttrValueList")
    @CrossOrigin
    public List<PmsBaseAttrValue> getAttrValueList(String attrId){
        List<PmsBaseAttrValue> list = attrService.getAttrValueList(attrId);
        return list;
    }

    @PostMapping("baseSaleAttrList")
    @CrossOrigin
    public List<PmsBaseSaleAttr> baseSaleAttrList(){
        List<PmsBaseSaleAttr> pmsProductSaleAttrs = attrService.getBaseSaleAttrList();
        return pmsProductSaleAttrs;
    }
}
