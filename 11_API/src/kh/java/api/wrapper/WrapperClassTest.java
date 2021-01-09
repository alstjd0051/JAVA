package kh.java.api.wrapper;

/*
 * WrapperClass
 * 기본형에 대응하는 참조형 클래스
 * java.lang패키지에 존재
 * 기본형(값)을 감싼 형태이기때문에 Wrapper라고 부른다.
 * 
 * 1.기본형을 참조형으로 사용해야 할때
 * 2.기본형관련된 메소드 혹은 상수를 사용할때.
 */
public class WrapperClassTest {

	public static void main(String[] args) {
		WrapperClassTest wc = new WrapperClassTest();
//		wc.test1();
		wc.test2();
	}

	
	/*
	 * boolean - Boolean
	 * 
	 * char - Character
	 * 
	 * byte - Byte
	 * short - Short
	 * int - Integer
	 * long - Long
	 * 
	 * float - Float
	 * double - Double
	 */
	public void test1() {
		
		int num = 100;
		Integer i = new Integer(100);
		
		//auto-boxing : 기본형 -> Wrapper(참조형)
		//auto-unboxing : Wrapper -> 기본형
		
//		num + new WrapperClassTest() // 객체와 기본형이 되지않는다
		
		//num + i
		System.out.println(num + i);
		System.out.println(num + i.intValue()); //auto-unboxing
		
		Integer j = 3;
//		Integer j = new Integer(3); // auto-boxing
		System.out.println(j.intValue() == 3);
		System.out.println(j.hashCode());
		System.out.println(Integer.MAX_VALUE);
		
		//Generics기본형이 아닌 참조형만 써야하는 경우
//		List<int> list = new ArrayList<>();
//		List<Integer> list = new ArrayList<>();
	}
	
	/*
	 * WrapperClass는 형변환 static메소드 지원
	 * 문자열 데이터를 각각의 타입으로 변환
	 */
	public void test2() {
		int i = Integer.parseInt("100");
		System.out.println(i * 100);
		
		double d = Double.parseDouble("123.456");
		System.out.println(d * 100);
		
		boolean bool = Boolean.parseBoolean("true");
		System.out.println(!bool);
		
		char ch = "abc".charAt(0);
		System.out.println((int)ch);
	}
}
