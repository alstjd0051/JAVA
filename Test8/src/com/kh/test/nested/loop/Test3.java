package com.kh.test.nested.loop;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		new Test3().test();
	}
	
	/**
	 * [문제3]
클래스명: com.kh.test.nested.loop.Test3.java
메소드명: public void test()
    정수하나 입력받아, 그 수가 양수일때만 입력된 
    수를 줄 수로 적용하여 다음과 같이 출력되게 하는 
    프로그램을 만들어보자.
        출력예)
      정수 입력 : 5
    
         *
         **
         ***
         ****
         *****
          ****
           ***
            **
             *
    

	 */
	
	public void test() {
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		while(true) {
			num = sc.nextInt();
			if(num>0) break;
			System.out.print("다시 정수를 하나 입력하세요 : ");
		}
		
		for(int i = 0; i< num*2-1;i++) {
			for(int j= 0; j<num;j++) {
				if(i<num && j<=i) {
					System.out.print("*");
					
				}
				else if(i>=num && j<=i-num) {
					System.out.print(" ");
				}
				else if(i>=num)
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
