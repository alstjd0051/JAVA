package kh.java.test.array;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.test();
	}
	/**
	- 클래스 : kh.java.test.array.Test3.java
- 메소드명 : public void test()
    문자열을 하나 입력 받아 문자배열에 넣고 검색할 문자를 하나 입력 받아 검색 문자가 문자열에 몇 개인지 개수를 출력하는 프로그램을 작성하세요.
    
    예) 입력값 : helloworld
    검색값 :ㅣ
    출력 : 입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개 입니다.

*/
	public void test() {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요. :");
		String inputStr = sc.nextLine();
		
		char[] toChar = inputStr.toCharArray();
		System.out.println("검색할 문자를 하나 입력하세요. : ");
		char searchChar = sc.next().charAt(0);
		
		int cnt = 0;
		
		for (int i = 0; i< toChar.length; i++) {
			if (toChar[i] == searchChar) {
				cnt++;
			}
		}
		System.out.println("입력하신 문자열" + inputStr + "에서 찾으시는 문자" + searchChar + "은(는)" + cnt + "개 입니다.");
	}
}
