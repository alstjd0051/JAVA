package com.kh.print;

public class PrintTest {

	/**
	 * java doc 주석
	 * -java doc 주석 왜쓰냐면 API문서를 만들수있다.
	 * @param arg
	 */
	public static void main(String[]arg) {
		//한줄주석
		/*
		 	여러줄 주석 
		 */
		/**
		 * escape 문자
		\n 개행 . 스크린 커서 위치를 다음줄의 처음으로 옮기 10
     	\t 수평탭. 스크린 커서를 다음 탭으로 옮김
     	\r 캐리지리턴. 스크린커서의 위치를 현재 줄의 처음으로 옮긴다. 개행하지 않는다.
       		이 기호 다음에 오는 문자를 덮어 쒸운다. 13
     	\\ : 역슬래시 문자를 출력할때 사용.
     	\" : 큰 따옴표를 출력할때 사용
     	\' : 작은 따옴표를 출력할때 사용
		 */
		PrintTest p = new PrintTest();
		p.test1();
		p.test2();
		p.test3();
		
	}
	public void test1() {
		System.out.println("안녕"); //출력후 개행
		System.out.print("상"); //출력
		System.out.print("중"); //출력
		System.out.print("하"); //출력
		System.out.println("그는 말했다.\"춥다....\"");
		//C:\dev\\eclipse\eclipse.exe
		//윈도우 디렉토리 구분자는 역슬래시를 사용한다.
		System.out.println("C:\\dev\\eclipse\\eclipse.exe");
		System.out.println("C:/dev/eclipse/eclipse.exe");
	}
	
	public void test2() {
		System.out.println("\t\"ShakeIt 알람\"\n" + 
				"--------------------------------------------\r\n" + 
				"\t흔들기 \t쏴리질러\t터치하기\t원터치\t \n" + 
				"--------------------------------------------");
		System.out.println("홍길동\n\t\"심사임당\"\n\t\t세종대왕\\\"\'\\/");
	}
	/**
	 * 문자열 더하기 연산
	 * 1. 문자열 + 문자열 => 문자열
	 * 2. 문자열 + 숫자 => 문자열
	 * 3. 숫자 + 숫자 => 숫자
	 */
	public void test3() {
		System.out.println("가나다/"+"라마바사/");
		System.out.println("abc"+123);
		System.out.println("123"+4);
		System.out.println(12+34);
		
		System.out.println(12+"34"+56);
		System.out.println(12+34+"56");
		System.out.println("12"+3*7); 
		
	}
}
