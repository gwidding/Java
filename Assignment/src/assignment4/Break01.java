package assignment4;

public class Break01 {
	public static void main(String[] args) {
		for (int i =0; i < 10; i++) { // 10번 반복
			if (i == 5) // i가 5이면
				break; // for문 빠져나감
			System.out.println("i: " + i); // i 출력
		}
	}
}
