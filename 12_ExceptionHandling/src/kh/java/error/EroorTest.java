package kh.java.error;

/*
 *  Error
 *  예외처리 등 프로그램적으로 해결할 수 없는 심각한 오류
 *  
 */
public class EroorTest {
	public static void main(String[] args) {

		EroorTest e = new EroorTest();
//		e.test1();
		e.test2();
		System.out.println("------- 프로그램 정상종료 -------");
	}
	
	public void test1() {
		long[] arr = new long[Integer.MAX_VALUE];
		//Exception in thread "main" java.lang.OutOfMemoryError: Requested array size exceeds VM limit
		//heap memory 초과
	}
	
	public void test2() {
		System.out.println("etst2호출!");
		test2(); //종료조건 없는 재귀 호출
		//java.lang.StrackOverflowError
		//stack memory 초과
	}
}
