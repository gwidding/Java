package midterm;

public class M404 {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 3) {
			System.out.println("**********" +"\t" + "**********" +"\t" +"**********");
			System.out.print("구구단 " + i + "단" + "\t\t");
			System.out.print("구구단 " + (i + 3)+ "단" + "\t\t");
			System.out.println("구구단 " + (i + 6) + "단");
			System.out.println("**********" +"\t" + "**********" +"\t" +"**********");
			
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + " * " + j + " = " + i*j + "\t");
				System.out.print((i+3) + " * " + j + " = " + (i+3)*j + "\t");
				System.out.println((i+6) + " * " + j + " = " + (i+6)*j);
			}
			System.out.println();
			i++;
		}		
	}
}