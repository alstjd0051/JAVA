package com.oop.method;

/**
 * Call by value : 갑을 전달 ( 기본형)
 * 
 * call by reference : 주소값을 전달(참조형)
 *
 */
public class CallByTest {

	public static void main(String[] args) {

		int a = 10;
		int[] arr = { 1, 2, 3, 4, 5 };

		CallByTest c = new CallByTest();
		c.test1(a); // call by value
		System.out.println(a);
		c.test2(arr); // call by reference
		System.out.println(arr[0]);

		String s = "안녕";
		c. test3(s);// string은 참조형이라 call by reference가맞지만 call by valuer처럼나온다.
		System.out.println(s);
		
		Sample sp = new Sample();
		sp.num = 99;
		c.test4(sp); // call by reference
		System.out.println(sp.num);
		
		
	}
	
	
	public void test4(Sample s) {
		s.num *= 100;
	}
	public void test1(int x) {
//		System.out.println(x);
		x = 20;
	}
	
	public void test2 (int[] arr) {
		arr[0] *= 100;
	}
	public void test3 (String str) {
		str = "잘가";
	}
	
	
}
class Sample {
	int num;
}