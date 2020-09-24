package com.member.model.vo;

public class Member {

	private String userId;
	private String userPw;
	private String name;
	private String address;
	private String[] hobby;
		
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
	
	
}
