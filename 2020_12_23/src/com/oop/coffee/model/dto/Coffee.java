package com.oop.coffee.model.dto;
/**
 * Coffee 멤버변수 원산지 origin, 지역 location
      기본생성자, 모든필드초기화생성자
      getter, setter
      출력메소드      ()
 *
 */
public class Coffee {
	private String origin;
	private String location;
	
	public Coffee() {
		
	}
	public Coffee(String oString, String location) {
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
	
	public void printInfo() {
		System.out.printf("%s          %s%n",origin, location);
	}
}
