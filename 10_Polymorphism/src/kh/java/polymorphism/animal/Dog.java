package kh.java.polymorphism.animal;

public class Dog extends Animal implements Runnable {

	public void kick() {
		System.out.println("견 킥 날림!");
	}
	
	@Override
	public void attack() {
		kick();
	}
	
	@Override
	public void talk_to_me() {
		System.out.println("안녕하세요 , 저는 강아지입니다.");
	}
	
	@Override
	public void run() {
		System.out.println("강아지가 깡총깡총 뜁니다.");
	}

	public void say() {
		System.out.println("왈왈~");
	}
	
}
