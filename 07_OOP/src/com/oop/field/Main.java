package com.oop.field;

/**
 * 
 * 
 * 프로그램은
 * main ----------------> main끝
 * 지역변수 			메소드호출시 ---> 메소드리턴
 * 멤버련수			객체생성시 ---------->객체소멸(garbage collector에의해 제거)
 * 클래스 프로그램시작시------------------------------------->프로그램종료
 * 			(해다클래스 최초호출시)
 * 
 * 
 */
public class Main {
	public static void main(String[] ars) {
		
		GalaxyNote20 ph1 = new GalaxyNote20();
		ph1.setOwner("김한성");
		ph1.setPhoneNumber("01012341234");
		System.out.println(ph1.getOwner() + " : " +ph1.getPhoneNumber());
		//static 변수는 calss명으로 접근해야한다.
		System.out.println(GalaxyNote20.WIDTH);
		
		
		GalaxyNote20 ph2 = new GalaxyNote20();
		ph2.setOwner("홍길동");
		ph2.setPhoneNumber("01088887777");
		System.out.println(ph2.getOwner() + " : " +ph2.getPhoneNumber());
		System.out.println(GalaxyNote20.WIDTH);
		
		
		//jdk static변수
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Math.PI);
	}
}
