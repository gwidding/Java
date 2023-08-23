package chap04;

public class Example12 {

	public static void main(String[] args) {
		for (int i = 0; i<= 10; i++) {
			if (i == 3 || i == 6 || i ==9) {
				continue;
			}
			System.out.println(i +" ");
		}
		
	}

}
