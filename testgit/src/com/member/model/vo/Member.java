package com.member.model.vo;

import java.util.Arrays;

public class Member {

	private String userId;
	private String userPw;
	private String name;
	private String address;
	private String[] hobby;
	private String email;
	
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String userId, String userPw, String name, String address, String[] hobby) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.name = name;
		this.address = address;
		this.hobby = hobby;
	}
	private String phone;
	
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
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "Member [toString()=" + super.toString() + ", userId=" + userId + ", userPw=" + userPw + ", name=" + name
				+ ", address=" + address + ", hobby=" + Arrays.toString(hobby) + "]";
	}
	
	
}
