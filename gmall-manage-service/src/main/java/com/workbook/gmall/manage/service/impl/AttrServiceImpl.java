package com.workbook.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.workbook.gmall.entity.PmsBaseAttrInfo;
import com.workbook.gmall.manage.mapper.AttrInfoMapper;
import com.workbook.gmall.manage.mapper.AttrValueMapper;
import com.workbook.gmall.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Jigubigu
 * @version 1.0
 * @date 2019/10/6 22:04
 */
@Service
public class AttrServiceImpl implements AttrService {
    @Autowired
    private AttrInfoMapper attrInfoMapper;

    @Autowired
    private AttrValueMapper attrValueMapper;

    @Override
    public List<PmsBaseAttrInfo> getAttrInfoList(String catalog3Id) {
        List<PmsBaseAttrInfo> pmsBaseAttrInfoList = attrInfoMapper.selectInfoListById(catalog3Id);
        return pmsBaseAttrInfoList;
    }
}
