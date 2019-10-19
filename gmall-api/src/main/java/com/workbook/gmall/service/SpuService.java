package com.workbook.gmall.service;

import com.workbook.gmall.entity.PmsProductInfo;

import java.util.List;

/**
 * @author Jigubigu
 * @version 1.0
 * @date 2019/10/19 17:44
 */
public interface SpuService {
    List<PmsProductInfo> getSpuList(String catalog3Id);
}
