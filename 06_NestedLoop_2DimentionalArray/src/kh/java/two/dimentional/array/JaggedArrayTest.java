package kh.java.two.dimentional.array;

import java.util.Scanner;

public class JaggedArrayTest {

	/**
	 * 
	 * 2차원 배열의 구조 : int[][] arr = new int[3][2]; 배열은 배열안의 배열 혹은 참조의 참조
	 */
	public static void main(String[] args) {
		JaggedArrayTest j = new JaggedArrayTest();
		j.test1();
//		j.test2();
	}

	/**
	 * 가변배열
	 */
	public void test1() {

		int[][] arr = new int[3][];

		// 2차원배열 할당
		arr[0] = new int[10];
		arr[1] = new int[3];
		arr[2] = new int[7];

		// 값 입력
		int k = 9;
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++)
				arr[i][j] = k++;

		for (int i = 0; i < arr.length; i++) {
//				System.out.println(arr[i].toString()); // 객체의 정보를 문자열로 출력(hashCode값 포함) hashCode - 객체와 객체를 분류하는 고유의 번호
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * 구매목록을 입력 받는데, 의류 5종류 식료품 2종류, 기타 물품 3종류 담을 수 있는 가변배열을 선언하고, 사용자로부터 각각 입력받으세요.
	 * 
	 */
	public void test2() {

		String[][] buyArr = new String[3][];

		buyArr[0] = new String[5];
		buyArr[1] = new String[2];
		buyArr[2] = new String[3];

		Scanner sc = new Scanner(System.in);

		//입력
		for(int i = 0; i< buyArr.length; i++) {
			switch(i) {
			case 0 : System.out.print("의류 ");break;
			case 1 : System.out.print("식품 ");break;
			case 2 : System.out.print("기타물품 ");break;
			}
			System.out.println(buyArr[i].length + "가지를 입력하세요.");
			for(int j = 0; j<buyArr[i].length; j++) {
				
				System.out.println(j + 1 + " : ");
				buyArr[i][j] = sc.next();
				
			}
		}
		//출력
		for(int i = 0; i< buyArr.length; i++) {
			switch(i) {
			case 0 : System.out.print("의류 : ");break;
			case 1 : System.out.print("식품 : ");break;
			case 2 : System.out.print("기타물품 : ");break;
			}
			for(int j = 0; j<buyArr[i].length; j++) {
				System.out.print(buyArr[i][j]);
				System.out.print((j !=buyArr[i].length -1) ? ", " : "");
			}
			System.out.println();
		
		}
	}
}

