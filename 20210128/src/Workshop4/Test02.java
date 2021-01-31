package Workshop4;

/*
 * 다음과 같이 선언되어 있는 배열에 1~10까지의 랜덤한 숫자(중복허용)를 넣고 이 배열에 어떤
값이 셋팅 되었는지 출력 하고 배열 데이터의 합과 평균을 구하는 프로그램을 작성 하시오.
int[] arr3 = new int[5]
option: 랜덤한 숫자의 중복 허용을 하지 않게 배열에 입력 한다
출력의 합은 정수형으로 평균은 실수형으로 출력 하시오.
 */
public class Test02 {
	public static void main(String[] args) {
		int[] arr3= new int[5];
		int sum = 0;
		for(int i =0; i<arr3.length;i++) {
			arr3[i] = (int)(Math.random()*10)+1;
			sum += arr3[i];
			System.out.print(arr3[i] + " ");
		}
		System.out.println("\nsum = "+sum);
		System.out.println("avg = "+(double)sum/arr3.length);
	}
}
