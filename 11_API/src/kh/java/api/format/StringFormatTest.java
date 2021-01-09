package kh.java.api.format;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 날짜 : java.text.SimpleDateFormat 
 * 숫자 : java.text.DecimalFormat
 */
public class StringFormatTest {

	public static void main(String[] args) {
		StringFormatTest s = new StringFormatTest();
//		s.test1();
		s.test2();
	}
	
	/*
	 * SimpleDateFormat
	 */
	public void test1() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd (E) hh:mm:ss");
		String result = sdf.format(d);
		System.out.println(result);
	}

	/*
	 * DecimalFormat
	 * # 해당 자리에 데이터가 없는경우, 생략
	 * 0 해당자리에 데이터가 없는 경우, 0으로 표시
	 */
	public void test2() {
		
		double num = 1234567890.12345;
		DecimalFormat df = new DecimalFormat("$#,###");
		System.out.println(df.format(num));
		
		df.applyPattern("#.00000");
		System.out.println(df.format(num));
	}
}
