package kh.java.two.dimentional.array;

public class TwoDimentionalArrayTest {

	/**
	 * 2차원 배열 {1,2,3}, {4,5,6}, {7,8,9} arr[0][0] --> 1 arr[0][1] --> 2 arr[0][2]
	 * --> 3
	 * 
	 * arr[1][0] --> 4 arr[1][1] --> 5 arr[1][2] --> 6
	 * 
	 * arr[2][0] --> 6 arr[2][1] --> 7 arr[2][2] --> 8
	 */
	public static void main(String[] args) {
		TwoDimentionalArrayTest t = new TwoDimentionalArrayTest();
//		t. test1();
//		t.test2();
//		t.test3();
		t.test4();
	}

	public void test1() {
		// 1. 배열 선언
		int[][] arr;

		// 2. 배열 할당
		arr = new int[2][3]; // [밖][안]

		// 3. 값대입
//		arr[0][0] = 1;
//		arr[0][1] = 2;
//		arr[0][2] = 3;
//		arr[1][0] = 4;
//		arr[1][1] = 5;
//		arr[1][2] = 6;

		// 대입할 값아이의 규칙이 있을때 중첩반목문을 통해 값대입
		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = k++;
			}
		}
		// 4. 값출력
//		System.out.println(arr[0][0]);
//		System.out.println(arr[0][1]);
//		System.out.println(arr[0][2]);
//		System.out.println(arr[1][0]);
//		System.out.println(arr[1][1]);
//		System.out.println(arr[1][2]);
		// 행 : arr.length
		// 열 : arr[0].length

		// i : 0,1
		for (int i = 0; i < arr.length; i++) {
			// j : 0,1,2
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}

	/**
	 * 2차원배열의 초기화 선언, 배열 할당, 값대입
	 */
	public void test2() {
		int[][] arr = { 
				{ 1, 2, 3 }, 
				{ 4, 5, 6 } 
				};
		for(int i=0; i< arr.length; i++) {
			for(int j = 0; j <arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	/**
	 * @실습문제 : 알파벳 배열
	 * 0 행에는 대문자 26개
	 * 1행 소문자 26개
	 * char[][]
	 */
	public void test3() {

		char[][] arr = new char[2][26];
		
		for(int i=0; i< arr.length; i++) {
			for (int j = 0 ; j< arr[i].length; j++) {
				arr[i][j] =(char) ((i == 0 ? 'A'  : 'a') + j); //i는 0또는 1 i==0 true라며 'A' false라면 'a'
			}
		}
		
		for(int i=0; i< arr.length; i++) {
			for (int j = 0 ; j< arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	/**
	 * 2차원 배열의 이해
	 * 	-배열안의 배열
	 * 	-참조의 참조
	 * 
	 */
	public void test4() {
		
		double[][] darr = new double[2][3];// 참조형 변수는 무조건 4바이트
		
		int[][] arr = new int[2][3];
		
		int k = 100;
		
		//int[][]: 첫번째가리키는 배열의 길이 -->2
		for ( int i = 0; i< arr.length; i++) {
			
			//int[]의 길이 : 두번째 가르키는 배열으 길이 -->3
			for(int j = 0; j < arr[i].length;j++) {
				arr[i][j] =k++;
				
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
