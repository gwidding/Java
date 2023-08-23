package assignment4;

public class Star {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			int j = 0;
			while (j < i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
		}
	}
}
