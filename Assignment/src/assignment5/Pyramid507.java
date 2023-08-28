package assignment5;

import java.util.Scanner;

public class Pyramid507 {
	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요: ");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		star(len);
		scan.close();
	}
	
	public static void star(int len) {
		for (int i = 1; i <= len; i++) {
			for (int j = 0; j < len-i; j++ ) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2*i-1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
