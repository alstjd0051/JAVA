package com.kh.test.condition;

import java.util.Scanner;

public class Test1 {
/**
		 * [문제 1]
- 클래스 : com.kh.test.condition.Test1.java
    1.메소드명 : public void test1()
        - 국어, 영어, 수학 점수를 입력 받아 합계를 계산하고 합계가 250점 이상이면 “우수생입니다.”를 출력하는 코드를 작성하세요.
    2.메소드명 : public void test2()
        - A, B, C연봉을 입력하고 각 연봉을 입력하고 연 봉이 5000이상이면 “0은 고액연봉자입니다” 라고 출력하는 프로그램을 작성하세요.
    3.메소드명 : public void test3()
        - 정수 한 개를 입력 받아 짝수면 “짝수다” 홀수면 “홀수다라고 출력하세요.
		 */
	public static void main(String[]agrs) {
		Test1 t1 = new Test1();
		t1.test1();
		t1.test2();
		t1.test3();
	}
	public void test1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요  : ");
		int kor = sc.nextInt();
		
		System.out.println("영어 점수를 입력하세요 : ");
		int eng = sc.nextInt();
		
		System.out.println("수학 점수를 입력하세요 : ");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		
		if(total >= 250) {
			System.out.println("우수생입니다.");
		}
		else if (total < 250) {
			System.out.println("공부좀 해야겠어요");
		}
	}
	
	public void test2 () {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A의 연봉을 입력하세요 : ");
		int aMoney = sc.nextInt();
		
		System.out.println("B의 연봉을 입력하세요 : ");
		int bMoney = sc.nextInt();
		
		System.out.println("C의 연봉을 입력하세요 : ");
		int cMoney = sc.nextInt();
		
		if(aMoney>=5000) {
			System.out.println("A는 고액 연봉자입니다.");
		}
		if(bMoney>=5000) {
			System.out.println("B는 고액 연봉자입니다.");
		}
		if(cMoney>=5000) {
			System.out.println("C는 고액 연봉자입니다.");
		}
	}
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num%2 == 0) {
			System.out.println("짝수입니다.");
		}
		else if(num%2 == 1) {
			System.out.println("홀수입니다.");
		}
		else {
			System.out.println("0을 입력하였습니다.");
		}
	}
	
}
