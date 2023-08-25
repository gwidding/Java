package chap06;

public class Array04 {

	public static void main(String[] args) {
		int rows= 2, columns = 3; // 행, 열의 수
		int[][] firstMatrix = { {2,3,4}, {3,2,1} }; // 배열 선언 및초기화
		int[][] secondMatrix = { {1,2,3}, {-4,-2,1} };
		
		int[][] sum = new int[rows][columns];   // sum배열 선언, 메모리 할당
		for (int i = 0; i < rows; i++) { 	    // 행 수만큼
			for (int j = 0; j < columns; j++) { // 한 행 당 열 수만큼
				sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j]; // 두 행렬의 같은 위치에 있는 요소 합
			}
		}
		System.out.println("두 행렬의 합: ");
		// sum 배열 출력
		for (int i = 0; i < rows; i++) { 
			for (int j = 0; j < columns; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
	}
}
