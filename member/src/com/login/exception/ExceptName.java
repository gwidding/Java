package com.login.exception;

import java.util.List;
import java.util.Scanner;

import com.login.domain.Member;

public class ExceptName {
	Scanner scan = new Scanner(System.in);
	
	public String exceptUpdateName(List<Member> members, String name, String newName) {
		for (Member member : members) {
			if (newName.equals(member.getName()) && !name.equals(newName) ) {
				System.err.println("이미 존재하는 이름입니다. 다른 이름으로 수정해주세요.");
				
				System.out.println(name + " 회원님의 수정할 이름을 입력하세요: ");
				newName = scan.nextLine();
			}
		}
		return newName;
	}
}
