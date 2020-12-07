package com.kh.test.Test1;

public class Num1 {
/**
 * - 정수형 100, 9999억, 
    - 실수 486.520(float), 567.890123
    - 문자 A
    - 문자열 Hello world, 
    - 논리 true
     
     단, 변수를 이용하여 출력하시오 .
    com.kh.test.Test1 에 작성

 */
	public static void main(String[] args) {
		Num1 t = new Num1();
		t.test1();
		t.test2();
//		t.test3();
	}
	public void test1() {
		boolean bool;
		byte b;
		short sh;
		int i;
		long l;
		float f;
		double d;
		char ch = 65; // A
		
		i = 1;
		f = (float)486.520;
		String name = "Hello";
		bool = (5 <= 5);
		
		System.out.println("정수형 100 = " + i * 100);
		System.out.println(i * 9999 + "억");
		System.out.println("실수 출력 = " + (float)f);
		System.out.println(ch);
		System.out.println(name + " Wold");
		System.out.println("논리 값 = " + bool);
		
		
	}
	   public void test2(){
           System.out.println("\n\nA = "+ ('A'+0)); // A``````````````````는 기본 true로 시작하여 0이기때문이어서 true로 출력
           System.out.println("0 =" + ('0' + 0) );
           System.out.println("(char)65 = " + (char)65);
           
           byte bt1 = 125;
           char ch1 = 'C';
           int it1 = bt1 - ch1;
           System.out.println("it1 = "+it1);
           
           
           boolean bool = false;
           
           bool = (2.0 == 5/2);
           System.out.println("bool = " + bool);
           
           bool = ('C' == 67);
           System.out.println("bool = " + bool);
           
           bool = ('A' == 'B'-1);
           System.out.println("bool = " + bool);
           
           bool = ('a' != 97 );//부정연산자
           System.out.println("bool = " + bool);
       }
}
