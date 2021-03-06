package kh.java.thread;

import javax.swing.JOptionPane;

public class ThreadControlTest {

	public static void main(String[] args) {
		ThreadControlTest t = new ThreadControlTest();
//		t.test1();
//		t.test2();
//		t.test3();
		t.test4();
		System.out.println("[" + Thread.currentThread().getName()+"종료]");
		
	}
	
	/*
	 * Thread 종료시키기
	 * 1. 해당쓰레드의 interrupt() 메소드를 호출
	 * 2. InterruptedException 발생
	 * 3. Catch절에 다음액션(종료) 작성
	 */
	private void test4() {
		Thread cnt = new CountDown(100);
		cnt.start();
		
		JOptionPane.showMessageDialog(null, "확인을 누르면, 카운트다운을 종료합니다");
		cnt.interrupt();
	}

	/*
	 * Thread간의 종속관계
	 * 일반쓰레드 - daemon Thread
	 * 
	 * Daemon - linux계열의 컴퓨터에서 백그라운드 프로세스를 가리키는 말
	 */
	private void test3() {
		//Daemon Thread
		Thread cnt = new CountDown(50);
		cnt.setDaemon(true);
		cnt.start();
		
		
		//main thread 일시정지
		JOptionPane.showMessageDialog(null, "공쥬는 무슨?");
		
	}
	/**
	 * 3의 배수 출력 쓰레드와
	 * 4의 배수 출력 쓰레드를 생성하고 실행하세요.
	 * [Thread이름 - 배수]
	 * 실행간격은 200밀리초.
	 * 100초과시 중지할것.
	 * 
	 * [3배수 쓰레드 -3]
	 * [3배스 쓰레드 - 6]
	 * [4배수 쓰레드 - 4]
	 * [3배수 쓰레드 - 4]
	 * [3배수 쓰레드 - 12]
	 * [4배수 쓰레드 - 8]
	 * 
	 */
	private void test2() {
		Thread m3 = new Thread(new Gamble(3,200));
		Thread m4 = new Thread(new Gamble(4,200));
		
		m3.setName("3배수 쓰레드");
		m4.setName("4배수 쓰레드");
		
		m3.start();
		m4.start();
	}
	

	private void test1() {
		Thread a = new Thread(new SleepThread('※', 50));
		Thread b = new Thread(new SleepThread('＠', 30));
		
		a.setName("A-yo");
		b.setName("BOB");
		
		a.start();
		b.start();
		
	}

}
