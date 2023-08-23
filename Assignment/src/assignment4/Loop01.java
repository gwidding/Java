package assignment4;

import java.util.Scanner;

public class Loop01 {
	public static void main(String[] args) {
		int sum = 0; // 정수형 변수 sum 선언 및 초기화
		System.out.println("5개의 숫자를 입력하세요.");
		Scanner s = new Scanner(System.in); // Scanner객체 생성
		
		for (int n = 1; n <= 5; n++) { // n이 1부터 5이하동안 5번 실행
			int num = s.nextInt(); // 입력받은 정수를 num에 저장
			sum += num; // sum에 입력받은 num을 더하고 저장
		}
		// for문 끝나면 sum 출력
		System.out.println("합계 : " + sum);
	}

}
