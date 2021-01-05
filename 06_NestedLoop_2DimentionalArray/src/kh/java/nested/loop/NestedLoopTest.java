package kh.java.nested.loop;

import java.util.Scanner;

public class NestedLoopTest {

	public static void main(String[] args) {
		NestedLoopTest n = new NestedLoopTest();
//		n.test1();
//		n.test2();
//		n.test3();
//		n.test4();
//		n.test5();
//		n.test6();
//		n.test7();
		n.test8();

	}

	public void test1() {

		for (int i = 0; i < 3; i++) { // 행

			for (int j = 0; j < 5; j++) {
//					System.out.println(i + ", " + j + " ");
				System.out.print("★");
			} // 열
			System.out.println();
		}
	}

	public void test2() {

		Scanner sc = new Scanner(System.in);
		System.out.println("행 : ");
		int row = sc.nextInt();
		System.out.println("열 : ");
		int col = sc.nextInt();

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("★");
			}
			System.out.println();

		}

	}

	/**
	 * 사용자로부터 행과 열을 입력받고 해달크기의 별을 출력하세요 1열의 별은 ☆, 나머지 열은 ★로 출력하세요.
	 */
	public void test3() {

		Scanner sc = new Scanner(System.in);
		System.out.println("행 : ");
		int row = sc.nextInt();
		System.out.println("열 : ");
		int col = sc.nextInt();

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (j == 0) {
					System.out.print("☆");
				} else {
					System.out.print("★");
				}

			}
			System.out.println();
		}
	}

	/**
	 * ---2단 ---
	 */
	public void test4() {

		for (int dan = 2; dan <= 9; dan++) {
			System.out.printf("---%d단---%n", dan);
			for (int su = 1; su <= 9; su++) {
				System.out.printf("%d * %d = %d%n", dan, su, dan * su);
			}
			System.out.println();
		}
	}

	/**
	 * label이 있는 break문
	 * 
	 * dan * su의 결과가 300미만일때까지만 출력
	 */
	public void test5() {

		sexy: for (int dan = 2; dan <= 35; dan++) {
			System.out.printf("---%d단---%n", dan);
			for (int su = 1; su <= 9; su++) {
				if (dan * su > 300) // 결과값이 300이상부터 보고싶지않을때
					break sexy;
				System.out.printf("%d * %d = %d%n", dan, su, dan * su);
			}
			System.out.println();
		}
	}

	/**
	 * label이있는 continue문
	 * 
	 * 각 단에서 dan, su가 동일한 때까지 출력
	 * 
	 */
	public void test6() {

		outter: for (int dan = 2; dan <= 35; dan++) {
			System.out.printf("---%d단---%n", dan);

			for (int su = 1; su <= 9; su++) {
				System.out.printf("%d * %d = %d%n", dan, su, dan * su);
				if (dan == su) {
					System.out.println();
					continue outter;// while이면 조건 //for문이면 증감
				}
			}
			System.out.println();
		}
	}

	/**
	 * 실습문제 : 0 : ● 1 : ●● 2 : ●●● 3 : ●●●● 4 : ●●●●●
	 */
	public void test7() {
		int cnt = 0;

		for (int i = 0; i < 5; i++) { // 행

			cnt++;
			for (int j = 0; j < cnt; j++) {
//					System.out.println(i + ", " + j + " ");
				System.out.print("●");
			} // 열
			System.out.println();
		}
	}

	/**
	 * -> 안쪽 반목문에서 (i + 1) 번 만큼 반복처리 
	 * ●●● 3
	 * ● 1
	 * ●●● 3
	 * ● 1
	 * ●●● 3
	 * ● 1
	 * ●●● 3
	 * 홀수 짝수
	 */
	public void test8() {

		for(int i = 0; i< 5; i++) {
			
			for(int j = 0; j < 3; j++) {
				System.out.print("●");
				if( i% 2 !=0)
					break;
			}
			System.out.println();
		}
	}
}
