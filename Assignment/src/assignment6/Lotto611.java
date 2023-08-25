package assignment6;

import java.util.Scanner;

public class Lotto611 {

	public static void main(String[] args) {
		int[] num = new int[6];
		int[] lotto = new int[7];
		int check = 0, bonus = 0;	
		boolean bool = true;
		String[] rank = {"1", "2", "3", "4", "5", "꽝"};
		
		while(bool) {
			bool = false;
			System.out.println("로또 번호를 입력하세요");		
			Scanner s = new Scanner(System.in);
			for (int i = 0; i < num.length; i++) {
				num[i] = s.nextInt();
			}
			
			for (int i = 0; i < num.length -1; i++) {
				System.out.print(num[i]);
				if (num[i] == num[i+1]) {
					System.out.println("중복 값은 입력할 수 없습니다. 다시 입력해주세요.");
					bool = true;
				}
			}
			
			System.out.print("로또 당첨 번호 : " );
			for (int i = 0; i < 7; i++) {
				lotto[i] = (int) Math.random() * 100 % 46;
				System.out.print(lotto[i]);
				
				for (int j = 0; j < 6; j++) {
					if (lotto[i] == num[j] && i != 6) {
						check += 1;
					}
					if (lotto[i] == num[j] && i == 6) {
						bonus = 1;
					}
					if (check > 6) System.out.print(rank[0]);
					else if (check == 5 && bonus == 1) System.out.print(rank[1]);
					else if (check == 5) System.out.print(rank[2]);
					else if (check == 4) System.out.print(rank[3]);
					else if (check == 3) System.out.print(rank[4]);
					else System.out.print(rank[5]);
				}
			}
		}	
	}
}
