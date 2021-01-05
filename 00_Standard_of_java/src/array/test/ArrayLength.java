package array.test;

public class ArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr =new int[10]; //길이가 5일 int배열 arr을 생성
		System.out.println("arr.lnegth = "+arr.length);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
	}

}
