package kh.java.api.string;

import java.util.StringTokenizer;

public class StringTest {

	public static void main(String[] args) {

		StringTest st = new StringTest();
//		st.test1();
//		st.test2();
		st.test3();
	}
/*
 * String은 immutable(변경불가)이다.
 */
	public void test1() {
		String s1 = "java";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		s1 += " oracle";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		s1 += " javascript";
		s1 += " html";
		s1 += " css";
	}
	
	/*
	 * StringBuilder - mutable(변경가능) 싱클쓰레드용 
	 * 									동기화를 지원하지 않음
	 * StringBuffer -  mutable(변경가능) 멀티쓰레드용  동기화를 지원
	 * 									동기화를 지원해줌
	 */
	public void test2() {
		StringBuilder sb = new StringBuilder("java");
		System.out.println(sb.hashCode());
		
		sb.append(" oracle");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		print(sb.toString());
		
	}
	
	public void print(String s) {
		System.out.println(s);
	}
	
	/*
	 * CSV 데이터처리하기
	 * Comma Seperated Value = CSV
	 * java,oracle,html,javcascripts,css
	 * 
	 * 구분자는 실제 데이터에 사용되지 않는 어떠한 문자도 좋다.
	 * ex) 디렉토리 - java§orcle§html§spring§maven ( /=§)
	 * 
	 * 1.String의 split
	 * 2. StringTokenizer
	 * 
	 */
	
	public void test3() {
		String data = "java§orcle§html§spring§maven§kh/java/pari/string";
		
		//1.Split
		String[] arr = data.split("§");
		for(String s : arr) {
			System.out.println("[" + s +"]");
		}
		
		//2.StringTokenizer
		StringTokenizer tokenizer = new StringTokenizer(data, "§");
//		이 객체를 만드는 순간 이 데이터에 대한 처리가 끝났다.
		while(tokenizer.hasMoreTokens()) {//다음 토큰이 남아있으면 true, 아니면 false
			System.out.println("가지고 있는 토큰의 개수" + tokenizer.countTokens());
			String s = tokenizer.nextToken();
			System.out.println("<" + s + ">");
		}
		System.out.println(tokenizer.countTokens());
		
		//구분자 처리 다른점
		//1.StringTokenizer는 빈문자열은 요소로 취급하지 않는다.
		//2.StringTokenizer 구분자문자열을 문자단위로 인식처리
		//3.split도 정규표현식을 사용하면 문자단위로 처리
		
		//StringTokenizer 빈문자열 무시
		//split 빈문자열 처리가능
//		data = "a,,b,,c,d,";
		data = "a, b,c, d";
		arr =  data.split(", ");
		//정규표현식(regular expression) : 검색표현이 최적화된 표현식
		for(String s : arr)
			System.out.println("[" + s + "]");
		
		
		//',',' ' 두개의 구분자로 인식
		tokenizer = new StringTokenizer(data, "[a-z]");
		while(tokenizer.hasMoreTokens())
			System.out.println("<" + tokenizer.nextToken() + ">");
	}
}
