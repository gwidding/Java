package assignment3;

public class TypeConversion02 {

	public static void main(String[] args) {
		int x = 10;
		double y = 3.0;
		
		System.out.println(x / y); // double로 자동 형 변환
		System.out.println(x / (int) y); // int끼리 나누므로 int
		System.out.println((int)(x /y)); // double을 int로 캐스팅 변환
	}
}
