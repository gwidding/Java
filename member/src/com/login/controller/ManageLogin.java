package com.login.controller;

import com.login.domain.Member;

public interface ManageLogin {
	abstract Member loginId(String name);
	
	abstract int loginPwd(Member member,String pwd, int i);

}