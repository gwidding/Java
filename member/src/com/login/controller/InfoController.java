package com.login.controller;

import java.util.List;

import com.login.domain.EnrollFile;
import com.login.domain.Member;
import com.login.exception.*;

public class InfoController implements ManageInfo {
	
	private EnrollFile enrollFile;
	
	ExceptPhone exceptPhone = new ExceptPhone();
	ExceptPwd exceptPwd = new ExceptPwd();
	

    public InfoController(EnrollFile enrollFile) {
        this.enrollFile = enrollFile;
    }
	
	public void readMember(Member member) {
		System.out.println(member.getName() + " 고객 정보 : ");
		System.out.println("회원 번호: " + member.getNum() + "\t이름: " + member.getName() 
		+"\t 연락처: " + member.getPhone() + " \n주소: " + member.getAddr());
		
	}
	
	public void updateMember(Member member, String newName, String newPwd, String newPhone, String newAddr) {
		List<Member> members = enrollFile.getMembers();
		
		ExceptName exceptName = new ExceptName();
		newName = exceptName.exceptUpdateName(members, member.getName(), newName);
		if (!newName.equals("")) {
			member.setName(newName);
		}
		
		newPwd = exceptPwd.exceptpwd(member.getName(), newPwd);
		if (!newPwd.equals("")) {
			member.setPwd(newPwd);
		}
		
		newPhone = exceptPhone.exceptPhone(member.getName(), newPhone);
		if (!newPhone.equals("")) {
			member.setPhone(newPhone);
		}
		
		if (!newAddr.equals("")) {
			member.setAddr(newAddr);
		}
		
		
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getNum() == member.getNum()) {
                members.set(i, member);
                break;
            }
        }
		enrollFile.writeFile();
	}
	
	public boolean deleteMember(Member member, String ansDelete) {
		if (ansDelete.equals("Y") || ansDelete.equals("y")) {
			
			List<Member> members = enrollFile.getMembers();
			members.remove(members.get(member.getNum()-1));
			
			enrollFile.writeFile();
			System.out.println(member.getName() + " 회원님의 탈퇴가 완료되었습니다.");
			return true;
		}
		else if (ansDelete.equals("N") || ansDelete.equals("n")) {
			System.out.println(member.getName() + " 회원님의 탈퇴가 취소되었습니다.");
			return false;
		}
		else {
			System.out.println("잘못 입력하였습니다.");
			return false;
		}

	}

}
