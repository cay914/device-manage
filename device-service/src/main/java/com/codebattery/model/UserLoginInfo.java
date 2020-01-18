package com.codebattery.model;

public class UserLoginInfo {
	private Member member;	//用户信息
	private TokenInfo tokenList;	//token信息
	
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public TokenInfo getTokenList() {
		return tokenList;
	}
	public void setTokenList(TokenInfo tokenList) {
		this.tokenList = tokenList;
	}
}
