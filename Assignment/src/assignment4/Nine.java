package assignment4;

public class Nine {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) { // 1단부터 9단까지 실행
			System.out.println("**********");
			System.out.println("구구단 " + i + " 단"); // i 바뀔 때 알림
			System.out.println("**********");
			for (int j = 1; j < 10; j++) { // i단에 대해 1부터 9까지의 곱
				System.out.println(i+ " * " + j + " = " + i*j);
			}
		}
	}
}
