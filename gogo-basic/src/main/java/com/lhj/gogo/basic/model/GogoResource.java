package com.lhj.gogo.basic.model;

import java.math.BigDecimal;
import java.util.Date;

public class GogoResource {
    private BigDecimal resourceId;

    private BigDecimal resourceName;

    private String resourceType;

    private String resourcePathType;

    private String resourcePath;

    private String state;

    private Date createTime;

    public BigDecimal getResourceId() {
        return resourceId;
    }

    public void setResourceId(BigDecimal resourceId) {
        this.resourceId = resourceId;
    }

    public BigDecimal getResourceName() {
        return resourceName;
    }

    public void setResourceName(BigDecimal resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getResourcePathType() {
        return resourcePathType;
    }

    public void setResourcePathType(String resourcePathType) {
        this.resourcePathType = resourcePathType;
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
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