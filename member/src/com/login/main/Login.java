package com.login.main;

import java.util.Scanner;

import com.login.controller.LoginController;
import com.login.domain.Member;


public class Login {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean login = true;
			
		while(login) {
			System.out.println("****************************************************");
			System.out.println("\t\t      회원 로그인");
			System.out.println("****************************************************");
			
			System.out.print("이름을 입력하세요: ");
			String id = scan.nextLine();
			
			LoginController loginCon = new LoginController();
			Member memberInfo = loginCon.loginId(id);
			
			if (memberInfo != null) {
				int i = 0;
				while (i < 3) {
					System.out.print("비밀번호를 입력하세요: ");
					String pwd = scan.nextLine();
					
					i = loginCon.loginPwd(memberInfo, pwd, i);
					
					if (i == 3) {
						System.err.println("비밀번호 오류 횟수 초과입니다.");
						System.out.println();
					}
					if (i == 0) {
						System.out.println(" 로그인 성공");
						Menu menu = new Menu();
						menu.showMenu(memberInfo);
						login = false;
						break;
					}
				}
				
			}
				
		}
		scan.close();
	}

}