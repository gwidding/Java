package chap06;

public class Example06 {

	public static void main(String[] args) {
		String s = " Java Programming "; // 문자열 선언
		System.out.println("s.length(): " + s.length());  // 문자열의 길이
		System.out.println("s.charAt(1): " + s.charAt(1));// 1번째 인덱스에 있는 문자
		System.out.println("s.substring(6): " + s.substring(6)); // 6번때 인덱스까지 빼고
		System.out.println("s.substring(5,13): " + s.substring(5,13)); // 5부터 13번째 인덱스
		System.out.println("s.indexOf('P'): " + s.indexOf("P"));   // 홀따옴표로 보내도 가능은 함
		System.out.println("s.toLowerCase(): " + s.toLowerCase()); // 모두 소문자로
		System.out.println("s.toUpperCase(): " + s.toUpperCase()); // 모두 대문자로
	}

}
