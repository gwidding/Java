package chap05;

public class Example01 {

	public static void method() { // method라는 메서드 생성
		System.out.println("statis 메서드 입니다.");
		System.out.println(5 + 6); // 11 출력
	}
	public static void main(String[] args) {
		method(); // method 호출
	}
}
