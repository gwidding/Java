package assignment4;

import java.util.Scanner; // 입력받기 위해
public class If03 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요.");
		
		Scanner s = new Scanner(System.in); // Scanner 객체 생성
		int grade = s.nextInt(); // 정수 입력받아 grade에 값 할당
		
		if (grade >= 90) { // 입력받은 grade가 90이상일 때 실행
			System.out.println("A 학점");
		}
		else if (grade >= 80) { // 90보다 작고 80이상일 때 실행
			System.out.println("B 학점");
		}
		else if (grade >= 70) { // 80보다 작고 70이상일 때 실행
			System.out.println("C 학점");
		}
		else if (grade >= 60) { // 70보다 작고 60이상일 때 실행
			System.out.println("D 학점");
		}
		else { // 60보다 작을 때 실행
			System.out.println("F 학점");
		}
	}
}
