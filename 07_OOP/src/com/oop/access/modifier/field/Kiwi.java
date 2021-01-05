package com.oop.access.modifier.field;

/**
 * 접근제한자
 * 
 * field/method
 * 1.public 다른 패키지 | 다른 클래스
 * 2.protected  같은패키지 |다른 패키지라도 상속관계는 ok
 * 3.default(작성금지) 같은패키지 
 * 4.private  같은클래스 
 *
 */
public class Kiwi {

	public int publicNum = 100; //객체가 만들어질때 대입값이 없다면 0이 세팅 있다면 값지정
	protected int protectedNum = 90;
	int defaulNum = 80;
	private int privateNum = 70;
}
