package chap03;

public class Example03 {

	public static void main(String[] args) {
		int x = 10;
		System.out.println(x < 10 && x < 20);
		System.out.println(x < 10 || x < 20);
		System.out.println(!(x < 10 && x < 20));
	}
}
