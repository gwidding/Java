package assignment5;

public class Star504 {
	public static void star() {
		for(int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		star();
	}
}
