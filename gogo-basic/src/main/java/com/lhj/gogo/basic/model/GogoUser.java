package com.lhj.gogo.basic.model;

import java.math.BigDecimal;
import java.util.Date;

public class GogoUser {
    private Long userId;

    private BigDecimal usreName;

    private String userPassword;

    private String userType;

    private String filePath;

    private String state;

    private Date createTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public BigDecimal getUsreName() {
        return usreName;
    }

    public void setUsreName(BigDecimal usreName) {
        this.usreName = usreName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
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