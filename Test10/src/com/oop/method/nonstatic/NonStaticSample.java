package com.oop.method.nonstatic;

/**
 * package com.oop.method.nonstatic; public class NonStaticSample {
 * 
 * //1. 반환값 없고 매개변수 없는 메소드 //실행 요청시 1~45까지의 임의의 정수 6개 중복되지 않게 발생시켜 출력하는 메소드
 * //메소드명 : printLottoNumbers
 * //2. 반환값 없고 매개변수 있는 메소드 //실행 요청시 정수 하나, 문자 하나를 전달받아 문자를 정수 갯수만큼 출력하는 메소드
 * //메소드명 : outputChar
 * //3. 반환값 있고 매개변수 없는 메소드 //실행 요청시 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드 //메소드명 :
 * alphabet
 * //4. 반환값 있고 매개변수 있는 메소드 //실행 요청시 문자열과 시작인덱스, 끝인덱스를 전달받아 해당 인덱스 범위의 문자열을
 * //추출하여 리턴하는 메소드. 단 문자열은 반드시 값이 있어야함. 없으면 null 리턴처리 //메소드명 : mySubstring
 * }
 * @author Tyler_Song
 */
public class NonStaticSample {
	public void printLottoNumbers() {
		int[] ran = new int[6];
		int temp;
		int err = 0;
		for (int i = 0; i < ran.length; i++) {
			temp = (int) (Math.random() * 45) + 1;
			if (i == 0) {
				ran[i] = temp;
			}
			else {
				Outter:
					while (true) {
					for (int j = 0; j < i; j++) {
						if (ran[j] == temp) {
							if (ran[j] == temp) {
								temp = (int) (Math.random() * 45) + 1;
								err++;
								break;
							}
							if(j==(i-1)) {
								ran[i] = temp;
								break Outter;
							}
						}
					}
				}
			}
			System.out.println("printLottoNumbers 메소드 작동!");
			for(int i=0; i<ran.length;i++) {
				System.out.print(ran[i]);
				System.out.print(i!=ran.length-1 ? ", ": "");
			}
			System.out.println("\n중복은 "+err+"번 있었습니다");
		}

	

	public void outPutChar(int num, char ch) {
		System.out.println("outPutChar 메소드 작동!");
		for (int i = 0; i < num; i++) {
			System.out.print(ch);
			System.out.print(i != num - 1 ? "," : "");
		}
		System.out.println("\n문자열 " + ch + ", 총 " + num + "번 출력했습니다.");
	}

	public char alphabet() {
		int ran;
		System.out.println("alphabet 메소드 작도옹!");
		while (true) {
			ran = (int) (Math.random() * 122) + 1;
			if ((ran >= 'a' && ran <= 'z') || (ran >= 'A' && ran <= 'Z')) {
				break;
			} else
				System.out.println("Fail" + (char) ran);
		}
		return (char) ran;
	}

	public String mySubString(String s, int start_Index, int end_Index) {
		System.out.println("mySubString 메소드 작도옹");
		if (s == null) {
			System.out.println("입력하신 문자열은 값이 없습니다.");
			return null;
		}
		if (start_Index < 0) {
			System.out.println("start_Index가 잘못 되었습니다.");
			return null;
		}
		if (end_Index + 1 > s.length()) {
			System.out.println("end_Index가 잘못되었습니다.");
			return null;
		}
		return s.substring(start_Index, end_Index + 1);
	}
	
}
