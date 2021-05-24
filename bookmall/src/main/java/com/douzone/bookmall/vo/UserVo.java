package com.douzone.bookmall.vo;

public class UserVo {
	private Long userNo;
	private String userName;
	private String userEMail;
	private String password;
	private String phoneNumber;
	public Long getUserNo() {
		return userNo;
	}
	public void setUserNo(Long userNo) {
		this.userNo = userNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEMail() {
		return userEMail;
	}
	public void setUserEMail(String userEMail) {
		this.userEMail = userEMail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "UserVo [userName=" + userName + ", phoneNumber=" + phoneNumber + ", userEMail=" + userEMail + ", password="
				+ password + "]";
	}
	
	
}
