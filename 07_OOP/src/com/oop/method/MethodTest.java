package com.oop.method;
/**
 * 
 * method 
 * -static method : (class method)클래스명.method명 호출
 * 	참조 : static 자원(field, method)만 접근 가능.
 * - not-static method : (member method, instance method)객체.method명 호출
 * 	참조 : non-static, static자원 모두 접근가능.
 *
 *
 */

public class MethodTest {

	private int num = 100;
	private static int snum = 99;
	
	public static void main(String[] args) {
		MethodTest.a();
		
		MethodTest m = new MethodTest();
		m.b();
		
		System.out.println(MyUtil.add(100, 7));
		System.out.println(MyUtil.add(80, 3));
	}

	//공유
	public static void a() {
		System.out.println("a!");
//		System.out.println(num); // Cannot make a static reference to the non-static field num
		System.out.println(snum);
	}
	
	public void b() {
		System.out.println("b1");
		System.out.println(num);
		System.out.println(snum);
	}
	
}
