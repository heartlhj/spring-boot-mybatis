package com.lhj.gogo.admin.define;

import java.io.Serializable;

public class PageBean implements Serializable{
	
	 /**
	 * TODO(这里用一句话描述这个类的作用)
	 */
	private static final long serialVersionUID = -2942373542904926486L;
	private Integer pageCurrent;
    private Integer pageSize;
    
    /**
	 * 总记录数
	 */
	private Integer totalCount;

	/**
	 * 总页数
	 */
	private Integer totalPage;

	/**
	 * 当前页
	 */
	private Integer currentPage;

	/**
	 * 每页记录数
	 */
	private Integer numPerPage;

	/**
	 * 排序字段
	 */
	private String orderField;

	/**
	 * 排序方式：asc or desc
	 */
	private String orderDirection;
	
	// 分页开始位置
	private Integer start;
	// 分页结束位置
	private Integer end;
	
	

	public Integer getPageCurrent() {
		return pageCurrent;
	}

	public void setPageCurrent(Integer pageCurrent) {
		this.pageCurrent = pageCurrent;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getNumPerPage() {
		return numPerPage;
	}

	public void setNumPerPage(Integer numPerPage) {
		this.numPerPage = numPerPage;
	}

	public String getOrderField() {
		return orderField;
	}

	public void setOrderField(String orderField) {
		this.orderField = orderField;
	}

	public String getOrderDirection() {
		return orderDirection;
	}

	public void setOrderDirection(String orderDirection) {
		this.orderDirection = orderDirection;
	}

	public Integer getEnd() {
		if(this.currentPage != null){
			this.end = this.currentPage * this.numPerPage;
		}
		return end;
	}

	public void setEnd(Integer end) {
		this.end = end;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	/**
	 * 
	 * @date 2017年7月21日 下午2:11:24
	 * @author Kevin
	 * @Description: 获取总页数
	 * @param count
	 * @return
	 *
	 */
	public int getTotalPage(int count){
		
		int totalPage = 0;
		
		totalPage = count % numPerPage == 0 ? count / numPerPage : count / numPerPage + 1;
		
		return totalPage;
	}
	
	public Integer getStart() {
		
		if(this.currentPage != null){
			this.start = (this.currentPage -1 ) * this.numPerPage;
		}
		
		return start;
	}
}

