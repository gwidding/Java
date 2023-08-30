package com.member.main;

import java.util.Scanner;
import com.member.controller.MemberController;

public class Menu extends Login {
	public static void showMenu() {
		Scanner scan = new Scanner(System.in);
		MemberController memberController = new MemberController();
		boolean run = true;
		
		while (run) {
			System.out.println();
			System.out.println("****************************************************");
			System.out.println("\t\t회원 관리 프로그램");
			System.out.println("****************************************************");
			System.out.println("  1. 고객 정보 등록하기 \t 2. 고객 정보 조회하기 \n  3. 고객 정보 수정하기 \t 4. 고객 정보 삭제하기"
					+ "\n  5. 고객 정보 목록보기 \t 6. 고객 정보 파일 출력 \n  7. 종료");
			System.out.println("****************************************************");
			
			System.out.print("메뉴 번호를 입력해 주세요 : ");
			int menu = scan.nextInt();
			scan.nextLine();
			
			switch (menu) {
			case 1: {
				System.out.print("등록하실 회원의 이름을 입력하세요: ");
				String name = scan.nextLine();
				
				System.out.print("등록하실 회원의 연락처를 입력하세요: ");
				String phone = scan.nextLine(); // 엔터 입력버퍼 소비 
				
				memberController.createMember(name, phone);
				
				
				break;
			}
			case 2: {
				
				
				break;
			}
			case 3: {
				
				break;
			}
			case 4: {
				
				break;
			}
			case 5: {
				memberController.listMember();				
				break;
			}
			case 6: {
				run = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			default:
				throw new IllegalArgumentException("올바른 메뉴 번호를 입력하세요." + menu);
			}
			
		}
	}

}

