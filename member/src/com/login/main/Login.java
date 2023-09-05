package com.login.main;

import java.util.Scanner;

import com.login.controller.LoginController;

public class Login {
	public static void main(String[] args) {
		
		LoginController loginCon = new LoginController();
		loginCon.readFileMember(); // 파일 읽기
		
		Scanner scan = new Scanner(System.in);
			
			while(true) {
				System.out.println("****************************************************");
				System.out.println("\t\t\t로그인");
				System.out.println("****************************************************");
				
				System.out.print("아이디를 입력하세요: ");
				String id = scan.nextLine();
				
				System.out.println("비밀번호를 입력하세요: ");
				String pwd = scan.nextLine();
				
				break;
			}
			scan.close();
	}

}
