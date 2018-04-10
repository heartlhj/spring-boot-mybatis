package com.lhj.gogo.admin.enums;

import lombok.Getter;

/**
 * 用户性别
 */
@Getter
public enum ResourcePathTypeEnum {

	AAIDU("10A", "百度云"), XUN("10B", "迅雷");

	private String code;

	private String desc;

	private ResourcePathTypeEnum(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
