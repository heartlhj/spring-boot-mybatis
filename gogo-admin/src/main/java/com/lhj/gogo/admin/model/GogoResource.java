package com.lhj.gogo.admin.model;

import java.io.Serializable;
import java.util.Date;

import com.lhj.gogo.admin.define.PageBean;

public class GogoResource extends PageBean implements Serializable{
    /**
	 * TODO(这里用一句话描述这个类的作用)
	 */
	private static final long serialVersionUID = -6013477440488752484L;

	private String id;

    private String resourceName;

    private String resourceType;

    private String resourcePathType;

    private String resourcePath;

    private String remark;

    private String state;
    
    private String yearType;

    private Date createTime;

    private String resourceCode;

    private int click;
    
    

	public int getClick() {
		return click;
	}

	public void setClick(int click) {
		this.click = click;
	}

	public String getYearType() {
		return yearType;
	}

	public void setYearType(String yearType) {
		this.yearType = yearType;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public String getResourceCode() {
        return resourceCode;
    }

    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }
}