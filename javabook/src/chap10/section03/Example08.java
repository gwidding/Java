package chap10.section03;

public class Example08 {
	public static void main(String[] args) {
		Integer a = 3; // 데이터베이스에서 데이터 받아서, 화면에 던져줄 때 씀
		int i1 = a.intValue();
		int j1 = a;
		
		System.out.println(a + " " + i1 + " " + j1);
		int b = 20;
		Integer i2 = Integer.valueOf(b);
		Integer j2 = b;
		System.out.println(b + " " + i2 + " " + j2);
	}
}
