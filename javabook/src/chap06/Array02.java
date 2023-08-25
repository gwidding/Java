package chap06;

public class Array02 {

	public static void main(String[] args) {
		// 배열 선언 및 초기화
		double[] gradeArr = {90, 70.5, 80, 79, 82.5, 50, 70, 90.2, 89.5, 89.7};
		double sum = 0.0; // 변수 선언 및 초기화
		
		for (int i = 0; i < gradeArr.length; i++) { // 배열 크기 만큼
			sum += gradeArr[i]; // 요소를 누적해서 더하기
		}
		double average = sum / gradeArr.length;  // 평균 계산식
		System.out.println("합계: " + sum);  // 합 출력
		System.out.format("평균: %.2f", average); // 평균, 소숫점 2자리까지 출력
	}
}
