package chap06;

public class Example03 {

	public static void main(String[] args) {
		int[][] myArr = new int[2][4]; // 2x4 배열 선언 및 메모리 할당
		myArr[0][0] = 2; // 요소 저장
		myArr[0][1] = 5;
		myArr[0][2] = 7;
		myArr[0][3] = 4;
		myArr[1][0] = 9;
		myArr[1][1] = 3;
		myArr[1][2] = 2;
		myArr[1][3] = 8;
		int sum1 = 0, sum2 = 0; // 변수 선언 및 초기화
		for (int i = 0; i < 4; i++) { // 배열의 열 크기만큼
			sum1 += myArr[0][i]; // 1행의 요소 누적합
		}
		System.out.println("첫 번째 행의 합계: " + sum1);
		for (int i = 0; i < 4; i++) { // 배열의 열 크기만큼
			sum2 += myArr[1][i]; // 2행의 요소 누적합
		}
		System.out.println("두 번째 행의 합계: " + sum2);
	}
}
