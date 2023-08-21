package assignment3;

public class Operator03 {

	public static void main(String[] args) {
		int a = 5, b = 10; // 정수형 변수 a,b 선언
		
		System.out.println(a > b);
		// a가 더 작으므로 false
		System.out.println(!(a > b));
		// !false -> true
		System.out.println((a==b) && (a==5));
		// false && true -> false 
		System.out.println((a!=b) && (a==5));
		// true && true -> true
		System.out.println(!((a!=b) && (a==5)));
		// !true -> false
	}
}
