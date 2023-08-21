package assignment3;

public class Typeconversion09 {

	public static void main(String[] args) {
		float f = 9.123456789f; // 실수형 변수 f 선언
		double d = 9.23456789;  // 더블형 변수 선언
		double d2 = (double)f;  // float f를 double로 형변환
		
		// 변수에 해당하는 값 출력
		System.out.println("f = " + f);
		System.out.println("d = " + d);
		System.out.println("d2 = " + d2);
	}
}
