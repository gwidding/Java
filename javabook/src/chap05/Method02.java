package chap05;

public class Method02 { 
	public static int div() { // 정수를 반환하는 메서드 생성
		int a = 10, b = 5;
		int result = a / b; // 나눈 몫을 정수형 result에 저장
		return result; // div의 반환값은 정수
	}
	public static void main(String[] args) {
		int num = div(); // num변수에 div의 반환값 저장
		System.out.println(num); // num 출력
	}
}
