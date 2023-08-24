package chap05;

public class Example05 {
	public static void add(int x, int y){ // 두 정수를 매개로 받는 메서드 생성
		System.out.println(x + "(와)과 " + y +"의 합은 " + (x+y) + "입니다.");
	} // 두 정수의 합을 출력하는 메서드 생성
	public static void main(String[] args) { // 메인 메서드
		int a = 5, b = 6;
		add(a,b); // a, b를 매개로 하는 add메서드 호출
	}
}
