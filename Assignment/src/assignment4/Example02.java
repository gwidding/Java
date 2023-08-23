package assignment4;

public class Example02 {
	public static void main(String[] args) {
		int num = 120;
		
		if (num < 50) { // num은 50보다 크므로 거짓 -> 실행x
			System.out.println("숫자가 50보다 작습니다.");
		}
		else { // 그 외의 경우로 위의 조건을 만족하지 않아 else문 실행
			System.out.println("숫자가 50보다 큽니다.");
		}
	}
}
