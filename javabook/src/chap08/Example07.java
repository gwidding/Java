package chap08;

public class Example07 {
	public static void main(String[] args) {
		int a = 4, b = 5;
		double c = 11.12, d = 21.34;
		Calculate obj = new Calculate(); // 객체 생성
		System.out.println(obj.add(a,b)); // 두 정수의 합 출력
		System.out.println(obj.add(c,d)); // 두 실수의 합 출력

	}
}
