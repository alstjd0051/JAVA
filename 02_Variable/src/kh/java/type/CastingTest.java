package kh.java.type;
/**
 * 컴퓨터의 작동원리
 * 1. 같은 자료형끼리만 연산할수 있다. 
 * 2. 연산결과 역시 동일한 자료형이다.
 * 3. 같은 자료형의 변수에만 대입할수있다.
 * 
 * 
 * 위의  조건을 만족하기 위해서 암묵적/명시적 형변환이 필요하다.
 * 1. 암묵적 : 자동으로 처리
 * 2. 명시적 : 직접 형변환 코드 필요
 */
public class CastingTest {

	public static void main(String[] args) {
		CastingTest c = new CastingTest();
		c.test1();
		c.test2();
		c.test3();
		c.test4();
		/**
		 * String = java.lang.String 문자열
		 * "abc"
		 * - 참조형(객체 만들어 사용)
		 * - 사용빈도가 너무많아서 기본형처럼 사용가능(리터럴을 대입하는 형태)
		 */
	}
	
	/** 
	 * 자동형변환
	 * - 크기가 작은 타입에서 큰 타입으로 변환은 자동으로 처리.
	 * - 정수에서 실수로의 변환은 자동처리
	 * - byte(1) -> short(2) -> char(2), int(4) -> long(8) -> float(4) -> double(8)
	 * 
	 */
	
	public void test1() {
		
		//대입연산
		int num = 300;
		long lNum = num;
		
		
		int a = 3;
		double b = 1.5;
		System.out.println(a+b);// int(3) +double(3.0)=> int가 double로변환
								// double(3.0) + double
		
		int c = 'A'; //int = char
					 // int = int
		System.out.println(c);
		System.out.println("lNum = " + lNum);
		
		
	}
	public void test2() {
		/**
		 * 명시적 전환
		 * 1. 크기가 작은 타입으로 형변환 - 데이터손실 
		 * 2. 크기가 큰타입으로 형변환
		 */
		//1. 데이터 손실이 있는경우
		int num = (int)3.7; // int를 double에 대입
		System.out.println(num);
		
		//2. 데이터 손실 없이 큰 타입으로 변환
		int a = 10;
		int b = 4;
		System.out.println(a/b);
		System.out.println((double)a/b);//소수점값을 원하는 경우 (double)int / int
										// double / int
										// douoble / double
		System.out.println(a * 1.0 / b);
		
		//2147483647 + 1 => 2147483648
		int i  = Integer.MAX_VALUE ;
		System.out.println((long)i + 1);
		
	}
	public void test3() {
		/**
		 * 형변환 유의사항
		 * - int보다 작은 타입 = byte, short, char 타입은 연산시에 
		 * 	  자동으로 int(정수기본형)으로 변환되서 처리
		 * - 
		 */
		
		byte b1 = 10;
		byte b2 = 20;
		byte result = (byte)(b1 + b2); //convent=형변환
		System.out.println("result = " + result);
		
		boolean bool = 'a' > (b1+b2);
		//char > (byte + byte)
		//char > (int + int)
		//char > int
		//int(97) > int (30)
		
		System.out.println("bool = " +bool);
		//char변수에 int대입
		char ch = 65; // A
		System.out.println(ch);
		
		ch = '\ud734'; // "'\'u" = 유니코드
		System.out.println(ch);
	}
	public void test4() {
		String name = "홍길동";
		String name2 = new String("송민성");
		
		//더하기연산
		System.out.println(name + " 만세 !");
		
		//char
		System.out.println(name + 'a');
		System.out.println(123 + 'a');
		System.out.println("abc" + 'Z' + 123);
		System.out.println(123 + 'z' + "abc");
		
	}
}
 