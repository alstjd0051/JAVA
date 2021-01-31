package Workshop4;

/*
다음 배열의 내용을 실행 결과와 같이 출력 되도록 프로그램을 작성 하시오.
int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

 */
//public class Test03 {

public class Test03 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
			if (i != 0)
				System.out.print(" ");
		}

	}
}

//public class Test03 {
//	public static void main(String[] args) {
//
//		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
//
//		List<Integer> list = new ArrayList<>();
//
//		for (int i = 0; i < arr.length; i++) {
//			list.add(arr[i]);
//		}
//		Comparator<Integer> comp = Collections.reverseOrder();
//		Collections.sort(list, comp);
//
//		for (int i = 0; i < list.size(); i++) {
//			System.out.print(list.get(i) + " ");
//
//		}
//	}
//}
