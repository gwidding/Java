package assignment6;

import java.util.Scanner;

public class KoreanScore601 {

	public static void main(String[] args) {
		int[] koreanScore = new int[5];
		int sum = 0;
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < koreanScore.length; i++) {
			System.out.print((i+1) + "번 학생의 국어 점수: ");
			koreanScore[i] = s.nextInt();
			sum += koreanScore[i];
		}
		
		double average = sum / koreanScore.length;
		System.out.println("합계: " + sum);
		System.out.println("평균: " + average);
		s.close();
	}
}
