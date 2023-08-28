package assignment7;

public class CalClient706 {

	public static void main(String[] args) {
		Calc c = new Calc(); // Calc 클래스에서 받아 c 객체 생성
		
		System.out.println("2개 덧셈 호출됨: " + c.sum(1, 2));
		System.out.println("3개 덧셈 호출됨: " + c.sum(1, 2, 3));
		System.out.println("4개 덧셈 호출됨: " + c.sum(1, 2, 3 ,4));
		System.out.println("더블형 덧셈 호출됨: " + c.sum(1.3, 2.4));
	}

}
