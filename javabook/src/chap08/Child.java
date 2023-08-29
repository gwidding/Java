package chap08;

public class Child extends Parent { // Parent의 자식 클래스
	String name = "홍길동";
	
	public void details() {
		super.details(); // 부모 클래스의 메서드
		System.out.println(name);
	}
		
	public void printDetails() {
		details(); // 현재 클래스에서 선언한 메서드
		System.out.println("부모 이름 : " + super.name); // 부모 멤버 변수
		System.out.println("자식 이름 : " + name); // 현재 멤버 변수
	}
	
}
