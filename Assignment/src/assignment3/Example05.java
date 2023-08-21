package assignment3;

public class Example05 {

	public static void main(String[] args) {
		int x = 10; // 정수형 변수 x 선언
		System.out.println(x++); // x 출력 후 1 더함
		System.out.println(++x); // x(11)에 1증가 후 출력 -> 12
		System.out.println(x--); // x(12) 출력 후 1 갑소
		System.out.println(--x); // x(11)에 1감소 후 출력 -> 10
	}
}
