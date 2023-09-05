package com.login.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.login.domain.Member;

public class LoginController implements ManageLogin {
	
	private List<Member> members = new ArrayList<>();
	
	public void readMember() {
		
	}
	
	public void updateMember() {
		
	}
	
	public void deleteMember() {
		
	}
	
	public void readFileMember() {
		
		File file = new File("memberList.txt");
		try {
			if (!file.exists())
				file.createNewFile();
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String str;
			while ((str = br.readLine()) != null) {
				String[] arr = str.split("\t");
				if (str.length() >= 9) {
					int num = Integer.parseInt(arr[0].replaceAll("회원번호: ", ""));
					String name = arr[1].replaceAll("이름: ", "");
					String phone = arr[2].replaceAll("연락처: ", "");
					String addr = arr[3].replaceAll("주소: ", "");
					String pwd = arr[4].replaceAll("비밀번호: ", "");
					Member newMember = new Member(num, name, phone, addr, pwd);
			
					System.out.println("회원 번호 " + newMember.getNum() + "\t이름 " + newMember.getName() 
							+ " \t 연락처 " + newMember.getPhone() + "\t 주소 " + newMember.getAddr() + "\t 비밀번호 " + newMember.getPwd());
				}
				
			}
			
			fr.close();
			System.out.println("파일 읽기 성공");
		} catch(Exception e) {
			System.out.println(e);
		
		}
		
	}
	
	public void writeFileMember() {
		
	}

}
