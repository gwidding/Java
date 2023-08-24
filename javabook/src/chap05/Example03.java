package chap05;

public class Example03 {
	public static int add(int x, int y) { // 두 정수를 매개변수로 받고, 반환값이 정수인 메서드 생성 
		return x + y; // 두 정수의 합을 반환
	}
	public static void main(String[] args) {
		int a = 5, b = 6;
		int sum = add(a,b); // a와 b 정수를 매개로 add 메서드 호출하여 sum변수에 저장
		System.out.println(a + "(와)과 " + b + "의 합은 " + sum + "입니다.");
	}
}
