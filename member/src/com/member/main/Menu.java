package com.member.main;

import java.util.Scanner;
import com.member.controller.MemberController;
import com.member.exception.ExceptScan;

public class Menu extends Login {
	public void showMenu() {
		Scanner scan = new Scanner(System.in);
		MemberController memberController = new MemberController();
		ExceptScan exceptScan = new ExceptScan();
		
		boolean run = true;
		
		while (run) {
			System.out.println();
			System.out.println("****************************************************");
			System.out.println("\t\t  회원 관리 프로그램");
			System.out.println("****************************************************");
			System.out.println("  1. 고객 정보 등록하기 \t 2. 고객 정보 조회하기 \n  3. 고객 정보 수정하기 \t 4. 고객 정보 삭제하기"
					+ "\n  5. 고객 정보 목록보기 \t 6. 고객 정보 파일 출력 \n  7. 종료");
			System.out.println("****************************************************");
			
			System.out.print("메뉴 번호를 입력해 주세요 : ");
			
			int menu = exceptScan.scanInt();
			
			switch (menu) {
			case 1: {
				System.out.print("등록하실 회원의 이름을 입력하세요: ");
				String name = scan.nextLine();
				
				System.out.print("등록하실 회원의 연락처를 입력하세요: ");
				String phone = scan.nextLine();
				
				memberController.createMember(name, phone);
				break;
			}
			case 2: {
				System.out.print("조회할 회원 이름을 입력해주세요 : ");
				String name = scan.nextLine();
				
				memberController.readMember(name);
				break;
			}
			case 3: {
				System.out.print("수정할 회원 이름을 입력해주세요 ");
				String name = scan.nextLine();
				
				System.out.print(name + " 회원의 이름을 수정하세요: ");
				String newName = scan.nextLine();
				
				System.out.print("회원의 연락처를 수정하세요: ");
				String newPhone = scan.nextLine();
				
				memberController.updateMember(name, newName, newPhone);
				break;
			}
			case 4: {
				System.out.print("삭제할 회원 이름을 입력해주세요 : ");
				String name = scan.nextLine();
				
				System.out.print("회원 비밀번호를 입력해주세요 : ");
				String pwd = scan.nextLine();
				
				memberController.deleteMember(name, pwd);				
				break;
			}
			case 5: {
				memberController.listMember();				
				break;
			}
			case 6: {
				memberController.fileMember();
				break;
			}
			case 7: {
				run = false;
				System.out.println("회원 관리 프로그램을 종료합니다.");
				break;
			}
			default:
				System.out.println("올바른 메뉴 번호를 입력하세요. 1-6");
			}
			
		}
		scan.close();
	}

}

