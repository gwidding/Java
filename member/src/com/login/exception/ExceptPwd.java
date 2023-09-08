package com.login.exception;

import java.util.Scanner;

public class ExceptPwd {
	Scanner scan = new Scanner(System.in);
	
	public String exceptpwd(String name, String pwd) {
		while(!pwd.equals("") && (pwd.length() < 4 || pwd.length() > 16)) {
			System.err.println(" 비밀번호는 4-16자리로 입력해주세요.");
			
			System.out.print(name + " 회원의 수정할 비밀번호를 입력하세요: ");
			pwd = scan.nextLine();
		}
		return pwd;
		
	}

}
