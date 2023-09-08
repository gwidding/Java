package com.member.exception;

import java.util.Scanner;

public class ExceptPwd {
	Scanner scan = new Scanner(System.in);
	public String exceptpwd(String pwd) {
		while(pwd.length() < 4 || pwd.length() > 8) {
			System.out.println(" 4-8자리로 입력해주세요.");
			
			System.out.print("등록하실 회원의 비밀번호를 입력하세요(4-8자): ");
			pwd = scan.nextLine();
		}
		return pwd;
	}
	
	public String exceptUpdatePwd(String newPwd) {
		while(newPwd.length() < 4 || newPwd.length() > 8) {
			System.out.println(" 4-8자리로 입력해주세요.");
			
			System.out.print(" 회원의 비밀번호를 수정하세요: ");
			
			newPwd = scan.nextLine();
		}
		return newPwd;
	}
}
