package com.member.exception;

import java.util.List;

import com.member.domain.Member;

public class ExceptName {
	public boolean exceptCreateName(List<Member> members, String name) {
			for (Member member : members) {
				if (name.equals(member.getName())) {
					System.out.println("이미 존재하는 이름입니다. 다른 이름으로 등록해주세요.");
					return false;
				}
			}
			return true;
	}
	
	public Member existMember(List<Member> members, String name) {
		for (Member member : members) {
			if (name.equals(member.getName()) ) {	
				return member;
			}		
		}
		
		System.out.println(name + " 회원님이 존재하지 않습니다.");
		return null;
	}
	
}
