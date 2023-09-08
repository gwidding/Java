package com.member.controller;

import java.io.File;
import java.io.FileWriter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.member.domain.Member;
import com.member.exception.*;


public class MemberController extends ManageMember {
	
	private List<Member> members = new ArrayList<>(); // Member의 객체들 저장하는 리스트 
	private int memberNum = 1;
	
	Scanner scan = new Scanner(System.in);
	ExceptName exceptName = new ExceptName();
	ExceptPwd exceptPwd = new ExceptPwd();
	
	public boolean createMember(String name, String phone) {
		
		if (exceptName.exceptCreateName(members, name)) {
			System.out.print("등록하실 회원의 주소를 입력하세요: ");
			String addr = scan.nextLine();
			
			System.out.print("등록하실 회원의 비밀번호를 입력하세요(8-16자): ");
			String pwd = scan.nextLine();
			pwd = exceptPwd.exceptpwd(pwd);	

			Member newMember = new Member(memberNum, name, phone, addr, pwd);
			members.add(newMember);
			memberNum++;
			
			System.out.println(name + " 회원님이 등록되었습니다.");
			return true;
		}
		
		return false;
	}
	
	
	public boolean readMember(String name) {
		Member member = exceptName.existMember(members, name);
		
		if (member != null) {
			System.out.println(name + " 고객 정보 : ");
			System.out.println("회원 번호: " + member.getNum() + "\t이름: " + member.getName() 
			+"\t 연락처: " + member.getPhone() + " \t주소: " + member.getAddr());
			return true;
		}
		return false;
	}

	
	public boolean updateMember(String name, String pwd, String newName, String newPwd, String newPhone, String newAddr) {
		Member member = exceptName.existMember(members, name);

		if (member != null) {
			if (!pwd.equals(member.getPwd())) {
				System.out.println(name + " 회원의 비밀번호가 일치하지 않습니다.");
			}
			else {
				if (!(newName.equals(""))) {
					if (exceptName.exceptUpdateName(members, name, newName))
						member.setName(newName);
				}
				
				if (!newPwd.equals("")) {
					newPwd = exceptPwd.exceptUpdatePwd(newName);
					member.setPwd(newPwd);
				}
				if (!(newPhone.equals(""))) {
					member.setPhone(newPhone);
				}
				if (!(newAddr.equals(""))) {
					member.setAddr(newAddr);
				}
				System.out.println("기존의 " + name + " 회원님의 정보가 수정되었습니다.");
				return true;				
			}
			
		}				
		return false;
	}
	

	public boolean deleteMember(String name, String pwd) {
		Member member = exceptName.existMember(members, name);
		
		if (member != null) {
			if (pwd.equals(member.getPwd())) {
				members.remove(member);
				System.out.println(name + " 회원의 정보가 삭제되었습니다.");
				return true;
			}
			System.out.println(name + " 회원의 비밀번호가 일치하지 않습니다.");
			return false;
		}
		return false;
	}
	
	public void listMember() {
		System.out.println("\n----------------------<회원목록>----------------------");
		if (members.size() == 0) {
			System.out.println(" 등록된 회원이 없습니다.");
		}
		else {
			for (Member member : members) {
				System.out.println("회원번호 " + member.getNum()  + " \t이름: " + member.getName()  + "\t연락처: " + member.getPhone());
			}
		}
	}
	
	
	public boolean fileMember() {
		try {
			File file = new File("memberList.txt");
			if (!file.exists())
				file.createNewFile();
			FileWriter fw = new FileWriter(file);
			
			for (Member member : members) {
				fw.write("회원번호: " + member.getNum() + "\t이름: " + member.getName() 
					+ " \t 연락처: " + member.getPhone() + "\t 주소: " + member.getAddr()
					+"\t 비밀번호: " +member.getPwd() + "\n" );
			}
			fw.close();
			System.out.println("파일 저장 완료");
		} catch(Exception e) {
			e.getMessage();
		}
		return true;
	}
	

	

}
