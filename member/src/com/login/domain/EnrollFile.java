package com.login.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;


public class EnrollFile {
	private String filePath = "memberList.txt";
	protected List<Member> members = new ArrayList<>();
	
	public List<Member> getMembers() {
        return members;
    }
	
	public void readFile() {
		File file = new File(filePath);
		try {
			if (!file.exists())
				file.createNewFile();
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String str;
			while ((str = br.readLine()) != null) {
				
				String[] arr = str.split("\t|,");
				if (str.length() >= 5) {
					int num = Integer.parseInt(arr[0].replaceAll("회원번호: ", ""));
					String name = arr[1].replaceAll("이름: ", "").trim();
					String phone = arr[2].replaceAll("연락처: ", "").trim();
					String addr = arr[3].replaceAll("주소: ", "").trim();
					String pwd = arr[4].replaceAll("비밀번호: ", "").trim();
					Member newMember = new Member(num, name, phone, addr, pwd);
					members.add(newMember);
				}
			}
			fr.close();

		} catch(Exception e) {
			System.out.println(e);
		
		}
	}
	
	public void writeFile() {
		File file = new File(filePath);
		try {
			FileWriter fw = new FileWriter(file);	
			
			for (Member member : members) {
	            fw.write("회원번호: " + member.getNum() + "\t이름: " + member.getName()
	                    + "\t연락처: " + member.getPhone() + "\t주소: " + member.getAddr()
	                    + "\t비밀번호: " + member.getPwd() + "\n");
	        }
			fw.close();
		} catch(Exception e) {
			e.getMessage();
		}
	}
}
