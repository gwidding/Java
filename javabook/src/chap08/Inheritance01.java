package chap08;

public class Inheritance01 extends Calculation { // Calculation 상속받음
	public void multiplication(int x, int y) { // 곱셈 메서드
		z = x * y; // 부모에서 z이미 선언
		System.out.println("두 수의 곱셈 : " + z);
	}
	public static void main(String[] args) {
		int a = 20, b = 10;
		Inheritance01 obj = new Inheritance01(); // 객체 생성
		obj.addition(a, b); // 부모에서 성언된 메서드
		obj.subtraction(a, b); // 부모에서 선언된 메서드
		obj.multiplication(a, b);
	}

}
