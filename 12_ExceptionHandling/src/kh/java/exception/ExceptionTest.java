package kh.java.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
/*
 * Exception
 * 예외처리를 통해서 정상복구될수 있는 오류를 가르킴
 * 
 * 1.checked exception : RuntimeException의 후손클래스가 아님.(예외처리 강제화)
 * 2.unchecked exception : RuntimeException의 후손클래스
 */
	public static void main(String[] args) {
		ExceptionTest e = new ExceptionTest();
//		e.test1();
//		e.test2();
		e.test3();
//		e.test4();
		try {
			e.test5(); // try 쓰거나 e.test5 throws Exception쓰거나 둘중하나
		}catch (IOException e1) {
			
		}
		System.out.println("------정상 종료 ------");
	}
	
	
	public void test1() {
		/*
		 *  try 절
		 *  catch 절
		 *   - 여러개의 예외클래스를 처리할 수 있도록 catch절을 여러개 작성할 수 있다.
		 *   - 부모 예외 클래스타입의 catch절로 통합해서 처리할수도 있다.(다형성)
		 *   - 여러개의 예외클래스 타입의 catch절을 사용하는 경우, 자식 -> 부모타입순으로 작성한다.
		 *   
		 */
		
		//예외처리
		try {
			//예외가 발생할 수 있는 코드
			
//		String s = null;
//		System.out.println(s.length());
			Scanner sc = new Scanner(System.in);
			System.out.println("정수 입력 : ");
			int num = sc.nextInt(); //java.lang.NullPointerException
			
			System.out.println(num / 0); // 수를 0으로 나눌 수 없다.
			// java.lang.ArithmeticException: / by zero //by zero는 예외 메세지
		} catch(InputMismatchException e) {
//			//해당예외가 발생했을 경우 처리코드
			System.out.println("정확한 입력값을 입력해주세요. ");
//		} catch(ArithmeticException e) {
//			
//			System.out.println("수를 0으로 나눌 수 없습니다.");
//		} catch(NullPointerException e) {
//			System.out.println("NPE 발생!");
//			
////			System.out.println(e);
//			e.printStackTrace(); //예외가 발생했을때의 콜스택의 상황 출력
		} //catch절에도 다형성이 적용된다.
		catch(RuntimeException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * 처리 순서
	 * 
	 * finally 절 : try절에서 예외가 던져지든 아니든 무조건 실행되는 코드
	 * 				자원반납 등의 목적으로 사용한다.
	 * 				조기리턴시에도 실행됨.
	 */
	public void test2() {
		
		System.out.println(1);
		try {
			System.out.println(2);
			if(true)
				return;
			int[] arr = new int[3];
			System.out.println(arr[3]);
			//java.lang.ArrayIndexOutOfBoundsException : 3
			System.out.println(3);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(4);
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
	}

	/*
	 * 사용자의 입력에 대해 예외처리하기
	 */
	public void test3() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			
		
		try {
			System.out.println("정수 하나를 입력하세요 :");
			System.out.println(sc.nextInt()); //정수가 아닌 문자를 입력시 : java.util.InputMismatchException
			
			//정상 입력한 경우
			break;
			
			}catch(Exception e) {
			System.out.println("올바른 정수를 입력하세요.");
			sc.next(); // 사용자의 잘못된 입력값이 남겨진 버퍼 비우기
			continue;
			}
		}
	}
	
	/*
	 * 사용자로부터 정수 2개를 입력받고, 합을 출력하는 프로그램을 만드세요.
	 * 부정입력이 있다면, 처음부터 다시 입력받으세요.
	 */
	public void test4() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("정수 입력해주세요 : ");
				int num1 = sc.nextInt();
				System.out.println("정수 입력 : ");
				int num2 = sc.nextInt();
				
				System.out.println(num1+num2);
				break;
				
			} catch(Exception e) {
				sc.next(); //잘못된 입력값을 버퍼에서 제거하기
				System.out.println("올바른 정수를 입력하세요.");
			}
		}
		
		
	}
	
	/*
	 * ChekedException
	 * 예외처리를 강제화.
	 * 1. try ~ catch로 예외하던지
	 * 2. throw절 통해 회피
	 * 		- 복수개의 예외를 던지는 게 가능하다.
	 * 		- 다형성을 적용할 수있다.
	 */
	public void test5() throws FileNotFoundException, IOException {
//		IOException : 입출력 하는 부모클래스의 정의
		
		
		//1. try ~ catch처리
//		try {
//		FileReader fr = new FileReader("text.txt");
//		System.out.println("파일을 찾았습니다.");
//		
//		} catch(FileNotFoundException e) {
//		e.printStackTrace();		
//		}
//	2.throws를 통해 예외회피
		FileReader fr = new FileReader("test.txt");
		System.out.println("파일을 찾았습니다.");
		
	}
	
}
