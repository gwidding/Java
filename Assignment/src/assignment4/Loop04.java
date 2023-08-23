package assignment4;

import java.util.Scanner;

public class Loop04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // Scanner 객체 생성
		System.out.print("길이: ");
		int len = s.nextInt(); // 입력받은 정수 len에 저장
		
		for (int i=0; i <len; i++) { // i는 0부터 len 미만까지 1씩 증가하며 반복실행
			for (int j = 0; j<i; j++) {  // 한 i당 j는 0부터 i미만까지 1 증가하며 실행
				System.out.print(" "); // 공백 출력
			}
			for (int j= 0; j < (2*len)-1-(i*2); j++) { // 위와 다른 새로운 j
				System.out.print("*");;
			}
			System.out.println(""); // i 하나에 대해 반복 끝나면 줄바꿈
		}
	}
}
