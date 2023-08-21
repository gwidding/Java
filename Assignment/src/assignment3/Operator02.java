package assignment3;

public class Operator02 {

	public static void main(String[] args) {
		int a = 10, b = 25; // 정수형 변수 선언
		System.out.println("a == b = " + (a == b));
		// a, b는 서로 다름 -> false
		System.out.println("a != b = " + (a != b));
		// 다르니 true
		System.out.println("a > b = " + (a > b));
		// 10은 더 작으니 false
		System.out.println("a < b = " + (a < b));
		// 더 작으니 true
		System.out.println("b >= a = " + (b >= a));
		// 25가 더 크니 true
		System.out.println("b >= a = " + (b <= a));
		// 더 크니 false
	}
}
