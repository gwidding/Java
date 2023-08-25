package chap06;

public class Array06 {

	public static void main(String[] args) {
		String s = " Java Programming "; // 양쪽에 공백 존재
		String s1 = "Java";
		String s2 = " Programming";
		
		String s3 = s1.concat(s2); // 두 문자열을 결합
		String s4 = s.trim(); // 양쪽에 공백 있으면 제거
		// 변화한 문자열 출력
		System.out.println("s3 " + s3);
		System.out.println("s4 " + s4);
		// s3과 s4가 같은지
		System.out.println("s3.equals(s4) " + s3.equals(s4));
		System.out.println(s3 == s4); // false
	}
}
