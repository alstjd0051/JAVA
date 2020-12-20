package com.oop.method;

/**
 * [필드실습문제] 다음 코드에서 각 출력문에 찍히게 될 값을 작성하고, 실제 코드로 작성후 확인하세요. public class Test {
 * int a = 100; static int s = 99;
 * 
 * public static void main(String[] args) { Test t = new Test(); t.test1();
 * 
 * t.test2();
 * 
 * Test t3 = new Test(); t.test3(t3); System.out.println(t3.a);
 * 
 * 
 * t.test4(t);
 * 
 * } public void test1() { int a = 1000; int s = 999;
 * System.out.println(this.a); System.out.println(Test.s); } public void test2()
 * { Test t = new Test(); t.a = 1000; System.out.println(a); } public void
 * test3(Test t) { t.a = 10; this.a = 200; System.out.println(t.a); } public
 * void test4(Test t) { t.a = 1000; System.out.println(this.a); } }
 * 
 * @author wsc03
 *
 */
public class Test {
	int a = 100;
	static int s = 99;
	int b = 0;

	public static void main(String[] agrs) {
		Test t1 = new Test();
		t1.test1();
		t1.test2();
		Test t3 = new Test();
		t1.test3(t3);
		System.out.println(t3.a);
		t1.test4(t1);

	}

	public void test1() {
		int a = 1000;
		int s = 999;
		System.out.println("Test1");
		System.out.println(this.a);
		System.out.println(Test.s);
	}

	public void test2() {
		System.out.println("Test2");
		Test t = new Test();
		t.a = 1000;
		System.out.println(a);
	}

	public void test3(Test t) {
		System.out.println("Test3");
		t.a = 10;
		this.a = 200;
		System.out.println(t.a);
	}

	public void test4(Test t) {
		System.out.println("Test4");
		t.a = 1000;
		System.out.println(this.a);
	}

}
