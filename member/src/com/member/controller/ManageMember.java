package com.member.controller;

public abstract class ManageMember {

	abstract boolean createMember(String name, String phone);
		
	abstract boolean readMember(String name);
	
	abstract boolean updateMember(String name, String pwd, String newName, String newPhone, String newAddr);
	
	abstract boolean deleteMember(String name, String pwd);
	
	abstract boolean fileMember();
	
	abstract void listMember();
}
