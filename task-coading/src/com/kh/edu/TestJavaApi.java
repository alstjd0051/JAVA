package com.kh.edu;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class TestJavaApi {
	// 자바에서 지원하는 API 중 java.util.Date 클래스를 이용해서 오늘 날짜를 출력하세요
	//	출력형식 : 2020/8/14
	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.of(2020, 8, 14);
		System.out.println(localDate);
	}
}
