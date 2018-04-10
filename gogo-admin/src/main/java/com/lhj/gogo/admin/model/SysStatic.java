package com.lhj.gogo.admin.model;

public class SysStatic {
    private String id;

    private String staticKey;

    private String staticValue;

    private String state;

    private String staticType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStaticKey() {
        return staticKey;
    }

    public void setStaticKey(String staticKey) {
        this.staticKey = staticKey;
    }

    public String getStaticValue() {
        return staticValue;
    }

    public void setStaticValue(String staticValue) {
        this.staticValue = staticValue;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStaticType() {
        return staticType;
    }

    public void setStaticType(String staticType) {
        this.staticType = staticType;
    }
}