package com.workbook.gmall.manage.mapper;

import com.workbook.gmall.entity.PmsBaseSaleAttr;
import com.workbook.gmall.entity.PmsProductSaleAttr;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Jigubigu
 * @version 1.0
 * @date 2019/10/19 19:06
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PmsBaseSaleAttrMapperTest {
    @Autowired
    PmsBaseSaleAttrMapper pmsBaseSaleAttrMapper;

    @Test
    public void testSelectAllBaseSaleAttr(){
        PmsBaseSaleAttr pmsProductSaleAttr = pmsBaseSaleAttrMapper.selectAllBaseSaleAttr().get(0);
        System.out.println(pmsProductSaleAttr);
    }
}