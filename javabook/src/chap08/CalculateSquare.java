package chap08;

public class CalculateSquare {
	// 메서드 오버로딩
	public void square() { // 매개변수 없을 때
		System.out.println("No Parameter Method Called");
	}
	public int square(int width, int height) { // 매개변수가 두 정수일 때
		int area = width * height; // 직사각형의 넓이 공식
		return area; // 넓이 값 반환
	}
	public double square(double width, double height) { // 매개변수가 두 실수일 때
		double area = width * height;
		return area;
	}
	public double square(int width, double height) { // 매개변수가 정수, 실수일 때
		double area = width * height;
		return area;
	}
}
