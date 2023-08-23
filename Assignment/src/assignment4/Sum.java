package assignment4;

public class Sum {

	public static void main(String[] args) {
		int sum = 0; // 선언 및 0으로 초기화
		for (int i = 0; i < 10; i++) { // i는 0부터 9까지 10번 반복
			sum += i; // 기존 sum에 i 더하기
		}
		// 0부터 9까지 총합 출력
		System.out.println("sum : " + sum);
	}
}
