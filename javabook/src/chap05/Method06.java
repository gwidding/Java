package chap05;

public class Method06 {
	public static int sum(int x, int y) { // 두 정수
		return (x+y); // 의 합
	}
	public static int sum(int x, int y, int z) { // 세 정수
		return (x+y+z); // 의 합
	}
	public static double sum (double x, double y) { // 두 실수
		return (x+y); // 의 합
	}
	public static void main(String[] args) { // 메인 메서드
		System.out.println("sum(10, 20)의 값 : " + sum(10, 20)); // 메서드1 호출
		System.out.println("sum(10, 20, 30)의 값 : " + sum(10, 20, 30)); // 메서드2 호출
		System.out.println("sum(10.5, 20.5)의 값 : " + sum(10.5, 20.5)); // 메서드3 호출
	}
}
