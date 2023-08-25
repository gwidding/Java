package assignment6;

public class MonthDay604_1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 12; i++) {
			System.out.print(i + "월 => ");
			
			for (int j = 1; j <= 31; j++) {
				System.out.print(j + ", ");
				
				if(i == 2) {
					if(j == 28) break;
				}
				if(i == 4 || i == 6 || i == 9 || i == 11) {
					if (j == 30) break;
				}
				
			}
			System.out.println();
		}
	}

}
