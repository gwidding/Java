package com.member.controller;

public abstract class ManageMember {

	abstract boolean createMember(String name, String phone);
		
	abstract boolean readMember(String name);
	
	abstract boolean updateMember(String name, String newName, String newPhone);
	
	abstract boolean deleteMember(int num);
	
	abstract boolean fileMember();
	
	abstract void listMember();
}
