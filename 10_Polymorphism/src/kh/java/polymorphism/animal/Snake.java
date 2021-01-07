package kh.java.polymorphism.animal;

public class Snake extends Animal {

	public void srr() {
		System.out.println("스르륽~");
	}
	
	@Override
	public void attack() {
		srr();
	}
	
	@Override
	public void talk_to_me() {
		System.out.println("안녕하세요, 스네이크 교수입니다.");
	}
}
