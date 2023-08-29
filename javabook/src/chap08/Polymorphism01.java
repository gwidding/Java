package chap08;

public class Polymorphism01 {
	public static void main(String[] args) {
		CalculateSquare myArea = new CalculateSquare(); // 객체 생성
		// 메서드 오버로딩
		System.out.println("가로:10, 세로:5 사각형의 넓이는 " + myArea.square(10,5));
		// 두 정수를 매개변수로 넓이 계산하여 정수 반환
		System.out.println("가로:2.5, 세로:4.5 사각형의 넓이는 " + 
							myArea.square(2.5, 4.5));
		// 두 실수를 매개변수로 넓이 계산하여 실수 반환			
	}
}
