package com.workbook.gmall.manage.mapper;

import com.workbook.gmall.entity.PmsBaseAttrValue;

import java.util.List;

/**
 * @author Jigubigu
 * @version 1.0
 * @date 2019/10/6 22:10
 */
public interface AttrValueMapper {
    Integer insertAttrValue(PmsBaseAttrValue pmsBaseAttrValue);

    List<PmsBaseAttrValue> selectAttrValueById(String attrId);

    void updataAttrValue(PmsBaseAttrValue pmsBaseAttrValue);

    void delete(PmsBaseAttrValue pmsBaseAttrValueDel);
}
