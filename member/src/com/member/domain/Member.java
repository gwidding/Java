package com.member.domain;

public class Member {
	private int num;
	private String phone;
	private String name, addr, pwd;
	
	public Member(int num, String name, String phone, String addr, String pwd) {
		this.num = num;
		this.name = name;
		this.phone = phone;
		this.addr = addr;
		this.pwd = pwd;
	}
	
	public Member(String name, String phone, String addr, String pwd) {
		this.name = name;
		this.phone = phone;
		this.addr = addr;
		this.pwd = pwd;
	}
	
	
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
}
