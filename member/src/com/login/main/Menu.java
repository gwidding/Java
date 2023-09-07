package com.login.main;

import java.util.Scanner;

import com.login.controller.InfoController;
import com.login.domain.EnrollFile;
import com.login.domain.Member;
import com.login.exception.*;

public class Menu extends Login {
	InfoController infoCon;
	EnrollFile enrollFile = new EnrollFile();
	ExceptName exceptName = new ExceptName();
	
	
	Scanner scan = new Scanner(System.in);
	
	 public Menu() {
	        infoCon = new InfoController(enrollFile); // InfoController에 EnrollFile 객체 전달
    }
	 
	public void showMenu(Member member) {
		enrollFile.readFile();
		
		boolean run = true;
		while (run) {
			System.out.println("****************************************************");
			System.out.println("\t" + " 마이페이지 : " + member.getName() + "님 환영합니다.");
			System.out.println("****************************************************");
			System.out.println(" 1. 회원 정보 확인하기 \t 2. 회원 정보 수정하기");
			System.out.println(" 3. 회원 탈퇴        \t 4. 종료");
			System.out.println("****************************************************");
			
			System.out.print("메뉴 번호를 입력해 주세요 : ");
			
			ExceptScan exceptScan = new ExceptScan();
			int menu = exceptScan.scanInt();
			
			switch (menu) {
			case 1 : {
				infoCon.readMember(member);
				System.out.println();
				break;
				
			}
			case 2 : {
				System.out.print(member.getName() + " 회원님의 비밀번호를 입력하세요 : ");
				String pwd = scan.nextLine();
				
				if (pwd.equals(member.getPwd()) ) {
					System.out.print(member.getName() + " 회원의 수정할 이름을 입력하세요: ");
					String newName = scan.nextLine();
					
					System.out.print(member.getName() + " 회원의 수정할 연락처를 입력하세요: ");
					String newPhone = scan.nextLine();
					
					System.out.print(member.getName() + " 회원의 수정할 주소를 입력하세요: ");
					String newAddr = scan.nextLine();
					
					System.out.print(member.getName() + "회원의 수정할 비밀번호를 입력하세요: ");
					String newPwd = scan.nextLine();
					
					if (exceptName.exceptUpdateName(member.getName(), newName )) {
						infoCon.updateMember(member, newName, newPhone, newAddr, newPwd);
						System.out.println("수정 완료되었습니다.");
					}
					
					

					
				}
				else {
					System.out.println("비밀번호가 일치하지 않습니다.");
					
				}
				System.out.println();
				break;
			}
			case 3 : {
				System.out.print(member.getName() + " 회원님의 비밀번호를 입력하세요 : ");
				String pwd = scan.nextLine();
				
				if (pwd.equals(member.getPwd()) ) {
					System.out.print(member.getName() + " 회원님 탈퇴하시겠습니까 Y | N ?  ");
					String ansDelete = scan.nextLine();
					
					if (infoCon.deleteMember(member, ansDelete)) {


			            run = false;
			            System.out.println("정상적으로 탈퇴되어 프로그램을 종료합니다.");
					}
				}
				else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
				
				System.out.println();
				break;
				
			}
			case 4 : {
				run = false;
				System.out.println("로그인 프로그램을 종료합니다.");
				break;
				
			}
			default:
				System.err.println("올바른 메뉴 번호를 입력하세요. 1-4");
				System.out.println();
			}
		}
			
	}
		

}
