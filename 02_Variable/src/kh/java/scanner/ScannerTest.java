package kh.java.scanner;

import java.util.Scanner;

public class ScannerTest {

	/**
	 * Scanner
	 * 1.next계열
	 * 	- next() : String
	 * 	- nextInt() : int 
	 * 	- nextDouble() : double
	 * 	- nextBoolean() : Boolean
	 * (여러계열들이있다.next~)
	 * 2.nextLine계열
	 * 	- nextLine() : String
	 * @param args
	 */
	public static void main(String[] args) {
		
		ScannerTest s = new ScannerTest();
//		s.test1();
//		s.test2();
		s.test3();
	}
	/**
	 * next 계열
	 * - 입력버퍼에서 공백이나 개행문자 전가지 읽어서 반환한다.
	 * - 사용자입력값 이전은 공백은 무시한다.
	 */
//	public void test1() {
//		//System.out 표준출력 (콘솔)
//		//System.in = 표준입력(키보드)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("이름 : ");
//		String name = sc.next();
//		String name = sc.next();
//		System.out.println("name = " + name);
		
//		System.out.print("정수 : ");
//		int num = sc.nextInt();
//		System.out.printf("num = " + num);
		
//		System.out.println("실수 : ");
//		double ill = sc.nextDouble();
//		System.out.println("Dnum = " + ill);
		
//		System.out.println("참/거짓(true/false) : ");
//		boolean bool = sc.nextBoolean();
//		System.out.printf("bool = " + bool);
		
//		System.out.print("한글자만 입력 : ");
//		String s = sc.next();
//		char ch = s.charAt(0);
		//위에랑 2문장과 밑에 한문장과 같은것.
//		char ch = sc.next().charAt(0);
//		
//		System.out.printf("ch = " + ch);
		
//		//next의 특징
//		System.out.print("주소 : ");
//		String addr = sc.next();
//		System.out.printf("[addr = "+ addr + "]");
//		addr = sc.next();
//		System.out.println("[addr = " + addr + "]");
//	}
	/**
	 * nextLine계열
	 * 	- 입력버퍼에서 개행문자까지 읽어온후,
	 * 	     개행문자를 제외하고 반환한다.
	 */
//	public void test2() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("이름 : ");
//		String name = sc.next();
//		System.out.println("name = " + name);
//		//개행문자 날리기용
//		sc.nextLine();
//		System.out.print("주소 : ");
//		String addr = sc.nextLine();
//		System.out.println("addr = "+addr);
//		
//	}
	/**
	 * @실습문제
	 * 사용자로부터
	 * 이름, 나이 주소,키(175cm), 몸무게 (70.3kg)를 입력반도
	 * 출력하세요.
	 */
	public void test3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("이름 = "+name);
		
		String age = sc.nextLine();
		System.out.println("나이 : ");
		System.out.println("이름 = "+age);
		
		String adress = sc.nextLine();
		System.out.println("주소 : ");
		System.out.println("이름 = "+adress);
		
		String told = sc.nextLine(); //개행문자 날리기용
		System.out.println("키(175cm) : ");
		System.out.println("키 = "+told);
		System.out.println("키 = "+told+"cm");
		
		double weight = sc.nextDouble(); 
		System.out.println("몸무게(70.3kg) : ");
		System.out.println("몸무게 = "+weight+"kg");
		
		//출력
		System.out.printf("이름 : %s%n", name);
		System.out.printf("나이 : %s%n", age);
		System.out.printf("주소: %s%n", adress);
		System.out.printf("키 : $dcm%s%n", told);
		System.out.printf("몸무게 : %.1fkg%s%n", weight);
		}
}
