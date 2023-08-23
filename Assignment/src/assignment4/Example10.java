package assignment4;

public class Example10 {
	public static void main(String[] args) {
		for (int i = 2; i<=4; i++) { // i가 2부터 4까지 하나씩 증가하며 반복 -> 3번 반복
			System.out.println("구구단 " + i + "단");
			// 중첩 반복문, 한 i당 j 하나씩 증가시키며 10번 반복실행
			for (int j = 1; j <= 10; j++) { 
				System.out.println(i+ " * " + j + " = " + i*j ); // i와 j의 곱 출력
			}
		}
	}
}
