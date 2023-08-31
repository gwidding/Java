package com.member.main;

import com.member.domain.Admin;
import com.member.controller.MemberController;
import java.util.Scanner;


public class Login {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Admin admin = new Admin("admin", "1234", "은지");
		boolean login = true;
		
		while(login) {
			System.out.println("****************************************************");
			System.out.println("\t\t\t로그인");
			System.out.println("****************************************************");
			
			System.out.print("아이디를 입력하세요: ");
			String id = scan.nextLine();
			
			boolean idAgain = !id.equals(admin.getId());

			if (idAgain) System.out.println("일치하는 아이디가 없습니다.");
			else {
				int i = 0;
				while (i < 3) {
					System.out.print("비밀번호를 입력하세요: ");
					String pwd = scan.nextLine();

					boolean pwdAgain = !pwd.equals(admin.getPwd());

					if (pwdAgain) {
						System.out.println("비밀번호가 틀렸습니다.");
						i++;
					} 
					else {
						System.out.println("로그인 성공");
						Menu menu = new Menu();
						menu.showMenu();
						login = false;
						break;
					}
				}
				
				if (i == 3) {
					System.out.println("로그인 횟수 초과");
					break;
				}
			}
			
		}
		scan.close();
	}
}

