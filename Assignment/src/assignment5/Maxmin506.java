package assignment5;

import java.util.Scanner;

public class Maxmin506 {
	public static void max(int a, int b, int c) {
		if (a > b){ 
			if (a > c) System.out.println(a + "는 가장 큰 정수입니다.");
			else System.out.println(c + "는 가장 큰 정수입니다.");
		}
		else if (b > c) System.out.println(b + "는 가장 큰 정수입니다.");
		else System.out.println(c + "는 가장 큰 정수입니다.");
	}
	public static void min(int a, int b, int c) {
		if (a < b){ 
			if (a <= c) System.out.println(a + "는 가장 작은 정수입니다.");
			else System.out.println(c + "는 가장 작은 정수입니다.");
		}
		else if (b < c) System.out.println(b + "는 가장 작은 정수입니다.");
		else System.out.println(c + "는 가장 작은 정수입니다.");
	}
	
	public static void main(String[] args) {
		System.out.println("3개의 숫자를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		
		max(x, y, z);
		min(x, y, z);
		scan.close();
	}
}
