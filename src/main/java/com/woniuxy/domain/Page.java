package com.woniuxy.domain;

import java.util.List;
import java.util.Map;

public class Page<T> {
	//当前页，前端传来的，已知的值
	private Integer p;
	//总行数，从表中查来的
	private Integer rowCount;
	//总页数，总行数除以最大页，有余数要+1
	private Integer maxPage;
	//上一页，当前页-1，要判断是否有上一页
	private Integer prev;
	//下一页，当前页+1，判断是否是最后一页
	private Integer next;
	//起始行，用于查询
	private Integer startLine;
	//每页显示行数，
	private Integer size;
	//起始页，就是当前页-某个数
	private Integer startPage;
	//结束页，就是当前页+某个数
	private Integer endPage;
	//数据集合 
	private List<T> list;
	
	public Page() {
	}
	
	//通过三个值也就是前端传来的去求其余的
	public Page(Integer fp,Integer frowCount,Integer fsize) {
		
		/*
		 *  前端会传来两个数据当前页和每页显示行数，也即是已知的两个量，
		 * 再去使用mapper去求数据的总行数，
		 *  就可以使用page的构造方法了，
		 *  1.先求这次数据的总页数，是由总行数和每页展示行数求得，
		 *  2.把当前页限定在有效范围
		 *  3.求有效的当前页的上一页和下一页
		 *  4.计算起始行，用于求分页数据的
		 *  5.计算起始页和结束页
		 *  现在就可以使用mapper的方法去求对应数据了，一般会使用到起始行和
		 * 每页显示行数
		 * */
		
		this.p=fp;
		this.rowCount=frowCount;
		this.size=fsize;
		
		//先计算总页数
		maxPage=(int)Math.ceil(rowCount*1.0/size);
		
		//有了总页数，就把传来的当前页限定在有效范围内
		if (p>maxPage) p=maxPage;
		if (p<1) p=1; 			
		
		//此时当前页一定是有效的，再去算上一页和下一页
		prev=p-1;
		next=p+1;
		
		//计算起始行，(当前页-1)*size
		startLine=(p-1)*size;
		
		//计算起始页和结束页
		if (maxPage<10) {
			startPage=1;
			endPage=maxPage;
		}else {
			startPage=p-5;
			endPage=p+4;
			
			if (startPage<0) {
				startPage=1;
				endPage=10;
			}
			if (endPage>maxPage) {
				startPage=maxPage-9;
				endPage=maxPage;
			}
		}
		
	}
	
	public Integer getP() {
		return p;
	}
	public void setP(Integer p) {
		this.p = p;
	}
	public Integer getRowCount() {
		return rowCount;
	}
	public void setRowCount(Integer rowCount) {
		this.rowCount = rowCount;
	}
	public Integer getMaxPage() {
		return maxPage;
	}
	public void setMaxPage(Integer maxPage) {
		this.maxPage = maxPage;
	}
	public Integer getPrev() {
		return prev;
	}
	public void setPrev(Integer prev) {
		this.prev = prev;
	}
	public Integer getNext() {
		return next;
	}
	public void setNext(Integer next) {
		this.next = next;
	}
	public Integer getStartLine() {
		return startLine;
	}
	public void setStartLine(Integer startLine) {
		this.startLine = startLine;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Integer getStartPage() {
		return startPage;
	}
	public void setStartPage(Integer startPage) {
		this.startPage = startPage;
	}
	public Integer getEndPage() {
		return endPage;
	}
	public void setEndPage(Integer endPage) {
		this.endPage = endPage;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Page [p=" + p + ", rowCount=" + rowCount + ", maxPage=" + maxPage + ", prev=" + prev + ", next=" + next
				+ ", startLine=" + startLine + ", size=" + size + ", startPage=" + startPage + ", endPage=" + endPage
				+ ", list=" + list + "]";
	}
	
}
