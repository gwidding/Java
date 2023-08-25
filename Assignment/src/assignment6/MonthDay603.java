package assignment6;

public class MonthDay603 {

	public static void main(String[] args) {
		for (int i = 1; i <= 12; i++) {
			System.out.print(i + "월 => ");
			
			for (int j = 1; j <= 31; j++) {
				System.out.print(j + ", ");
				
				if(i == 1  && j == 31) break;
				if(i == 2  && j == 28) break;
				if(i == 3  && j == 31) break;
				if(i == 4  && j == 30) break;
				if(i == 5  && j == 31) break;
				if(i == 6  && j == 30) break;
				if(i == 7  && j == 31) break;
				if(i == 8  && j == 31) break;
				if(i == 9  && j == 30) break;
				if(i == 10 && j == 31) break;
				if(i == 11 && j == 30) break;
				if(i == 12 && j == 31) break;
			}
			System.out.println();
		}
		
	}
}
