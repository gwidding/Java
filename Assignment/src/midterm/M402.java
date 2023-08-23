package midterm;

import java.util.Scanner;
public class M402 {
	public static void main(String[] args) {
		System.out.print("첫 번째 숫자를 입력하세요: ");
		Scanner s = new Scanner(System.in);
		int first = s.nextInt();
		System.out.print("두 번째 숫자를 입력하세요: ");
		int second = s.nextInt();
		int sum = 0;
		for (int i = first; i <= second; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println();
		System.out.println("입력 받은 두 숫자 중 3의 배수의 합: " + sum);
	}
}
