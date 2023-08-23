package assignment4;

import java.util.Scanner;
public class Loop02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // Scanner 객체 생성
		int choice = 1; // 정수형 변수 choice 선언 및 초기화
		while (choice == 1) { // choice가 1인 동안 실행
			int a; // 정수형 변수 a 선언
			System.out.println("숫자를 입력하세요.");
			a = s.nextInt(); // 입력받은 정수 a에 저장
			
			if (a % 2 == 0) { // a가 짝수면 실행
				System.out.println("짝수입니다.");
			}
			else { // a가 홀수면 실행
				System.out.println("홀수입니다.");
			}
			// 1이면 while의 조건을 만족하므로 반복실행,
			// 0이면 while의 조건이 거짓으므로 실행x
			System.out.println("계속하고 싶다면 예 1, 그만하고 싶다면 아니요 0을 입력하세요");
			choice = s.nextInt(); // 입력받은 정수 choice에 할당
		}
		// while문 외부
		System.out.println("모든 숫자를 확인했습니다.");
	}
}
