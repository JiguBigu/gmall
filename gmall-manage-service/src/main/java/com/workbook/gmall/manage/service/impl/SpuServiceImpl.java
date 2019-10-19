package com.workbook.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.workbook.gmall.entity.PmsProductInfo;
import com.workbook.gmall.manage.mapper.SpuMapper;
import com.workbook.gmall.service.SpuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Jigubigu
 * @version 1.0
 * @date 2019/10/19 17:44
 */
@Service
public class SpuServiceImpl implements SpuService {
    @Autowired
    SpuMapper spuMapper;

    @Override
    public List<PmsProductInfo> getSpuList(String catalog3Id) {
        List<PmsProductInfo> pmsProductInfos = spuMapper.selectAllSpu(catalog3Id);
        return pmsProductInfos;
    }
}
