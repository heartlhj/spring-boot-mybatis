package com.lhj.gogo.admin.model;

import java.io.Serializable;
import java.util.Date;

public class GogoSystemMenu implements Serializable{
    /**
	 * TODO(这里用一句话描述这个类的作用)
	 */
	private static final long serialVersionUID = -2984325286761555562L;

	private String menuId;

    private Date createTime;

    private Date modifyTime;

    private String state;

    private String sort;

    private String parentId;

    private String menuName;

    private String menuUrl;

    private String target;

    private String menuIcon;

    private String remarks;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}