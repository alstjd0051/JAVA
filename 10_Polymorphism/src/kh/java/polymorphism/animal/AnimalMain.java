package kh.java.polymorphism.animal;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnimalMain am = new AnimalMain();
//		am.test1();
//		am.test2();
//		am.test3();
		
		/*
		 * 다형성의 활용
		 * 1. 매개변수 선언부
		 * 2 리턴 값 처리
		 */
//		am.test4(); //매개변수 선언부
//		am.test5(); //리턴값 처리
//		am.test6(); //동적바인딩
//		am.test7();
//		am.test8(); // 인터페이스
		am.test9();
	}

	/*
	 * 상속을 전개로 자식객체를 부모타입의 참조변수에 담아 제어할 수 있다.
	 * (다형성) 단, 자식 클래스에 선언자원은 사용할 수 없다.
	 * 
	 */
	public void test1() {

		Cat cat = new Cat();
		cat.talk_to_me();
		cat.punch();

		Animal animal1 = cat;
		System.out.println(cat == animal1); // 주소값 비교 true
		animal1.talk_to_me();
//		animal1.punch(); // 부모타입의 변수에 담으면 자식클래스에서 선언한 자원(필드,메소드)를 사용할수 없다.

		Object obj1 = cat;
//		obj1.say();
//		obj1.puch();
		System.out.println(obj1.hashCode());

		System.out.println("==================================");
		// 다시 자식타입의 변수에 담으면 자식타입의 자원 사용 가능
//		Animal animal2 = (Animal)obj1;
//		animal2.say();
		((Animal) obj1).talk_to_me(); // 37,38,41,42번줄을 한줄로 정리

//		Cat cat2 = (Cat)animal2;
//		cat2.punch();

		System.out.println("=========================");
		((Cat) obj1).punch();
//		((Dog)obj1).kick(); //형변환 오류
	}

	/*
	 * 형변환
	 * - upcasting 부모타입으로 형변환. 자동(암묵적)형변환 
	 * - downcasting 자식타입으로 형변환. 수동(명시적)형변환
	 */
	public void test2() {
		Animal animal = new Dog(); // upcasting
		Dog dog = (Dog) animal; // downcasting

		dog.kick();
	}

	/*
	 * Animal a = new Dog();
	 * 
	 * 부모타입의 배열에 자식객체를 담을 수 있다.
	 */
	public void test3() {
		Animal[] arr = new Animal[3];
		arr[0] = new Cat();
		arr[1] = new Dog();
//		arr[2] = new Animal();
		arr[2] = new Cat();
		
		System.out.println(arr[0] instanceof Cat); //true
		System.out.println(arr[0] instanceof Dog); //false
		System.out.println(arr[0] instanceof Animal); //true
		System.out.println(arr[0] instanceof Object); //true

		// Animal anml = new Dog();
		for (Animal anml : arr) {
			anml.talk_to_me();
			//instanceof 해당타입의 객체인 경우 true 리턴
			//true가 리턴된 경우, 해당타입으로의 안전한 형변환 보장
			
			// Cat객체인 경우
			if (anml instanceof Cat) {
				((Cat) anml).punch();
			} 
			//Dog객체인 경우
			else if (anml instanceof Dog) {
				((Dog) anml).kick();
			}
		}

	}
	
	/*
	 * 매개변수 선언부에서 다형성 활용하기
	 */
	public void test4() {
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		attack(cat);
		attack(dog);
	}
	
	public void attack(Animal animal) { //매개변수에 캣 과 도그를 담았다.
		if(animal instanceof Cat) {
			((Cat) animal).punch();
		}
		else if(animal instanceof Dog) {
			((Dog) animal).kick();
		}
	}
	
	
	
//	public void attack(Cat cat) {
//		cat.punch();
//	}
//	public void attack(Dog dog) {
//		dog.kick();
//	}
	
	public void test5() {
//		makeCat();
		Animal cat = makeCat();
		Animal dog = makeDog();
		
		Animal[] arr = new Animal[100];
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 ==0)
				arr[i] = makeDog();
			else
				arr[i] = makeCat();
		}
	}
	
	public Cat makeCat() {
		return new Cat();
	}
	public Dog makeDog() {
		return new Dog();
	}
	
	/*
	 *  ※동적바인딩
	 * 1. 상속 & 부모클래스의 메소드 오버라이딩 say
	 * 2. 자식객체를 부모타입으로써 제어, 해당 매소드 호출
	 * 자동으로 자식타입의 재작성한 메소드가 호출된다.
	 * 다운캐스팅없이 자식메소드 사용 가능.
	 * 
	 * 
	 *  ※정적바인딩
	 * - 동일한 타입의 메소드를 호출한다.
	 */
	public void test6() {
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		
		System.out.println();
		
		a1.talk_to_me();
		a2.talk_to_me();
		
		//다형성을 이용한 attack
		Animal[] arr = new Animal[100];
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 ==0)
				arr[i] = makeDog();
			else
				arr[i] = makeCat();
		}
		
		//실행
		for(Animal anm : arr)
			anm.attack(); //동적바인딩 자식클래스의 오버라이드한 메소드가 호출됨.
	}
	
	/*
	 * 추상클래스 Animal
	 */
	public void test7() {
//		Animal a = new Animal(); //Cannot instantiate the type Animal
		Animal a = new Cat();
		Animal b = new Dog();
		Animal c = new Snake();
		//추상클래스 Animal을 상속한 자식클래스는 
		//무조건 추상메소드 attack구현을 보장받는다.
		
		
		a.attack();
		b.attack();
		c.talk_to_me();
		
		
	}
	
	/*
	 * 인터페이스는 객체화 할 수 없다.
	 * 인터페이스 역시 부모타입으로 다형성을 적용할 수 있다.
	 * 
	 */
	public void test8() {
		
		Runnable r1 = new Dog();
		Runnable r2 = new Cat();
		
		r1.run();
		r2.run();
		
//		r1.say(); //Animal 재작성 메소드 say
//		r1.attack(); // Animal의 재작성 메소드 attack1
//		r1.kick(); //Dog의 kick1
		
		((Dog)r1).say();
		((Dog)r1).attack();
		((Dog)r1).kick();
		
		//상수
		System.out.println(Runnable.LEGS);
		
		Bitable b1 = new Dog();
		Bitable b2 = new Cat();
		b1.bite("멍멍~");
		b2.bite("미야아옹");
		
		System.out.println("====================");
		
		Dog d1 = (Dog)b1;
		d1.attack();
		d1.bite("멍멍");
		d1.kick();
		d1.say();
		
		System.out.println("===========================");
		
		Animal a1 = d1;
		a1.attack();
		a1.say();
		
		
		}
	public void test9() {
		Eagle e1 = new Eagle();
		Flyable e2 = new Eagle();
		Animal e3 = new Eagle();
		
		e1.attack();
		e1.fly("퍼드득");
		
		e2.fly("푸더더덕");
		
		e3.attack();
	}
}
