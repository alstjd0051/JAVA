package kh.java.polymorphism.animal;

public class Cat extends Animal implements Runnable, Bitable {

	public void punch() {
		System.out.println("냥냥 펀치!");
	}
	
	
	@Override
	public void attack() {
		punch();
	}
	
	
	@Override
	public void talk_to_me() {
		System.out.println("안녕하세요 고양이입니다.");
	}
	
	@Override
	public void run() {
		System.out.println("고양이가 익스펙토 펙트러놈.");
	}
	
	@Override
	public void bite(String sound) {
		System.out.println("고양이는 사람말을 합니다 " + sound);
	}
	
	@Override
	public void Flyable(String Eagle) {
		System.out.println("PRrrrrrrrrrr" + Eagle);
	}
	
}
