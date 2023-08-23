package assignment4;

import java.util.Scanner;

public class WhileToSwitch {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // Scanner 객체 생성
		int choice = 1;
		while (choice == 1) { // choice가 1인 동안 실행
			int a;
			System.out.println("숫자를 입력하세요.");
			a = s.nextInt(); // 입력받은 정수 a에 저장
			
			if (a % 2 == 0) { // a가 짝수면 실행
				System.out.println("짝수입니다.");
			}
			else { 			  // a가 홀수면 실행
				System.out.println("홀수입니다.");
			}

			System.out.println("계속하고 싶다면 예 1, 그만하고 싶다면 아니요 0을 입력하세요");
			int input = s.nextInt(); // 입력받은 정수 choice에 할당
			switch (input) {
			case 1 :  // 1 입력하면 다시 반복하기 위해 choice에 1
				choice = 1;
				break;
			case 0 :
				choice = 0;
				break;
			}
		}
		System.out.println("모든 숫자를 확인했습니다.");
	}
}
