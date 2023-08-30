package chap09;

public class Cat extends Animal {
	// Animal에서 추상화 했던 메서드 재정의 안 하면 오류

	public void printSound() {
		System.out.println("고양이는 야옹야옹");
	}
}
