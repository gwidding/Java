package chap06;

public class Example07 {
	public static void main(String[] args) {
		// 문자열 선언
		String s1 = "Java";
		String s2 = "Java";
		String s3 = "java";
		System.out.println(s1 == s2); // 같으니 true
		System.out.println(s1 != s2); // 같으니 false
		
		System.out.println(s2 == s3); // 같지 않으니 false
		System.out.println(s2 != s3); // 같지 않으니 true
		String s4 = s2 + s3; // 이어 붙임
		System.out.println(s4);
	}
}
