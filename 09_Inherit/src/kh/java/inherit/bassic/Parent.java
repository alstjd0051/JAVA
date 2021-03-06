package kh.java.inherit.bassic;

/**
 * 2020-12-24 공부주제
 * 상속(Inheritance)
 * - 부모클래스가 가지고 있는 member변수/메소드를 자식클래스에서 선언하지 않고,
 * 	 사용할수 있게하는 것.
 * 
 * -public class 자식클래스    extends 부모 클래스{} : 확장하다.
 * 
 * 
 * 상속의 이점
 * - 중복을 제거해서 효율적으로 코드를 관리할 수 있다.
 * - 공통적인 코드를 부모클래스에서 관리할 수 있다.
 * 
 * 
 * 
 * 상속특징
 * 1. 부모클래스의 필드/메소드는 자식클래스에서 선언없이 접근가능.
 * 2. 모든클래스의a 최상위 부모클래스는 object이다.
 * 		- 아무 클래스도 상속하지 않았다면 -> extends Object가 생략된것.
 * 		- Object의 메소드를 모든 클래스에서 사용가능.(대표적 : toString, hashCode, equals...)
 * 3. 부모클래스의 생성자, 초기화블럭은 상속X.
 * 		-부모클래스 생성자 호출 super();필요
 * 4. 부모클래스의 메소드는 자식클래스에서 재 작성해서 사용할 수 있다.
 * 5*. 부모클래스의 private필드/메소드는 상속은 되지만, 직접 접근 할 수없다.
 * 		-1)getter/setter를 이용하기.
 * 		-2)값대입시에 부모생성자를 호출해서 부모클래스안에서 값대입.
 */
public class Parent extends Object {

	String name;
	int age;
	
	public Parent() {
		System.out.println("Parent 부모클래스 생성자 호출!");
		
	}
	
	public void say() {
		System.out.println("I'm your fader");
	}
//	
	public void printInfo() {
		System.out.println(name + ", " + age);
	}
}
