package assignment4;

import java.util.Scanner; // 키보드로 입력받기 위해 할당

public class If01 {
	public static void main(String[] args) {
		System.out.println("당신의 나이를 입력하세요.");
		
		Scanner s = new Scanner(System.in); // Scanner 객체 생성
		int age = s.nextInt(); // 정수 입력 받아서 age에 저장
		
		if (age >= 18) { // 입력한 수가 18보다 크거나 같을 경우 실행
			System.out.println("당신의 나이는 18세 이상입니다.");
			System.out.println("당신은 투표할 자격이 있습니다.");
		}
		// if문 외부
		System.out.println("이 문장은 if문 외부에 있습니다.");
	}
}
