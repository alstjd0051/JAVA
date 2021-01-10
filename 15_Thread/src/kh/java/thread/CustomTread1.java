package kh.java.thread;

public class CustomTread1 extends Thread {

	private char ch;

	public CustomTread1(char ch) {
		this.ch = ch;
	}

	/*
	 * 쓰레드 작업내용 
	 * 시작 - 끝!
	 */
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.print(ch);
		}
	}
}
