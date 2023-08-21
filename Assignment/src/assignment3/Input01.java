package assignment3;

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in); //Scanner 객체 생성
		System.out.println("정숫값 입력하기");
		int n = s1.nextInt(); // int형 입력 받아 n에 저장
		
		System.out.println("실숫값 입력하기");
		double db = s1.nextDouble(); //double로 입력받아 db에 저장
		System.out.println("정숫값 : "+ n);   // n출력
		System.out.println("실숫값 : " + db); // db출력
	}

}
