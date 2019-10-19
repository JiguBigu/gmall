package com.workbook.gmall.manage.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author Jigubigu
 * @version 1.0
 * @date 2019/10/19 15:18
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AttrValueMapperTest {

    @Autowired
    AttrValueMapper attrValueMapper;

    @Test
   public void selectAttrValueById(){
        System.out.println(attrValueMapper.selectAttrValueById("41"));
    }
}