package assignment8;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("<<<<메뉴>>>>");
			System.out.println("1. 회원가입 \n 2. 회원정보 조회 \n 3. 회원정보 수정 \n 4. 회원정보 삭제 \n 5. 회원정보 열람");
			System.out.println("원하는 메뉴를 입럭하세요 : ");
			int menu = scan.nextInt();
			switch (menu) {
			case 1: {
				System.out.println("회원가입을 진행합니다.");
				System.out.println("사용할 아이디를 입력해 주세요.");
				String id = scan.nextLine();
				System.out.println("사용할 비밀번호를 입력해 주세요.");
				String pwd = scan.nextLine();
				
				
			}
			case 2: {
				
				
			}
			case 3: {
				
			}
			case 4: {
				
			}
			case 5: {
				
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + menu);
			}
			
		}
	}

}
