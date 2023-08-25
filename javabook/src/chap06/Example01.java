package chap06;

public class Example01 {
	public static void main(String[] args) {
		int[] myArr = new int[5]; // 크기 5인 배열 선언, 메모리 할당
		myArr[0] = 10; // 0번째 값에 10 저장
		myArr[1] = 20;
		myArr[2] = 30;
		myArr[3] = 40;
		myArr[4] = 50;
		for (int i = 0; i < 5; i++) // 모든 요소의 값 출력
			System.out.println(i+ "번째 요소값 : " + myArr[i]);
	}
}
