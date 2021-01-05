package kh.java.array;

public class ArrayTest {

	
	public static void main(String[] args) {
		ArrayTest a = new ArrayTest();
//		a.test0();
//		a.test1();
//		a.test2();
//		a.test3();
		a.test4();
//		a.test5();
//		a.test6();
//		a.test7();
	}
	
	public void test0() {
		//동일한 잘료형을 가진 여러 값
		int kor = 80;
		int math = 70;
		int eng = 90;
		int society = 75;
		int science = 43;
		
		//종점, 평균
		
		int total = kor + math + eng + society + science ;
		double avg = (double)total / 5;
		
		System.out.printf("총점 : %d점, 평균 : %.2f\n",total, avg); //%.2f = 소수점 2째자리까지 (평균 71.60)
		
	}
	
	/**
	 * @배열 : 동일한 자료형의 값이 여러개인 경우
	 */
	public void test1() {
		
		//1. 배열선언
		int[] arr; // java 선호
//		int arr[]; // C언어 선호
		
		//2. 배열할당 : 배열 길이 반드시 지정.
		//메모리 heap영역 int 값을 담을 수 있는 공간 할당
		//배열은 각 타입별 초기값을 미리 처리됨.
		//기본형 - int = 0 , double = 0.0 char = ' ', boolean = false(0),terue(1)
		//참조형
		
		arr = new int[5];
		
		//배열공간을 각 번지수 참조
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		//3. 배열각 번지에 값대입
		arr[0] = 80;
		arr[1] = 70;
		arr[2] = 90;
		arr[3] = 75;
		arr[4] = 43;
		
		//초기화
		//int[] arr = {80, 70, 90,75,43}
		
		
		System.out.println("------------------------------------\n");
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
		for( int i = 0; i< 5; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("------------------------------------\n");
		
		//4. 총점, 평균
		//int totla = arr[0] +arr[1]+arr[2]+arr[3]+arr[4]
		//반복문을 이용ㅎ 점수배열의 총점 구하기
		int total = 0;
		//의미를 찾기 힘든 magic number 대신 변ㄴ수, 상수를 사용하자
		for(int i = 0; i< arr.length; i++) {
			total += arr[i];
		}
		double avg = total /5.0;
//		double avg = (double) total / arr.length;
		System.out.println(arr.length); // 40번째 줄을 저장한다.
		System.out.printf("총점 : %d점, 평균 : %.2f\n",total, avg);
	}
	
	public void test2() {
		//배열 선언
//		double[]  arr;
//		
//		
//		 배열 할당 : heap영영게 배열객체를 생성하고, 주소값을 arr에 대입
//		arr = new double[3]; //new가하는 역활 heap영역에 저장하는 공간
		
		double[] arr = new double[3]; // 90,94번줄 하나로 쓰는법
		
		//배열 요소(각 인덱스)에 값 대입
		arr[0] = 1.1;
		arr[1] = 2.2;
		arr[2] = 3.3; // 배열 마지막 인덱스 : arr.length - 1
//		arr[3] = 4.4;// 없는공간
		
		for ( int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	/**
	 * 초기화
	 * 배열변수 선언 + 배열 할당(heap) + 인덱스별 값대입
	 */
	public void test3() {
		
		//chaar[] chArr = {'a','b','c'}
		char[] chArr;
		chArr = new char[] {'a','b','c'}; // 초기화라고 함
		chArr[0] = 'a';
		chArr[1] = 'b';
		chArr[2] = 'c';
	}
	/**
	 * @test4 배열의 요소에 담긴 값이 규칙이 있다면, 값대입시에 반복문을 사용할 수 있다.
	 * 
	 * {1,2,3,4,5}
	 * 
	 */
	public void test4() {
		
		int[] arr = new int[100]; //101~200
		
		//값대입
		for(int i=0; i < arr.length; i++) {
			arr [i] = i + 101;
			
		}
		
		//값출력
		for (int i = 0; i<arr.length; i++) {
			System.out.printf("arr[%d] = %d%n", i, arr[i]);
		}
	}
	/**
	 * @test5 실습문제 : 알파벳 소문자가 담긴 char배열을 생성하고 출력하세요.
	 */
	
	public void test5() {
//		char[] arr = new char[26];
//		
//		for(char c=0; c< arr.length; c++) {
//			arr [c] = (char)(65+c) ;
//			
//		}
//		for ( char c = 0; c<arr.length; c++) {
//			System.out.printf(arr[c] + " ");
//		}
//	}
//}
		
		int len = 26;
		char[] abc= new char[len];
		
		for(int i = 0; i< abc.length; i++) {
			abc [i] =(char)('a' +i);
			System.out.print(abc[i]);
			System.out.print(i != abc.length - 1 ? ", " : "");
		}
	}
	
	/**
	 * String
	 */
	public void test6(){
	
//	String[] nameArr = new String[3];
//	nameArr[0] = "홍길동";
//	nameArr[1] = "신사임당";
//	nameArr[2] = "장영실";
//	String[] nameArr = {"홍길동", "신사임당", "장영실"}; //182~185까지 같은부분
	String[] nameArr = new String[] {"홍길동", "신사임당", "장영실"}; //X 앞에 
	for(int i = 0; i< nameArr.length; i++) {
		System.out.println(nameArr[i]);
	}
	}
	
	/**
	 * 배열의 특징
	 *- 배열의 길이는 변경할 수 없다.
	 */
	public void test7() {
		
		int[] arr = new int[10];
		System.out.println(arr.length);
		
		//hashCode 비교 : 객체 주소갑에 접근할 수 있는 key값 
		System.out.println(arr.hashCode());
		//toString : 객체를 문자열 정보로 표현
		System.out.println(arr);
		System.out.println(arr.toString());//206번과 같은 숫자
		
		arr = new int[7]; //새로운 배열객체 생성
		System.out.println(arr.length);
		System.out.println(arr.hashCode());
		System.out.println(arr);
		System.out.println(arr.toString());
		
		//참조형 변수 기본값 - null
		arr = null; //삭제하고 동일한값
		
//		System.out.println(arr.length); // 가르키는곳이 없어서 에러
//		System.out.println(arr.[0]); // null곳이 없어서에러
	}
}


