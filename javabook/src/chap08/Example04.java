package chap08;

public class Example04 {
	public static void main(String[] args) {
		Cat objCat = new Cat(); // Cat의 객체 생성
		objCat.meow(); // Cat 클래스의 메서드
		objCat.eat(); // Cat의 부모 클래스 Animal의 메서드
		Dog objDog = new Dog(); // Dog의 객체 생성
		objDog.bark(); // Dog 클래스의 메서드
		objDog.eat(); // Dog의 부모 클래스 Animal의 메서드
	} 
}
