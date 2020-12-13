package com.kh.test.break_continue;

import java.util.Scanner;

public class Test1 {
/**
 * 
 * @param args
 */
	public static void main(String[] args ) {
		Test1 t = new Test1();
//		t.test1();
		t.test2();
	}
	/**
	 * [문제 1]
- 클래스 : com.kh.test.break_continue.Test1.java
- 메소드명 : public void test1()
    1) 정수 한 개를 입력 받아, 1부터 입력 받은 정수까지의 홀수의 곱을 출력하세요.

     
        
	 */
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 한개를 입력하세요 : ");
		int inputNum = sc.nextInt();
		
		
		int i = 0;
		int mul = 1;
		
		while (i<inputNum) {
			i++;
			if(i%2==0) {
			continue;
			}
			
		
		else {
			System.out.println(mul + " * "+i+" = " +(mul*i));
			mul *= i;
		}
	}
	System.out.println(mul);
	}
	


	/**
			- 메소드명 : public void test2()
		    2) 사용자로부터 정수를 두개 입력 받아서, 작은 정수에서 큰 정수까지 홀수의 합을 구하세요.
		        Tip. 큰수/작은수에 해당하는 변수를 사용할 것.
		        결과:
        정수를 하나 입력하세요. => 100
        다른 정수를 하나 입력하세요. => 1
        ====================
        1부터 100까지의 홀수의 합은 2500입니다.

		        **/
	public void test2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나 입력하세요. => ");
		int num1=sc.nextInt();
		System.out.println("다른 정수 입력 : ");
		int num2 = sc.nextInt();
		
		int sum = 0;
		if(num1 < num2) {
			sum = loop (num1,num2);
			System.out.println("=====\n"+num1+"부터"+num2+"까지의 홀수 합은 " + sum +"입니다");
		}
			else {
				sum = loop (num2,num1);
				System.out.println("====\n"+num2+"부터"+num1+"까지의 홀수의 합은" + sum + "입니다.");
			}
		}
		public int loop(int N1, int N2) {
			int sum = 0;
			int i = N1;
			while(i <= N2) {
				if(i%2 == 0) {
					continue ;
				}
				else {
					sum+=i;
				}
			}
			return sum;
		}
}
