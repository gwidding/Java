package assignment4;

import java.util.Scanner;

public class SwitchToIf {
	public static void main(String[] args) {
		 System.out.println("점수를 입력하세요.");
		 Scanner s = new Scanner(System.in); // Scanner 객체 생성
		 int num = s.nextInt(); 			 // 입력받은 정수 num에 저장
		 
		 num /= 10; // 입력받은 num을 10으로 나눈 몫 저장
		 if (num == 10 || num == 9) // 10이나 9이면 실행
			 System.out.println("A 학점");
		 else if (num == 8) // 8이면 실행
			 System.out.println("B 학점");
		 else if (num == 7) // 7이면 실행
			 System.out.println("C 학점");
		 else if (num == 6) // 6이면 실행
			 System.out.println("D 학점");
		 else // 그 외의 경우 실행
			 System.out.println("F 학점");
	}
}
