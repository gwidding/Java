package assignment4;

public class Continue01 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) { // 4번 반복
			for (int j = 1; j <= 3; j++) { // i하나당 중첩반복문 3번 반복
				if (i == 3 && j == 2) { // i가 3, j가 2일 때 실행
					continue; // 건너 뛰고 j에 관한 for 조건행으로
				}
				System.out.println(i + " * " + j); // i와 j 출력
			}
		}
	}
}
