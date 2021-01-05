package com.oop.init.block;

/**
 * 
 * 필드 값대입 순서
 * 1. 명시한 값이 없다면, type 기본값이 대입
 * 2. 명시한 값 ->대입
 * 3. 초기화블럭에서 대입한 값
 * 4. 생성자에서 대입한값
 */
/**
 * 
 * 클래스 변수 필드 값대입 순서
 * 1. 명시한 값이 없다면, type 기본값이 대입
 * 2. 명시한 값 ->대입
 * 3. static 초기화블럭에서 대입한 값
 */
public class Sample {

	private int num;
	public static String s;
	
	//클래스 변수용 초기화블럭
	static {
		System.out.println("--- static 초기화블럭 시작 ---");
		System.out.println(s);
		
		s = "안녕, 난는 static이야!";
		System.out.println("--- static 초기화블럭 끝 ---");
	}
	
	//멤버변수용 초기화 블럭
	{
		System.out.println("--- 초기화 블럭 시작 ---");
		System.out.println(num);
		
		num = 78;
		s = "hello boss";
		
		System.out.println("--- 초기화 블럭 끝 ---");
		
		
		
	}
	
	//생성자 : 메소드변형
	//객체 생성시 호출되는 메소드
	public Sample() {
		System.out.println("--- 생성자 시작 ---");
		System.out.println(num);
		
		num = 99;
		System.out.println("--- 생성자 끝! ---");
	}
	
	public int getNum() {
		return num;
	}
	
}
