package com.workbook.gmall.entity;

import java.io.Serializable;

/**
 * @author Jigubigu
 * @version 1.0
 * @date 2019/10/6 17:46
 */
public class PmsBaseCatalog3 implements Serializable {
    private String id;

    private String name;

    private String catalog2Id;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatalog2Id() {
        return catalog2Id;
    }

    public void setCatalog2Id(String catalog2Id) {
        this.catalog2Id = catalog2Id;
    }
}
