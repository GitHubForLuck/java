package com.java.utils;

import java.util.List;

/* 
 * 时间：2017-7-27
 * 描述：分页工具类
 * 作者：JAVA1701
 */
public class PageUtils {
	/*
	            当前页： currtPage  
  		每页大小:pageSize
  		偏移量OFFSET:(当前页-1)*页大小
  		总记录数：totalrow   //数据库查询
  		总页数: totalrow%pageSize==0?totalrow/pageSize:totalrow/pageSize+1;
  		分页的实体对应集合
	 */
	private Integer pageNumber;
	private Integer pageSize=5;//页大小给默认值
	private Integer offset;
	private Integer totalRow;
	private Integer totalPage;
	private List<?> list; //未知类型
	
	//构造方法，
	public PageUtils(Integer totalrow ,Integer currtPage,Integer pageSize){
		//如果前端用户自定义了每页显示的大小，则以用户为准，否则默认显示5条
		if(pageSize>0){
			this.pageSize=pageSize;
		}
		this.totalRow=totalrow;
		this.pageNumber=currtPage;
		this.offset=(this.pageNumber-1)*this.pageSize;
		this.totalPage=this.totalRow%this.pageSize==0?this.totalRow/this.pageSize:this.totalRow/this.pageSize+1;
	}
	
	
	public Integer getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getOffset() {
		return offset;
	}
	public void setOffset(Integer offset) {
		this.offset = offset;
	}
	public Integer getTotalRow() {
		return totalRow;
	}
	public void setTotalRow(Integer count) {
		this.totalRow = count;
	}
	public Integer getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	public List<?> getList() {
		return list;
	}
	public void setList(List<?> list) {
		this.list = list;
	}
	
}
