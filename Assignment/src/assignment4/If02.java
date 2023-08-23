package assignment4;

import java.util.Scanner; // 입력받기 위해 할당

public class If02 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요.");
		
		Scanner s = new Scanner(System.in); // Scanner객체 생성
		int num = s.nextInt(); // 정수 입력받아 num에 저장
		
		if (num % 2 == 0) { // num이 짝수면 실행
			System.out.println(num + "은 짝수입니다.");
		}
		else { // 그 외의 경우, 즉 num이 홀수일 때 실행
			System.out.println(num + "은 홀수입니다.");
		}
		// if문 외부
		System.out.println("이 문장은 if문 외부에 있습니다.");
	}
}
