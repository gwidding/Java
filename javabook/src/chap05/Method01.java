package chap05;

public class Method01 {
	public static void method() { // 메서드 생성
		System.out.println("static 메서드입니다.");
		System.out.println(5 + 6); // 11출력
	}
	
	
	public static void main(String[] args) {
		System.out.println("첫 번째 호출 메서드입니다.");
		
		method(); // 메서드 호출 -> 11 출력
		
		System.out.println("두 번째 호출 메서드입니다.");
		
		method(); // 메서드 호출 -> 11 출력

	}
}
