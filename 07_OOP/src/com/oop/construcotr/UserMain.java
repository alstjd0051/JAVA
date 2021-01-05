package com.oop.construcotr;

import java.util.Date;

public class UserMain {

	public static void main(String[] args) {
		//객체를 만들때 자주사용하는방 법
		//1.기본생성자 + setter
		User u = new User();
		u.setUserId("honggd");
		u.setPassword("1234");
		u.setRegDate(new Date());
		u.printUser();
		
		//2.파라미터 생성자
		User u2 = new User("wsc03002", "5678",new Date());
		u2.printUser();
		
		//UserId만 받아서 출력
		User u3 = new User("wsc03002");
		u3.printUser();
		
		User u4 = new User("youngsil", "7878");
		u4.printUser();
	}

}
