package kh.java.thread.synchronization;

public class Account {

	private int balance; // 잔액

	public Account(int balance) {
		this.balance = balance;
	}

	/*
	 * 출금매소드 : atm기는 이메소드를 통해 출금가능
	 * @param money
	 * 
	 * 동기화처리
	 * (결국 객체 단위로 동기화 처리 : )
	 * 1. synchronized 메소드 만들기
	 * 2. synchronized block 사용하기(추천) 
	 */
	public  void withraw(int money) { // 출금하고자하는금액
		String threadName = Thread.currentThread().getName();
		
		synchronized (this) {
			System.out.println("[" + threadName + " -> 잔액 :  ￦" + balance);
			if (money <= balance) {
				balance -= money;
				System.out.println("[" + threadName + "-> 출금 : ￦" + money + ", 잔액 : ￦" +balance + "]");
			} else {
				System.out.println("[" + threadName + "-> 출금 : ￦" + money + ",잔액이 부족합니다]");
			}
		}
	
	}

	public int getBalance() {
		return balance;
	}

}
