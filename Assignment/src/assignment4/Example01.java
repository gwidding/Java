package assignment4;

public class Example01 {
	public static void main(String[] args) {
		int num = 10;
		if (num > 15) { // num은 15보다 작으므로 조건식은 거짓 -> if문 실행
			System.out.println("숫자가 15보다 큽니다.");
		}
		// if문 외부
		System.out.println("이 문장은 if문 외부에 있습니다.");
	}
}
