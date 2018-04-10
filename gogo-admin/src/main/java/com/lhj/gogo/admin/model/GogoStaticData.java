package com.lhj.gogo.admin.model;

import java.math.BigDecimal;
import java.util.Date;

public class GogoStaticData {
    private BigDecimal dataId;

    private BigDecimal dataCn;

    private BigDecimal dataValue;

    private String dataKey;

    private String dataName;

    private String state;

    private Date createTime;

    public BigDecimal getDataId() {
        return dataId;
    }

    public void setDataId(BigDecimal dataId) {
        this.dataId = dataId;
    }

    public BigDecimal getDataCn() {
        return dataCn;
    }

    public void setDataCn(BigDecimal dataCn) {
        this.dataCn = dataCn;
    }

    public BigDecimal getDataValue() {
        return dataValue;
    }

    public void setDataValue(BigDecimal dataValue) {
        this.dataValue = dataValue;
    }

    public String getDataKey() {
        return dataKey;
    }

    public void setDataKey(String dataKey) {
        this.dataKey = dataKey;
    }

    public String getDataName() {
        return dataName;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}