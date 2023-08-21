package assignment3;

public class Example03 {

	public static void main(String[] args) {
		int x = 10; // 정수형 변수 a 선언
		System.out.println(x < 10 && x < 20);
		// false and true -> false
		System.out.println(x < 10 || x < 20);
		// false or true -> true 
		System.out.println(!(x < 10 && x < 20));
		// !false -> true
	}
}
