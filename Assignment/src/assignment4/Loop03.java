package assignment4;

import java.util.Scanner;

public class Loop03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // Scanner 객체 생성
		System.out.println("10보다 큰 숫자를 입력하세요.");
		int x = s.nextInt(); // 입력받은 정수 x에 저장
		int sum = 0; // 정수형 변수 sum 선언 및 0으로 초기화
		
		do { // do~while문, 일단 한 번 실행
			sum += x; // sum에 x 더해서 저장
			x--; 	  // x 하나 감소
		} while (x >= 10); // do문 x가 10 이상일 동안 반복
		// do~while문 외부
		System.out.println("합계 : " + sum);
	}
}
