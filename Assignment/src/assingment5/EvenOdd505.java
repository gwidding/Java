package assingment5;

import java.util.Scanner;

public class EvenOdd505 {
	public static void Loop() {
		Scanner scan = new Scanner(System.in);
		int x = 1, y = 1;
		
		while (x == 1 && y == 1) {
			System.out.println("숫자를 입력하세요.");
			int input = scan.nextInt();
			if (input % 2 == 0) System.out.println("짝수입니다.");
			else System.out.println("홀수입니다.");
			
			do {
				System.out.println("계속하고 싶으면 예 1, 그만하고 싶다면 아니요 0을 입력하세요.");
				x = scan.nextInt();
				if (x!= 1 && x != 0) System.out.println("잘못 입력하였습니다. 다시입력하세요");
			} while (x != 0 && x != 1);
		}
		System.out.println("프로그램을 종료합니다.");
		scan.close();
	}
	public static void main(String[] args) {
		Loop();
	}
}
