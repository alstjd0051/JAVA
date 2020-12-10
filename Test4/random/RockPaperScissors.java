package com.kh.test.random;

import java.util.Scanner;

public class RockPaperScissors {
public static void main(String[] args) {
		
		RockPaperScissors rt = new RockPaperScissors();
		rt.game();
		
	}
	public void game() {
		Scanner sc = new Scanner(System.in);
		int temp;
		int RPS = (int)(Math.random()*3)+1;
		
		System.out.println("=== 가위 바위 보 게임 ===");
		System.out.print("숫자를 선택하세요 (1.가위 / 2.바위/ 3.보) : ");
		temp = sc.nextInt();
		
		System.out.println("======= 결과 =======");
		if(temp == 1 ) {
			System.out.println("당신은 가위를 냈습니다.");
		}else if(temp == 2) {
			System.out.println("당신은 바위를 냈습니다.");
		}else if(temp == 3) {
			System.out.println("당신은 보를 냈습니다.");
		}
		if(RPS == 1 ) {
			System.out.println("컴퓨터는 가위를 냈습니다.");
		}else if(RPS == 2) {
			System.out.println("컴퓨터는 바위를 냈습니다.");
		}else if(RPS == 3) {
			System.out.println("컴퓨터는 보를 냈습니다.");
		}
		System.out.println("===================");
		
		//비겼을때
		if(temp == RPS) {
			System.out.println("비겼습니다.");
		}
		//이겼을때
		else if((temp==1&&RPS==3)||(temp==2&&RPS==1)||(temp==3&&RPS==2)) {
			System.out.println("You win!");
		}
		//졌을때 12 23 31
		else if((temp==1&&RPS==2)||(temp==2&&RPS==3)||(temp==3&&RPS==1)) {
			System.out.println("You lose");
		}
		
	}
}
