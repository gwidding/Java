package assignment4;

public class Example04 {
	public static void main(String[] args) {
		int num = 70;
		if (num < 100) { // num이 100보다 작을 때 실행-> 실행o
			System.out.println("숫자가 100보다 작습니다.");
			if (num > 50) { // num이 100보다 작고 50보다 클 때 실행->실행x
				System.out.println("숫자가 50보다 큽니다.");
			}
		}
	}
}
