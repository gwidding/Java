package midterm;

public class M406 {
	public static void main(String[] args) {
		int n = 1;
		int m = 10;
		
		while(true) {
			for (int i = 0; i < m; i++) System.out.print(" ");
			for (int i = 0; i < n; i++) System.out.print("*");
			System.out.println();
			
			m--;
			n += 2;
			if (m < 0) break;
		}
	}
}
