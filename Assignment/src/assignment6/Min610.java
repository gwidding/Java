package assignment6;

import java.util.Scanner;

public class Min610 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] arr = new int[9][9];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[1].length; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		int max = 0;
		int indexR =0, indexC = 0;
		
		for (int i = 0; i <  arr.length; i++) {
			for (int j = 0; j <  arr[1].length; j++) {
				if (max < arr[i][j]) {
					max = arr[i][j];
					indexR = i+1;
					indexC = j+1;
				}
			}
		}
		
		System.out.println("입력된 값 중 최대값은: " + max);
		System.out.println("최대값의 좌표는: " + indexR +"행 " + indexC + "열" );
		s.close();
	}

}
