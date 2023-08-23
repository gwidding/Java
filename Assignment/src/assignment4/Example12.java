package assignment4;

public class Example12 {
	public static void main(String[] args) {
		for (int i = 0; i<= 10; i++) { // 11번 반복
			if (i == 3 || i == 6 || i ==9) { // i가 3 또는 6 또는 9일 때 실행
				continue; // 반복문의 끝으로 이동 -> for문 조건 판단
			}
			System.out.println(i +" ");
		}
	}
}
