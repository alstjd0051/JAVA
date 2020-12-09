package com.kh.function.run;

import java.util.Scanner;

public class Example {
	/**
	 * [문제 1]
 		- 메소드명 : public void opSample1(){}
 		- 구현 내용 : 
    국어(정수), 영어(정수), 수학(정수), 총점(정수), 평균(실수) 변수 선언하고,
    각 점수를 키보드로 입력받고,
    합계(국어+영어+수학)와 평균(합계/3.0)을 계산하고,
    세 과목의 점수와 평균을 가지고 "합격" 출력
    	합격의 조건 : 세 과목의 점수가 각각 40점이상이면서,
                  평균이 60점 이상이면 합격, 아니면 "불합격" 출력

	 */
			
	public void opSample1() {
		int korea;
		int english;
		int math;
		int total;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("각 점수를 입력해 주세요.");
		System.out.print("국어 : ");
		korea = sc.nextInt();
		
		System.out.print("영어 : ");
		english = sc.nextInt();
		
		System.out.print("수학 : ");
		math = sc.nextInt();
		
		total = korea + english + math;
		avg = total / 3.0;
		
		System.out.printf("총점 : %d%n", total  );
		System.out.printf("평균 : %.1f%n", avg);
		
		System.out.println("결과 : " + ((korea >= 40 && english >= 40 && math >= 40) && avg >= 60 ? "합격" : "불합격"));
	}
	/**
	 * [문제 2]
 - 메소드명 : public void opSample2(){}
 - 구현 내용 : 변수 선언하고, 키보드로 입력받은 값들을 변수에 기록하고
  			변수값을 화면에 출력 확인함
    		성별이 'M'이면 남학생, 'M'이 아니면 여학생으로 출력처리함
    		=> 변수 선언후 입력받음 
    학생이름 (문자열)
    학년 (정수)
    반 (정수)
    번호 (정수)
    성별(M/F) (문자)    //문자열로 입력받은 후, 문자하나 분리해야 함
    성적 (실수)         //소숫점 아래 둘째자리까지 입력받음
 - 출력 예
    3학년 2반 24번 남학생 홍길동은 성적이 95.55이다.
	 */
	public void opSample2() {
		String stN;
		int stG;
		int stC;
		int stNum;
		char stGD;
		double stR;
		
		Scanner kc = new Scanner(System.in);
		
		System.out.println("학생 정보를 입력해주세요.");
		System.out.print("이름 : ");
		stN = kc.next();
		
		System.out.print("학년 : ");
		stG = kc.nextInt();
		
		System.out.print("반 : ");
		stC = kc.nextInt();
		
		System.out.print("번호 : ");
		stNum = kc.nextInt();
		
		System.out.print("성별 (M/W) : ");
		stGD = kc.next().charAt(0);
		stGD = (stGD != 'M' ? stGD = '여' : '');
		
		System.out.print("성적(소수점 둘째 자리까지) : ");
		stR = kc.nextDouble();
		
		System.out.printf("\n\n%d학년 %d반 %d번 %s학생 %s은 성적이 %.2f이다.", stG, stC, stNum, stGD, stR, stR);
		
		
	}

}
	
