package chap05;

public class Method05 {
	public static void calculate(int x, double y) { // 정수와 실수를 받는 메서드 생성
		System.out.println(2*x*y); // 계산 결과 출력됨
	}
	public static void main(String[] args) { // 메인 메서드
		int a = 4; 	 	  // 반지름
		double pi = 3.14; // 원주율
		System.out.println("원의 둘레 구하는 공식 : 2 x 반지름 x 원주율");
		
		System.out.print("2 x " + a + " x " + pi + " = ");
		calculate(a, pi); // 4와 3.14를 넣어 메서드 호출
	}
}
