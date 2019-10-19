package com.workbook.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.workbook.gmall.entity.PmsBaseAttrInfo;
import com.workbook.gmall.entity.PmsBaseAttrValue;
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

    @Override
    public boolean saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo) {
        //插入操作
        if(pmsBaseAttrInfo.getId() == null) {
            System.out.println(pmsBaseAttrInfo.getId());
            int success = attrInfoMapper.insertAttrInfo(pmsBaseAttrInfo);
            if (success > 0) {
                for (PmsBaseAttrValue pmsBaseAttrValue : pmsBaseAttrInfo.getAttrValueList()) {
                    pmsBaseAttrValue.setAttrId(pmsBaseAttrInfo.getId());
                    success = attrValueMapper.insertAttrValue(pmsBaseAttrValue);
                }
                if (success > 0) {
                    return true;
                } else {
                    throw new RuntimeException("插入失败：插入属性值失败！");
                }
            } else {
                throw new RuntimeException("插入失败：插入属性失败！");
            }
        }
        //修改操作
        else {
            //更新属性信息
            attrInfoMapper.updataAttrInfo(pmsBaseAttrInfo);
            //删除属性值
            PmsBaseAttrValue pmsBaseAttrValueDel = new PmsBaseAttrValue();
            pmsBaseAttrValueDel.setAttrId(pmsBaseAttrInfo.getId());
            attrValueMapper.delete(pmsBaseAttrValueDel);
            for (PmsBaseAttrValue pmsBaseAttrValue : pmsBaseAttrInfo.getAttrValueList()) {
                pmsBaseAttrValue.setAttrId(pmsBaseAttrInfo.getId());
                attrValueMapper.insertAttrValue(pmsBaseAttrValue);
            }
            return true;
        }
    }

    @Override
    public List<PmsBaseAttrValue> getAttrValueList(String attrId) {
        List<PmsBaseAttrValue> list = attrValueMapper.selectAttrValueById(attrId);
        return list;
    }
}
