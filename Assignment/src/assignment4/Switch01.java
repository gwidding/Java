package assignment4;

import java.util.Scanner;
public class Switch01 {
	public static void main(String[] args) {
		 System.out.println("점수를 입력하세요.");
		 Scanner s = new Scanner(System.in); // Scanner 객체 생성
		 int num = s.nextInt(); // 입력받은 정수 num에 저장
		 
		 switch (num / 10) { // num을 10으로 나눈 몫으로 스위치문
		 case 10: // 몫이 10일 경우 -> 코드 따로 없으므로 case 9의 코드 실행
		 case 9: // 몫이 9일 경우
			 System.out.println("A 학점");
			 break; // 출력했으면 break로 스위치문 빠져나감
		 case 8: // 몫이 8일 경우
			 System.out.println("B 학점");
			 break; 
		 case 7: // 몫이 7일 경우
			 System.out.println("C 학점");
			 break;
		 case 6: // 몫이 6일 경우
			 System.out.println("D 학점");
			 break;
		 default: // 그 외의 경우
			 System.out.println("F 학점");
		 	 break;
		 }
	}
}
