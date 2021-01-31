package Workshop4;

/*
 * 프로그램 실행 시 eclipse argument로 5~10까지의 정수형 데이터를 입력 받는다.
입력 받은 정수 값을 Calc class의 calculate()함수를 이용하여 1부터 입력 받은 숫자까지
짝수만 더하는 프로그램을 작성 한다
 */

public class Test04 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		Calc c = new Calc();
		System.out.println("결과 : " + c.calculate(num));
	}
}

class Calc {
	public int calculate(int data) {
		int sum = 0;
		System.out.print("짝수 : ");
		for (int i = 1; i < data; i++) {

			if (i % 2 == 0) {
				sum += i;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		return sum;
	}
}