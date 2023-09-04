package com.member.controller;


import java.io.File;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.member.domain.Member;

public class MemberController extends ManageMember {
	
	private List<Member> members = new ArrayList<>(); // Member의 객체들 저장하는 리스트 
	private int memberNum = 1;
	Scanner scan = new Scanner(System.in);
	
	public boolean createMember(String name, String phone) {
		
		for (Member member : members) {
			if (name.equals(member.getName())) {
				System.out.println("이미 존재하는 이름입니다. 다른 이름으로 등록해주세요.");
				return false;
			}
		}
		
		System.out.print("등록하실 회원의 주소를 입력하세요: ");
		String addr = scan.nextLine();
		
		System.out.print("등록하실 회원의 비밀번호를 입력하세요: ");
		String pwd = scan.nextLine();

		Member newMember = new Member(memberNum, name, phone, addr, pwd);
		members.add(newMember);
		memberNum++;
		
		return true;
	}
	
	
	public boolean readMember(String name) {
		
		for (Member member : members) {
			if (name.equals(member.getName()) ) {
				System.out.println( name + " 고객 정보 : ");
				System.out.println("회원 번호: " + member.getNum() + "\t이름: " + member.getName() 
									+"\t 연락처: " + member.getPhone() + " \t주소: " + member.getAddr());	
				return true;
			}		
		}
		
		System.out.println(name + " 회원님이 존재하지 않습니다.");
		return false;
	}

	
	public boolean updateMember(String name, String newName, String newPhone) {

		for (Member member : members) {
			if (name.equals(member.getName()) ) {
				if (!(newName.equals(""))) {
					member.setName(newName);
				}
				if (!(newPhone.equals(""))) {
					member.setPhone(newPhone);
				}
				return true;
	
			}				
		}
	
		System.out.println(name + " 회원님이 존재하지 않습니다.");
		return false;
	}
	
	
	
// ConcurrentModificationException 오류
//	public boolean deleteMember(String name, String pwd) {
//		int i = 0;
//		for (Member member : members) {
//			if (name.equals(member.getName()) ) {
//				if (pwd.equals(member.getPwd())) {
//					members.remove(member.getNum()-1);
//
//					System.out.println("삭제되었습니다.");
//				}
//				
//			}
//			else 
//				i++;			
//		}
//		
//		if (i >= members.size()) {
//			System.out.println(name + " 회원님이 존재하지 않습니다.");
//		}	
//		return true;
//	}

	public boolean deleteMember(String name, String pwd) {
		
		Iterator<Member> iterator = members.iterator();
		
		while (iterator.hasNext()) { // 다음 값 들어있는지 확인
			Member member = iterator.next(); // 다음 값 가져오기
			if (name.equals(member.getName())) {
				
				if (pwd.equals(member.getPwd())) {
					iterator.remove();
					System.out.println(name + " 회원의 정보가 삭제되었습니다.");
					return true;
				}
				
				System.out.println(name + " 회원의 비밀번호가 일치하지 않습니다.");
				return false;
			}
		}
		
		System.out.println(name + " 회원님이 존재하지 않습니다.");
		return false;
	}
	
	
	
	public boolean fileMember() {
		try {
			File file = new File("memberList.txt");
			if (!file.exists())
				file.createNewFile();
			FileWriter fw = new FileWriter(file);
			
			for (Member member : members) {
				fw.write("회원 번호 " + member.getNum() + "\t이름 " + member.getName() + " \t 연락처 " + member.getPhone() + "\n");
			}
			fw.close();
			System.out.println("파일 쓰기 성공");
		} catch(Exception e) {
			e.getMessage();
		}
		return true;
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
