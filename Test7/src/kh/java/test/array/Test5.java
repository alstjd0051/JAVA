package kh.java.test.array;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Test5 t = new Test5();
		t.test();
	}
	/**
	 * - 클래스 : kh.java.test.array.Test5.java
- 메소드명 : public void test()
    주민등록번호 성별자리 이후부터 *로 가리기.  
    단, 원본 배열값은 변경 없이 배열 복사본으로 
    변경하세요
     
     주민번호 문자열 입력 -> char[] src -> 
     복사 -> char[] copy -> 변경
     
    힌트) 복사방법
       - for문이용 1:1대입
       - System.arraycopy() 매소드 이용
       - clone() 매소드 이용

	 */
	private void test() {
		Scanner sc = new Scanner(System.in);
		//1.주민번호 입력(문자열)
		System.out.println("주민등록번호 13자리 입력 : ");
		String ju = sc.nextLine();
		
		//2.char[] 원본배열로 옮기기
		char [] juArr = new char[14];
		for ( int i= 0; i< ju.length(); i++) {
			juArr[i] = ju.charAt(i);
		}
		
		//3.char[] 복사본 생성
		char[] juArr_ = new char[14];
		System.arraycopy(juArr, 0, juArr_, 0, juArr.length);
		
		//해당 자리 *로 변경
		for (int i = 0; i < juArr_.length; i++) {
			if(i>7) juArr_[i] = '*';
			System.out.print(juArr_[i]);
		}
			}
		}


