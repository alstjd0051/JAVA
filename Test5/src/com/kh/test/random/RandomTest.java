package com.kh.test.random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {

	public static void main(String[] args) {
		RandomTest r = new RandomTest();
		
		r.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.println("---가위 바위 보 ---");
		System.out.println("숫자를 입력하세요(1.가위, 2.바위, 3.보 : ");
		
		int userNo = sc.nextInt();
		int comNo = new Random().nextInt(3)+1;
		
		String user = userNo == 1 ?
				"가위" :
					userNo == 2 ? "바위 " : "보 " ;
		String com = comNo == 1 ? "가위" : comNo == 2 ? "바위":"보";
		
		System.out.println("----결과----");
		System.out.println("당신은"+user+"를 냈습니다");
		System.out.println("컴퓨터는 " + com + "를 냈습니다");
		
		System.out.println("---------------------");
		
		userNo = userNo < comNo ? userNo + 3 : userNo;
		
		if(userNo == comNo)
			System.out.println("벼겼습니다.");
		else if (userNo - comNo == 1)
			System.out.println("이겼습니다.");
		else
			System.out.println("졌습니다.");
	}
}
