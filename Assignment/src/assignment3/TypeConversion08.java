package assignment3;

public class TypeConversion08 {

	public static void main(String[] args) {
		double d = 85.4; // double형 d 선언
		int score = (int)d; //더 작은 int로 변환한 d(85)를 score에 저장
		
		// 각각 출력
		System.out.println("score=" + score);
		System.out.println("d=" + d);
	}
}
