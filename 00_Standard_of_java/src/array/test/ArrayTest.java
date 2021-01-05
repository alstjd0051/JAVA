package array.test;

public class ArrayTest {

	public static void main(String[] args) {
//		int[] socre; //1. 배열 score를 선언(참조변수)
//		score = new int [5]; //2. 배열의 생성(int저장공간 x5)
		
		int[] score = new int[5]; //배열의 선언과 생성을 동시에
		score[3] = 100;
		
		System.out.println("score[0] = " +score[0]);
		System.out.println("score[1] = " +score[1]);
		System.out.println("score[2] = " +score[2]);
		System.out.println("score[3] = " +score[3]);
		System.out.println("score[4] = " +score[4]);
		
		int value = 100;
		System.out.println("value = " + value);
	}
		
}
