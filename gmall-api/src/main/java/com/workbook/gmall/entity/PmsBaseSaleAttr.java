package com.workbook.gmall.entity;


import java.io.Serializable;

/**
 * @param
 * @return
 */
public class PmsBaseSaleAttr implements Serializable {


    String id ;


    String name;

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

    @Override
    public String toString() {
        return "PmsBaseSaleAttr{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}