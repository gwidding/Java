package midterm;

public class M403 {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 9) {
			if (i % 3 ==1) {
			System.out.println("*******************************************");
			System.out.print("구구단 " + i + "단" + "\t\t");
			System.out.print("구구단 " + (i + 1)+ "단" + "\t\t");
			System.out.println("구구단 " + (i + 2) + "단");
			System.out.println("*******************************************");
			
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + " * " + j + " = " + i*j + "\t");
				System.out.print((i+1) + " * " + j + " = " + (i+1)*j + "\t");
				System.out.println((i+2) + " * " + j + " = " + (i+2)*j);
			}
			System.out.println();
			}
			i++;
		}		
	}
}
