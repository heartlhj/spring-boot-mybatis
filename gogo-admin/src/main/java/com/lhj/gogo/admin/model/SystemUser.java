package com.lhj.gogo.admin.model;

import java.io.Serializable;
import java.util.Date;

import com.lhj.gogo.admin.define.PageBean;

public class SystemUser extends PageBean implements Serializable{
    /**
	 * TODO(这里用一句话描述这个类的作用)
	 */
	private static final long serialVersionUID = 7539830774239961613L;

	private String id;

    private Date createTime;

    private Date modifiedTime;

    private String state;

    private String sort;

    private String userPhone;

    private String userEmail;

    private String userRealName;

    private String userNickName;

    private String salt;

    private String userSex;

    private String ramark;

    private String pwd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
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

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getRamark() {
        return ramark;
    }

    public void setRamark(String ramark) {
        this.ramark = ramark;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}