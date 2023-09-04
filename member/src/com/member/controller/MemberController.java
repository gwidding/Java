package com.member.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.member.domain.Member;

public class MemberController extends ManageMember {
	
	private List<Member> members = new ArrayList<>(); // Member의 객체들 저장하는 리스트 
	private int memberNum = 1;
	Scanner scan = new Scanner(System.in);
	
	public boolean createMember(String name, String phone) {
		System.out.print("등록하실 회원의 주소를 입력하세요: ");
		String addr = scan.nextLine();
		
		System.out.print("등록하실 회원의 비밀번호를 입력하세요: ");
		String pwd = scan.nextLine();

		Member newMember = new Member(memberNum, name, phone, addr, pwd);
		members.add(newMember);
		memberNum++;
		// 이미 존재하는 회원 이름 예외처리
		return true;
	}
	
	
	public boolean readMember(String name) {
		int i = 0;
		for (Member member : members) {
			if (name.equals(member.getName()) ) {
				System.out.println( name + " 고객 정보 : ");
				System.out.println("회원 번호: " + member.getNum() + "\t이름: " + member.getName() 
									+"\t 연락처: " + member.getPhone() + " \t주소: " + member.getAddr());				
			}
			else 
				i++;			
		}
		
		if (i >= members.size()) {
			System.out.println(name + " 회원님이 존재하지 않습니다.");
		}	
		return true;
	}

	
	public boolean updateMember(String name, String newName, String newPhone) {
		int i = 0;
		for (Member member : members) {
			if (name.equals(member.getName()) ) {
				if (!(newName.equals(""))) {
					member.setName(newName);
				}
				if (!(newPhone.equals(""))) {
					member.setPhone(newPhone);
				}
				
			}	
			else 
				i++;			
		}
		
		if (i >= members.size()) {
			System.out.println(name + " 회원님이 존재하지 않습니다.");
		}	
		return true;
	}
	
	
	
	public boolean deleteMember(String name) {
		int i = 0;
		for (Member member : members) {
			if (name.equals(member.getName()) ) {
				//member.remove();
				
			}
			else 
				i++;			
		}
		
		if (i >= members.size()) {
			System.out.println(name + " 회원님이 존재하지 않습니다.");
		}	
		return true;
	}
	
	public boolean fileMember() {
		return false;
	}
	
	
	
	public void listMember() {
		System.out.println("\n----------------------<회원목록>----------------------");
		if (members.size() == 0) {
			System.out.println(" 등록된 회원이 없습니다.");
		}
		else {
			for (Member member : members) {
				System.out.println("회원 번호 " + member.getNum() + "\t이름 " + member.getName() + " \t 연락처 " + member.getPhone());
			}
		}
	}

}
