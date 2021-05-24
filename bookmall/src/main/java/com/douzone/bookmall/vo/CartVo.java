package com.douzone.bookmall.vo;

public class CartVo {
	private Long bookNo;
	private Long userNo;
	private int count;
	private String bookName;
	private int bookPirce;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookPirce() {
		return bookPirce;
	}
	public void setBookPirce(int bookPirce) {
		this.bookPirce = bookPirce;
	}
	public Long getBookNo() {
		return bookNo;
	}
	public void setBookNo(Long bookNo) {
		this.bookNo = bookNo;
	}
	public Long getUserNo() {
		return userNo;
	}
	public void setUserNo(Long userNo) {
		this.userNo = userNo;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "CartVo [bookName=" + bookName + ", count=" + count + ", bookPirce=" + bookPirce + "]";
	}
	
	
}
