package kh.java.args;

import java.util.Scanner;

public class CommandLineArgumentsTest {
	/**
	 * 프로그램 시작과 동시에 사용자 입력값 받아 처리 가능하다. 사용자 입력값을 " "을 구분자로 끊어서 String[]로 만들어
	 * main메소드에 전달. 사용자 입력값 (abc def 123)을 입력했다면 배열로 ["abc" "def", "123"]
	 */
	public static void main(String[] args) {
//		for(int i = 0; i < args.length; i++) {
//			System.out.println(args[i]);
//		}

		CommandLineArgumentsTest c = new CommandLineArgumentsTest();
//		c. test1(args); 
//		c. test2(1);
//		c. test2(1,2);
//		c. test2(1,2,3);
//		c. test2(1,2,3,4);
//		c. test2(3,5,1324,35,23424);
		c.test3();
//		System.out.printf("%s %d%n", "안녕!", 123);
//		System.out.println("프로그램 종료!");
	}

	/**
	 * " 1 2 3 4 -> "1", "2", "3", "4"
	 * 
	 * @param args
	 */
	public void test1(String[] args) {

		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum += Integer.parseInt(args[i]);
		}

		System.out.println(sum);
	}

	/**
	 * 가변인자 타입이 동일하고, 개수가 정해지지 않은 매개인자를 처리할 수있다. 가변인자는 매개변수 선언부에서 마지막에 작성해야 한다.
	 * 
	 * @param is
	 */
	public void test2(int... arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum += arr[i];
//			System.out.println(arr[i]);

		System.out.println(sum);
	}

	/**
	 * @실습문제 : 사용자에게 정수를 입력받고, 입력한 정수에 따라 다음과 같이 처리 정수 : 5
	 * 
	 *       0행 길이 5 1행길이 4 2행길이 3 3행길이 2 4행길이 1
	 * 
	 *       1 2 3 4 5 
	 *       6 7 8 9 
	 *       10 11 12 
	 *       13 14 
	 *       15
	 */
	public void test3() {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		int[][] arr = new int[num][]; // 가변배열
		//2차원배열 할당
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[num - i];
		}
		//값대입
		int k = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = k++;
			}
		}
		
		//값출력
		for (int i = 0; i< arr.length; i++)
		{
			for(int j=0;j<arr[i].length; j++) {
				System.out.print("[" + arr[i][j]+"]");
			}
			System.out.println();
			
		}
	}
}
