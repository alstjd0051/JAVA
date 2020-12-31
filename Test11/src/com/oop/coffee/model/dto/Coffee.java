package com.oop.coffee.model.dto;
/**
 *  - 클래스 : com.oop.coffee.model.dto.Coffee.java
 * =====================================================================
 - Coffee 멤버변수 원산지 origin, 지역 location
      기본생성자, 모든필드초기화생성자
      getter, setter
      출력메소드      ()
 *
 *stattic = 클래스변수
 *nonStatic = 멤버변수
 *local = 지역변수
 */
//커피란객체를 쓸수있게 오리진과 로케이션 변수를 객체에 넣었다.
public class Coffee { // 객체
//private = 멤버변수
	private String origin; // 변수
	private String location;
	
	/**
	 * 경우의 수 = 2가지
	 * 1. 기본생성자만 쓸때 - JVM이 자동생성해줌
	 * 2. 파라미터생성자가 존재할때 = JVM(파라미터만 쓰냐? 그럼 기본생성자는 필요없겠지?)
	 * 2번의 경우 기본생성자가 필요하면 내가 만들어줘야함.
	 */
	
	public Coffee() {
		
	}
	
	public Coffee(String orgin, String location) {
		this.origin = origin;
		this.location = location;
	}
	
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void print() {
		System.out.println(origin+ "   " + location);
	}
	
}
