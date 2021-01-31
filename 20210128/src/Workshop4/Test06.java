package Workshop4;

public class Test06 {

	public static void main(String[] args) {

		if (args.length != 2) {
			System.out.println("다시 입력 하세요");
			return;
		}
		

		int[] argsInt = new int[args.length];

		for (int i = 0; i < args.length; i++) {
			argsInt[i] = Integer.parseInt(args[i]);

			if (argsInt[i] < 1 || argsInt[i] > 5) {
				System.out.println("숫지를 확인 하세요");
				return;
			}
		}

		int[][] arr = new int[argsInt[0]][argsInt[1]];
		double sum = 0;
		double cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 5) + 1;
				sum += arr[i][j];
				cnt++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.printf("sum=%.1f%navg=%.1f", sum, (sum / cnt));

	}

}