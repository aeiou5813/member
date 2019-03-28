package com.example.spring03.dto.member;

import java.sql.Date;

public class MemberVO {

	private String userId;
	private String userPw;
	private String userName;
	private String userEmail;
	private Date userRegdate;
	private Date userUpdatedate;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Date getUserRegdate() {
		return userRegdate;
	}

	public void setUserRegdate(Date userRegdate) {
		this.userRegdate = userRegdate;
	}

	public Date getUserUpdatedate() {
		return userUpdatedate;
	}

	public void setUserUpdatedate(Date userUpdatedate) {
		this.userUpdatedate = userUpdatedate;
	}

	public MemberVO(String userId, String userPw, String userName, String userEmail, Date userRegdate,
			Date userUpdatedate) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userRegdate = userRegdate;
		this.userUpdatedate = userUpdatedate;
	}

	public MemberVO() {

	}

	@Override
	public String toString() {
		return "MemberVO [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", userEmail="
				+ userEmail + ", userRegdate=" + userRegdate + ", userUpdatedate=" + userUpdatedate + "]";
	}

}
