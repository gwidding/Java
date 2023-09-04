package chap11;

public class Example04 {
	static void check() throws ArithmeticException {
		System.out.println("내부 메서드");
		int div = 5/0;
		System.out.println("여기는 안 옴");
	}
	public static void main(String[] args) {
		try {
			check();
			System.out.println("여기도 안 옴");
		}
		catch(ArithmeticException e) {
			System.out.println("예외 발생 " + e);
		}
	}
}
