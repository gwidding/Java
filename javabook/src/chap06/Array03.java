package chap06;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		double[][] marks = new double[2][3]; // 2x3 배열 선언 및 메모리할당
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < 2; i++) { // 학생 총 2명
			System.out.println("학생번호" + (i+1)); // 인덱스는 0부터 시작하니 +1
			System.out.print("국어점수 : ");
			marks[i][0] = s.nextDouble(); // 학생의 국어점수 입력
			
			System.out.print("수학점수 : ");
			marks[i][1] = s.nextDouble(); // 학생의 수학점수 입력
			
			marks[i][2] = (marks[i][0] + marks[i][1])/2; // 평균 계산
		}
		for (int i = 0; i < 2; i++) { // 2명의 학생, 점수&평균 출력
			System.out.println("학생번호" + (i+1));
			System.out.print("국어:" + marks[i][0] +" " );
			System.out.print("수학:" + marks[i][1] +" " );
			System.out.println("평균:" + marks[i][2] +" " );
		}
		s.close();
	}
}
