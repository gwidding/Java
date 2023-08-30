package assignment8;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("<<<<메뉴>>>>");
			System.out.println("1. 회원가입\n2. 회원정보 조회\n3. 회원정보 수정\n4. 회원탈퇴\n5. 회원정보 열람");
			System.out.println("원하는 메뉴를 입럭하세요 : ");
			int menu = scan.nextInt();
			switch (menu) {
			case 1: {
				System.out.println("회원가입을 진행합니다.");
				System.out.println("사용할 아이디를 입력해 주세요.");
				String id = scan.nextLine();
				System.out.println("사용할 비밀번호를 입력해 주세요.");
				String pwd = scan.nextLine();
				break;
			}
			case 2: {
				
				break;
			}
			case 3: {
				
				break;
			}
			case 4: {
				
				break;
			}
			case 5: {
				
				break;
			}
			case 6: {
				run = false;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + menu);
			}
			
		}
	}

}
