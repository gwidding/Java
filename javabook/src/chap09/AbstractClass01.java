package chap09;

public class AbstractClass01 {
	public static void main(String[] args) {
		
		// Shape로 억지로 집어넣기를 자주 사용은 x
		//Shape s1 = new Circle("빨간색", 2.2);
		//Shape s2 = new Rectangle("노란색", 2, 4);
		Circle s1 = new Circle("빨간색", 2.2);
		Rectangle s2 = new Rectangle("노란색", 2, 4);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}
}
