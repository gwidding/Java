package com.login.controller;

import com.login.domain.EnrollFile;
import com.login.domain.Member;

public class LoginController extends EnrollFile implements ManageLogin {
	
	@Override
	public Member loginId(String name) {
		super.readFile();
		for (Member member : members) {
			if (name.equals(member.getName()) ) {
				return member;
			}
		}
		System.out.println("존재하지 않는 아이디입니다.");
		return null;
	}
	
	@Override
	public int loginPwd(Member member, String pwd, int i) {
		if (pwd.equals(member.getPwd()) ) {
			return 0;
		}
		else {
			System.out.print("비밀번호가 일치하지 않습니다.");
			i++;
			System.out.println(" (남은 비밀번호 시도 횟수 : " + (3-i) +")");
			return i;
		}
	}
	
	
	

}