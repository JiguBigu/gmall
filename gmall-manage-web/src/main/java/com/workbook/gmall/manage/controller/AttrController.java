package com.workbook.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.workbook.gmall.entity.PmsBaseAttrInfo;
import com.workbook.gmall.service.AttrService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Jigubigu
 * @version 1.0
 * @date 2019/10/6 21:56
 */
@RestController
@CrossOrigin
public class AttrController {

    @Reference
    AttrService attrService;

    @GetMapping("/attrInfoList")
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id){
        List<PmsBaseAttrInfo> pmsBaseAttrInfoList = attrService.getAttrInfoList(catalog3Id);
        return pmsBaseAttrInfoList;
    }
}
