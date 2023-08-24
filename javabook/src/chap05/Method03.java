package chap05;

public class Method03 {
	public static int max(int x, int y) { // 두 정수를 받고, 정수를 반환하는 메서드 생성
		int result;
		if (x>y) result = x; // 앞의 정수가 크면 x
		else result = y; // 뒤의 정수가 크거나 같으면 y
		return result; // 정수 result 반환
	}
	public static void main(String[] args) {
		int a = 5, b = 6;
		int num = max(a,b); // a,b를 매개로 메서드 호출 -> 둘 중에 큰 값을 num에 저장
		System.out.println(a + "(와)과 " + b + "의 수 중 " + num + "이 큽니다.");
	}
}
