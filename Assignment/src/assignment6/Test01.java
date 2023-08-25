package assignment6;
import java.util.Random;
import java.util.Scanner;

public class Test01 {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			int[] sixNumbers = new int[6];
			int[] yourNumbers = new int[6];
			
			while(true)
			{
				boolean copy = false;
				System.out.println("추첨중입니다.");
				for(int i = 0; i < sixNumbers.length; i++)
				{
					sixNumbers[i] = generate_numbers();
					// 당첨 번호
					//System.out.print(sixNumbers[i] + " ");
				}
				
				System.out.println();
				
				for(int i = 0; i < sixNumbers.length; i++)
				{
					for(int j = i + 1; j < sixNumbers.length; j++)
					{
						if(sixNumbers[i] != sixNumbers[j])
						{
							
						}
						else
						{
							//System.out.print(sixNumbers[i] + " " + sixNumbers[j]);
							System.out.println("중복결과가 나왔습니다 재 선택합니다.");
							copy = true;
						}
					}
				}
				if(!copy)
				{
					break;
				}
			}
					
			while(true)
			{
				boolean copy = false;
				System.out.println("값을 입력해주세요.");
				for(int i = 0; i < yourNumbers.length; i++)
				{
					yourNumbers[i] = scan.nextInt();
				}
				for(int i = 0; i < yourNumbers.length; i++)
				{
					for(int j = 1; j < i; j++)
					{
						if(yourNumbers[i] != yourNumbers[j])
						{
							
						}
						else
						{
							System.out.print(sixNumbers[i] + " " + sixNumbers[j]);
							System.out.println("중복 값은 입력할 수 없습니다. 다시 입력해주세요.");
							copy = true;
						}
					}
				}
				if(!copy)
				{
					break;
				}
			}
			int result = cmp_numbers(sixNumbers, yourNumbers);
			printNum(result, sixNumbers);
		}
		public static int generate_numbers()
		{
			Random rand = new Random();
			return rand.nextInt(44) + 1;
		}
		public static int cmp_numbers(int[] original, int[] solve)
		{
			int sum = 0;
			for(int i = 0; i < original.length; i++)
			{
				if(original[i] == solve[i])
				{
					sum++;
				}
			}
			
			return sum;
		}
		public static void printNum(int result, int[] orignial)
		{
			System.out.println("로또 당첨번호: ");
			for(int i = 0; i < orignial.length; i++)
			{
				System.out.print(orignial[i] + " ");
			}
			System.out.print("추첨 결과: ");
			switch(result)
			{
				case 0: System.out.print("꽝 "); break;
				case 1: System.out.print("6등"); break;
				case 2: System.out.print("5등"); break;
				case 3: System.out.print("4등"); break;
				case 4: System.out.print("3등"); break;
				case 5: System.out.print("2등"); break;
				case 6: System.out.print("1등"); break;
			}
			System.out.println("입니다.");
		}
	}
