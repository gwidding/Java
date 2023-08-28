package chap07;

public class Cat { // Cat class 선언
	// 멤버 변수 선언
	String breed;  
	String color;
	int age = 10;
	
	// 기본 생성자 선언
	Cat() {
		System.out.println("Cat() 생성자 호출합니다.");
	}
	
	Cat(String pBreed) {
		System.out.println("Cat(...) 생성자 호출합니다.");
		breed = pBreed;
	}
	
	Cat(String pBreed, String pColor) {
		System.out.println("Cat(..., ...) 생성자 호출합니다.");
		breed = pBreed;
		color = pColor;
	}
		
	
	// 멤버 메서드 선언
	void eat() {
		System.out.println("먹이를 먹다");
	}
	void scratch() {
		System.out.println("발톱으로 할퀴다");
	}
	void meow() {
		System.out.println("야옹 하고 울다");
	}
	
	
}
