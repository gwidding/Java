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
		return true;
	}
	
	
	boolean readMember(int num) {
		
		return false;
	}
	
	boolean updateMember(int num, String name, int phone) {
		return false;
	}
	
	boolean deleteMember(int num) {
		return false;
	}
	
	boolean fileMember() {
		return false;
	}
	
	
	
	public void listMember() {
		System.out.println("회원목록==>>");
		for (Member member : members) {
			System.out.println("회원 번호 " + member.getNum() + "\t이름 " + member.getName() + " \t 연락처 " + member.getPhone());
		}
	}

}
