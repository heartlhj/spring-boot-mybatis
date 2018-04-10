package com.lhj.gogo.admin.enums;

import lombok.Getter;

/**
 * 用户性别
 */
@Getter
public enum ResourceTypeEnum {

	BOOK("1", "书"), MOVIE("2", "电影"),MANGA("3","动漫"),LANGUGER("4","视频");

	private String code;

	private String desc;

	private ResourceTypeEnum(String code, String desc) {
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
