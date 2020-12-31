package com.oop.coffee.model.dto;

import java.util.Scanner;

/**
 * [객체배열 실습문제1]
<문제 1>

 - control 클래스 작성 : com.oop.coffee.controller.CoffeeManager.java
        

=======================================================================
 - control클래스 구현내용.
    1. Coffee 클래스에 대한 객체 배열(세계3대커피정보) 선언함. 배열크기 3.
    2. 사용자에게 키보드로 세계3대 커피정보를 입력받아, 각 객체에 기록함
    3. 출력 확인함
    <세계3대커피>
    ---------------------------
    원산지           지역
    ---------------------------
    예멘          모카마타리
    자메이카       블루마운틴
    하와이           코나
    ---------------------------
 ===============================================
 - main() 에서 구현할 내용
    1. control클래스 객체생성 및 입력/출력 메소드 호출
 * @author wsc03
 *
 */
public class CoffeeController {

	private Coffee[] co = new Coffee[3];
	Scanner sc = new Scanner(System.in);
	/**
	 * 생성자 작성
	 */
	public CoffeeController() { //객체배열
		public void input() {
			
		}
		//입력받아서 배열 초기화 까지
		String origin,location;
		
		for (int i = 0; i < co.length; i++) {
			System.out.print("원산지 : ");
			origin=sc.next();
			System.out.print("지역 : ");
			location = sc.next();
			co[i] = new Coffee(origin,location);
		}
		
		for(int i = 0; i<co.length; i++) {
			System.out.println(co[i].getOrigin()+ "       "+co[i].getLocation());
		}
	}
	//출력해주는것
	for(int i=0;i<co.length; i++) {
		System.out.println(co[i]);
	}
}
