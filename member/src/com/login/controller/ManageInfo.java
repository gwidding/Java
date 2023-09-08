package com.login.controller;

import com.login.domain.Member;

public interface ManageInfo {
	
	abstract void readMember(Member member);
	
	abstract void updateMember(Member member, String newName, String newPwd, String newPhone,String newAddr);
	
	abstract boolean deleteMember(Member member, String ansDelete);
	
}
