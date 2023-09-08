package com.login.exception;

import java.util.Scanner;

public class ExceptPhone {
	Scanner scan = new Scanner(System.in);
	
	public String exceptPhone(String name, String phone) {
		for (int i = 0; i < phone.length(); i++) {
			if (!(phone.charAt(i) >= 48 && phone.charAt(i) <= 57) ) {
				System.err.println(" 연락처는 숫자만 입력가능합니다.");
				
				System.out.print(name + " 회원의 수정할 연락처를 입력하세요: ");
				phone = scan.nextLine();
				i = 0;
			}
			
		}
		return phone;
	}
}
