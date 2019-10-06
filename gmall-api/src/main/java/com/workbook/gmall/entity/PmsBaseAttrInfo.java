package com.workbook.gmall.entity;



import java.io.Serializable;
import java.util.List;

/**
 * @param
 * @return
 */
public class PmsBaseAttrInfo implements Serializable {


    private String id;

    private String attrName;

    private String catalog3Id;

    private String isEnabled;

    List<PmsBaseAttrInfo> attrValueList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public String getCatalog3Id() {
        return catalog3Id;
    }

    public void setCatalog3Id(String catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled;
    }

    public List<PmsBaseAttrInfo> getAttrValueList() {
        return attrValueList;
    }

    public void setAttrValueList(List<PmsBaseAttrInfo> attrValueList) {
        this.attrValueList = attrValueList;
    }
}
