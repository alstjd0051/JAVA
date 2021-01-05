//원시타입
package kh.java.type;

/**
 * 자료형 Data Type
 * java에서 자료형은 2가지
 * 1. 기본형(Primitive Type)
 * 	- 값(literal)을 저장
 * 	- 8가지 = 문자형 char, 논리형 boolean,
 *    정수형 = byte, short, int, long) 
 *  실수형 = float, double
 * 2. 참조형(Reference Type)
 * 	- 주소값을 저장(4byte)통일
 * 	- 기본형을 제외한 모든 타입 String, System, Date, Calendar
 * 	- 모든 클래스는 자료형이다.
 *
 *크기 (bit > byte(8bit) > Kilo Byte(1024byte) > MByte(1024KB) > GigaByte(102MB) > TeraByte > Exa Byte > Zetta Byte > Yotta Byte)
 */
public class PrimitiveYpeTest {

	public static void main(String[] args) {
		PrimitiveYpeTest p =
				new PrimitiveYpeTest();
		p.test1();
		p.test2();
		p.test3();
		p.test4();
	}
	/**
	 * 기본형
	 * 1. 논리형
	 * 	boolean(1byte) : true or false
	 * 2. 문자형
	 * 	char (2byte(16가지의 bit))0 ~ 65535 : 'a','가', '1' 하나의 문자를 표현
	 * 3. 정수형
	 *  byte (1byte) = -128 ~ 127(256)가지 표현가능
	 *  short (2byte) = -32768 ~32767(65535)가지 표현가능
	 *  int (4byte)(기본형) = -21억 ~21억 (42억)가지 표현가능
	 *  long(8byte) = -922경 ~ 9222경
	 * 4. 실수형
	 * 	float (4byte) 소수점 이하 7자리
	 * 	double (8byte) 소수점 이하 16자리
	 */
	//예약어 = class, public staic, void String, if, for, while 
	public void test1() {
		//1. 변수선언
		boolean bool;
		char ch;
		byte b;
		short sh;
		int i;
		long l;
		float f;
		double d;
		
		//2. 변수에 값대입
//		bool = true;
//		bool = false;
//		bool = (5 < 2); // > < >= <= java의 기호는 좌->우로 읽을것.
		bool = (5 != 2); // > < >= <= java의 기호는 좌->우로 읽을것.
		
		ch = 'a';
		ch = '가';
		ch = '宋';
		
		//정수의 기본형 int : 12343 -> int
		b = 120;
		
		sh = 32000;
		i = 100000;
		l = 1234567890123L; //정수를 적게되면 기본적으로 int 체계로 적힌다. int 범위를 넘을경우 'L'로 적는다.
		f = 0.1234567890F;
		d = 0.12345678901234567890;
		//3. 변수사용(출력)
		System.out.println("bool = "+ bool);
		System.out.println("ch = " + ch);
		System.out.println("b = " + b);
		System.out.println("sh = " + sh);
		System.out.println("i = " + i);
		System.out.println("l = " + l);
		System.out.println("f = " + f);
		System.out.println("d = " + d);
	}
	/**
	 * 초기화!
	 * 변수 선언과 값 대입을 한줄에서 처리
	 */
	public void test2() {
//		int num;
//		num = 123;
		
		int num = 123;

		int i = 10;
		int j = 3;
		
		System.out.println(num);
		System.out.println(i + j);
		System.out.println(i - j);
		System.out.println(i * j);//곱하기
		System.out.println(i / j);//나누기
		System.out.println(i % j);//나누고 나머지
		
		double d;
		//변수는 값대입 없이 사용할 수 없다.
//		d = d + 1.23;
//		System.out.println(d);
		
		
		
	}
	public void test3() {
		/**
		 * 상수 
		 * = 한번 값대입후에 값을 벼경할수 없는 변수 
		 * final
		 */
			int agr = 20; //한꺼번에 만들고 싶을때alt + shift + R
			
//			age = 30;
			
			System.out.println(agr);
			
			int myAge = agr + 1;
			System.out.println(myAge);
			//jdk가 지정해둔 상수
			System.out.println(10 * 10 * Math.PI);
			System.out.println(Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
			System.out.println(Short.MIN_VALUE + "~" + Short.MAX_VALUE);
			System.out.println(Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
			System.out.println(Long.MIN_VALUE + "~" + Long.MAX_VALUE);
			
	}
	public void test4() {
	/**
	 * Data Overflow
	 */
	
		int i = Integer.MAX_VALUE;
		System.out.println(i);
		
		i = i + 2;
		System.out.println(i);
}
}