package com.kh.java;

import com.kh.java.other.OtherJava;

//java.lang패키지의 모든 클래스는 import문 없이 사용이 가능
import java.lang.*;

// '*'는 전부라는 뜻
/**
 *  javadoc 주석(클래스 ,메소드 레벨에 작성)
 *  
 *  실제 클래스명 : package + class
 *  
 *  전체 package name = com.kh.HelloWrold
 * 
 *  kr.or.iei.member.Member
 *  같은 패키지안에 동일한 이름의 클래스는 존재할 수 없다.
 *  다른 패키지안의 동일한 이름의 클래스는 존재할 수 있다.
 *  
 *  패키지란?
 *  - 패키지는 소문자 (=/클래스는 대문자)
 *  - 보통 성격이 같은 클래스의 모임
 *  - 패키지는 겹치지 않도록 보통 도메인을 거꾸로 사용한다. (com.kh.HelloWolrd)
 *  - 패키지는 "고유하게 관리"하기 위해 3레벨이 이상을 추천한다.(com.naver.www)
 */
public class HelloWorld {

		/**
		 * 프로그램의 첫 실행 메소드
		 * 
		 * JAVA의 특징 : 객체지향언어(Object Oriented Language)
		 * 객체란 메모리에 적재된 데이터 저장공간
		 * 
		 *  객체 레시피
		 *  클래스명 변수명 = new 클래스명();
		 */
	public static void main(String[] args) {
//		System.out.println("AMF");
//		System.out.println("Hello bich~^^");
		
//		클래스 -> 객체 (hw)
		HelloWorld hw = new HelloWorld();
		hw.test1();//메소드 호출부
		hw.test2();
			
		KHJava kh = new KHJava(); //변수명은 소문자
		kh.welcom();
		
		//다른 패키지의 클래스를 가져다 쓰는 경우 import문이 필요하다.
		OtherJava oj = new OtherJava();{
		oj.callMe();
		}
		
		
		//jdk제공 클래스 사용하기.
		java.util.Date now = new java.util.Date();
		System.out.println(now);
		
		//java.sql.Date, java.util.Date
		java.sql.Date today = new java.sql.Date(System.currentTimeMillis());
		System.out.println("메인메소드 출력!");
	}
	
	public void test1() {
		//java.lang.System
		System.out.println("test1 호출!");
	}
	public void test2() {
		System.out.println("test2 호출!");
	}
}