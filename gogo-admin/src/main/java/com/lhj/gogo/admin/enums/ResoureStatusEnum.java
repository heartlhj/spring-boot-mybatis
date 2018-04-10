package com.lhj.gogo.admin.enums;

import lombok.Getter;

/**
 * 用户状态
 */
@Getter
public enum ResoureStatusEnum {

	NORMAL("10A", "正常"), CANCEL("10B", "注销");

	private String code;

	private String desc;

	private ResoureStatusEnum(String code, String desc) {
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
