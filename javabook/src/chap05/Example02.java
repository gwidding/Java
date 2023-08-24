package chap05;

public class Example02 {
	public static String greeting() { // String을 반환하는 메서드 생성
		return "Hi"; // Hi라는 문자열을 반환
	}
	public static void main(String[] args) {
		String str = greeting(); // str에 greeting메서드의 반환값 저장
		System.out.println(str + "JAVA");
	}
}
