package chap06;

public class Example04 {

	public static void main(String[] args) {
		int myArr[][] = { {1, 2, 3, 4, 5}, // 2차원 배열 선언 및 초기화
						  {6, 7, 8, 9, 10},
						  {11, 12, 13, 14, 15} };
		for (int i = 0 ; i < 3; i++) { // 행 개수
			for (int j = 0; j < 5; j++) { // 열 개수
				System.out.print(myArr[i][j] + " "); // 각 요소 출력
			}
			System.out.println(); // 행 끝나면 줄바꿈
		}
		System.out.println("myArr[0][1] 값: " + myArr[0][1]); // 1행2열 요소
	}
}
