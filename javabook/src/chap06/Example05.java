package chap06;

public class Example05 {

	public static void main(String[] args) {
		String s1 = "Java"; // 보통 이렇게 많이 씀
		String s2 = "Java"; // 클래스를 이용
		
		String s3 = new String("Java"); // 이렇게도 가능
		String s4 = new String("Java"); // 배열을 이용
		System.out.println(s1); // 문자열 출력
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		if (s1 == s2) System.out.println("같다"); // 같음
		else System.out.println("다르다");
		
		if (s3 == s4) System.out.println("같다"); // 다름
		else System.out.println("다르다");
	}
}
