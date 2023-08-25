package assignment6;

import java.util.Scanner;

public class Score602 {

	public static void main(String[] args) {
		int[][] score = new int[5][3];
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[1].length; j++) {
				System.out.print((i+1) + "번 학생의 ");
				if (j == 0) {
					System.out.print("국어 점수: ");
					score[i][j] = s.nextInt();					
				}
				else if (j == 1) {
					System.out.print("영어 점수: ");
					score[i][j] = s.nextInt();
				}
				else {
					System.out.print("수학 점수: ");
					score[i][j] = s.nextInt();
				}
			}	
		}
		
		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			for (int j = 0; j < score[1].length; j++) {
				sum += score[i][j];
			}
			double average = sum / score[i].length;
			System.out.println((i+1) + "번 학생의 총점: " + sum +", "+(i+1) + "번 학생의 평균: " + average);
		}
	}

}
