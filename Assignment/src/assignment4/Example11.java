package assignment4;

public class Example11 {
	public static void main(String[] args) {
		for (int n = 1; n <= 5; n++) { // 5번 실행
			System.out.println("*");   // *출력
			if (n == 2) { // n이 2일 때
				break; 	  // for문 빠져나감
			}
		}
	}
}
