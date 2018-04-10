package com.lhj.gogo.admin.model;

import java.io.Serializable;
import java.util.Date;

public class GogoComment implements Serializable{
	private static final long serialVersionUID = -280693347377813669L;

	private String id;

    private String text;

    private String userId;

    private Date cteateTime;
    
    private String cteateTimeToS;

    private String remark;

    private String state;

    private String resourceId;

    private int layer;

    private int pLayer;

    
    
    public String getCteateTimeToS() {
		return cteateTimeToS;
	}

	public void setCteateTimeToS(String cteateTimeToS) {
		this.cteateTimeToS = cteateTimeToS;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getCteateTime() {
        return cteateTime;
    }

    public void setCteateTime(Date cteateTime) {
        this.cteateTime = cteateTime;
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

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

	public int getLayer() {
		return layer;
	}

	public void setLayer(int layer) {
		this.layer = layer;
	}

	public int getpLayer() {
		return pLayer;
	}

	public void setpLayer(int pLayer) {
		this.pLayer = pLayer;
	}

}