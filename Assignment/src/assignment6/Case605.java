package assignment6;

public class Case605 {

	public static void main(String[] args) {
		for(int i = 1; i <= 12; i++) {
			System.out.print(i + "월 => ");
			
			LOOP: for(int j = 1; j < 32; j++) {
				System.out.print(j + ",");
				
				switch(i) {
				case 4: case 6: case 9: case 11:
					if(j == 30) break LOOP;
					break;
				case 2:
					if(j == 28) break LOOP;
					break;
				}
			}
			System.out.println();
		}
	}

}
