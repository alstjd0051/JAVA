package com.oop.field;

public class GalaxyNote20 {
	
	//전역변수
	//멤버변수 : instance변수, non-static변수
	private String owner;
	private String phoneNumber;
	
	//클래스 변수 : static변수
	//공유 목적 : 모든객체가 공유할 값
	public static final int WIDTH = 10;
	public static final int HEIGHT = 20;
	
	//매개변수도 하나의 지역변수
	public void heyBixby(String str) {
		//지역변수 : 접근제한자, static 키워드 사용불가
		int a = 10;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getOwner() {
		return owner;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
}
