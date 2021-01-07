package kh.java.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class OverrideTest {
	/*
	 * Override 상속받은 메소드를 고쳐쓸수있다.
	 * 1.메소드명, 파라미터 선언부 리턴타입 모두 동일해야한다.
	 * 	-@Overricde
	 * 2.접근제한자는 더 넓은 범위로 수정이 가능
	 * 		- private(x) - default(x) - protected - public
	 * 		- private 메소드는 오버라이드 불가
	 * 		- default메소드는 거의 없음.
	 * 3. 메소드가 던지는 예외클래스는 줄이거나, 자식클래스로 변경가능 
	 */
	public static void main(String[] args) {
		
	}
	class parent {
		public void test() throws SQLException, IOException {
			
		}
	}
	class child extends parent {
		
		@Override
//		public void test() {}
//		public void test() throws SQLException{}
//		public void test() throws IOException{}
		public void test() throws FileNotFoundException{}
//		public void test() throws Exception{} //상위타입의 예외클래스 변경은 불가능하다.
	}

}
