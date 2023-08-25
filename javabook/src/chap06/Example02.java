package chap06;

public class Example02 {

	public static void main(String[] args) {
		int[] myArr = {10, 20, 30, 40, 50}; 	// 배열 초기화
		for (int i = 0; i < myArr.length; i++)  // 배열 크기만큽 반복하여 값 출력
			System.out.println(i + "번째 요소값: " + myArr[i]);
	}
}
