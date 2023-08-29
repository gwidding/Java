package chap08;

public class Kitten extends Cat { // Cat와 그 부모 Animal을 상속 받음
	void meow2() {
		System.out.println("새끼 고양이가 야옹하고 울다.");
	}
	@Override // 없어도 되지만 있으면 속도가 더 빠름
	public void sound() {
		System.out.println("새끼 고양이는 야옹하고 울다.");
	}
}
