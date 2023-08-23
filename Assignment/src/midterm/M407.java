package midterm;

import java.util.Scanner;

public class M407 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("첫 번째 숫자를 입력하세요: ");
		int first = s.nextInt();
		s.nextLine();
		
		System.out.print("사칙연산 기호를 입력하세요: ");
		String op = s.nextLine();
		
		System.out.print("두 번째 숫자를 입력하세요: ");
		int second = s.nextInt();
		
		int result=0;
		if (op.equals("+")) result = first+second;
		else if (op.equals("-")) result = first-second;
		else if (op.equals("*")) result = first*second;
		else if (op.equals("/")) result = first/second;
		else System.out.println("잘못 입력했습니다.");
		System.out.println(first + op + second +"="+ result);
	}
}
