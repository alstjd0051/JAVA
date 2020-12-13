package com.kh.test.condition;

import java.util.Scanner;

public class Test9 {
/**
 * - 클래스 : com.kh.test.condition.Test9.java
- 메소드명 : public void test()
    
       *********주메뉴*********
       a. 불고기버거 ------------5000
       b. 새우버거 --------------4000
       c. 치킨버거 --------------4500
       d. 한우버거 -------------10000
       e. 디버거 ----------------7000
       ***********************  
       
       *******사이드메뉴********
        1. 콜라 -------------------1500
        2. 사이다 -----------------1500
        3. 밀크쉐이크-------------2500
        4. 레드불------------------3000
        ***********************
       두메뉴를 순서대로 제시하고, 각각 사용자선택번호를 받으세요.
    예) 주메뉴에서 a, 선택후 사이드메뉴에서 4 선택시
    “불고기버거, 레드불은 총 8000원입니다“출력.
    
    각메뉴선택시 다른문자를  입력하면 “번호를 잘못 누르셨습니다. 영업을 종료합니다.”

 * 
 */
	public static void main(String[] args) {
		Test9 t = new Test9();
		t.test();
	}
	public void test() {
		int sum = 0;
		String result = "";//결과출력
		
		Scanner sc = new Scanner(System.in);
		
		//주메뉴
		String mainmenu = "*********주메뉴*********\r\n" + 
				"       a. 불고기버거 ------------5000\r\n" + 
				"       b. 새우버거 --------------4000\r\n" + 
				"       c. 치킨버거 --------------4500\r\n" + 
				"       d. 한우버거 -------------10000\r\n" + 
				"       e. 디버거 ----------------7000\r\n" + 
				"       ***********************  \n :";
		System.out.println(mainmenu);
		char mainmenuNum = sc.next().charAt(0);
		
		
		System.out.println("메뉴 번호를 입력해주세요. : ");
		
		switch(mainmenuNum) {
		case 'a' : result += "불고기버거"; sum += 5000;
			break;
		case 'b' : result += "새우버거"; sum += 4000;break; 
		case 'c' : result += "치킨버거거"; sum += 4500;break; 
		case 'd' : result += "한우버거"; sum += 10000;break; 
		case 'e' : result += "디버거"; sum += 7000;break;
		default :	System.out.println("번호를 잘못입력했어요. 영업 종료"); return;
			
		}
		
		String sidemenu = "*******사이드메뉴********\r\n" + 
				"        1. 콜라 -------------------1500\r\n" + 
				"        2. 사이다 -----------------1500\r\n" + 
				"        3. 밀크쉐이크-------------2500\r\n" + 
				"        4. 레드불------------------3000\r\n" + 
				"        ***********************\n :";
		System.out.print(sidemenu);
		int sidemenuNum = sc.nextInt();
		
		switch (sidemenuNum) {
		case 1 : result +=", 콜라"; sum +=1500; break;
		case 2 : result +=", 사이다"; sum +=1500; break;
		case 3 : result +=", 밀크쉐이크"; sum +=2500; break;
		case 4 : result +=", 레드불"; sum +=3000; break;
		default : System.out.println("번호를 잘못입력하셨어요. 영업종료");return;
		}
		System.out.println(result+"은 총 " + sum + "원 입니다.");
	}
}
