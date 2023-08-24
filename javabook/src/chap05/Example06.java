package chap05;

public class Example06 {
	// 메서드 오버로딩 : 같은 역할, 세세하게 다를 떄
	public static void calculate(int x, int y) { // 두 정수
		System.out.println(x*y); // 의 곱
	}
	public static void calculate(int x) { // 한 정수
		System.out.println(x*x); // 의 제곱
	}
	public static void calculate(int x, double y) { // 정수, 실수
		System.out.println(x*y); // 의 곱
	}
	public static void calculate(double x) { // 한 실수
		System.out.println(x*x); // 의 제곱
	}
	public static void main(String[] args) { // 메인 메서드
		calculate(2,3);	    // 첫 번째 메서드 호출
		calculate(2, 3.14); // 세 번째 메서드 호출
		calculate(2); 		// 두 번째 메서드 호출
		calculate(2.5); 	// 네 번째 메서드 호출
	}
}
