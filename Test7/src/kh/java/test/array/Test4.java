package kh.java.test.array;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Test4 t = new Test4();
//		t.test1();
		t.test2();
	}
/**
 * - 클래스 : kh.java.test.array.Test4.java
- 메소드명 : public void test1()
    사용자의 전화번호를 입력받고, 11자리의 문자형배열에 저장한후,  가운데 4자리를 *로 가리기.  
    단, 원본 배열값은 변경 없이 배열 복사본으로 변경하세요
     
        힌트) 복사방법
       - for문이용 1:1대입
       - System.arraycopy() 매소드 이용
       - clone() 매소드 이용

 */
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("전화번호 11자리를 입력하세요. ");
		String num = sc.nextLine();
		
		char[] numArr = new char[11];
		numArr = num.toCharArray();
		
		char[] numArr2 = numArr.clone();
		
		for(int i = 0; i < numArr2.length; i++) {
			if(i >= 3 && i <= 6) {
				numArr2[i] ='*';
			}
			System.out.print(numArr2[i]);
		}
	}
	public void test2() {
		/**
		 * - 메소드명 : public void test2()
    위문제를 배열복사없이 문자열차원에 가운데 4자리를 교체해보자.
    * java.lang.String.substring(beginIndex, endIndex) 메소드 찾아볼것!
    * 문자열은 직접 수정이 불가하므로, 특정자리의 문자열을 가져와 처리해야한다.

		 */
		Scanner sc = new Scanner(System.in) ;
		System.out.println("전화번호 11자리를 입력하세요 : ");
		String num = sc.nextLine();
		
		char[] numArr =new char[11];
		numArr = num.toCharArray();
		
		String numSubstring = num.substring(3, 7);
		char[] numMidArr = numSubstring.toCharArray();
		
		for ( int i = 0; i<numMidArr.length; i++) {
			numMidArr[i] = '*';
		}
		for(int i = 0; i < numMidArr.length; i++) {
			if(i >= 3 && i <=6) {
				numArr[i] = numMidArr[i-3];
			}
			System.out.print(numArr[i]);
			}
		}
	}