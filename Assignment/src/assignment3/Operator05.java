package assignment3;

public class Operator05 {

	public static void main(String[] args) {
		int a = 10, b = 10, c = 10, d = 10; // 정수형 변수 a~d 선언
		
		System.out.println("a++ => " + (a++));
		// a(10) 출력 후 1증가
		System.out.println("a => " + a);
		// a(11) 출력
		System.out.println("++b => " + (++b));
		// b 1증가 (11) 후 출력
		System.out.println("c-- => " + (c--));
		// c(10) 출력 후 감소
		System.out.println("--d => " + (--d));
		// d(10) 1감소 (9) 후 출력
	}
}
