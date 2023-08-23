package assignment4;

import java.util.Scanner; // 입력받기 위해

public class If04 {
	public static void main(String[] args) {
		System.out.println("3개의 숫자를 입력하세요.");
		
		Scanner s = new Scanner(System.in); // Scanner 객체 생성
		int x = s.nextInt(); // 첫 정수 입력받아 x에 할당
		int y = s.nextInt(); // 정수 입력받아 y에 할당
		int z = s.nextInt(); // 정수 입력받아 z에 할당
		
		if (x > y) { // x가 y보다 클 경우 실행
			if (x > z) { // x>y이고 x>z인 경우 실행됨
				System.out.println(x + "는 가장 큰 정수입니다.");
			}
			else { // x>y이고 x가 z보다 작거나 같을 때 실행
				System.out.println(x + "는 가장 큰 정수가 아닙니다.");
			}
		}
		else { // x가 y보다 작거나 같을 때 실행
			System.out.println(x + "는 가장 큰 정수가 아닙니다.");
		}
	}

}
