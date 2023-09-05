package com.member.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptScan {
	Scanner scan = new Scanner(System.in);
	
	public int scanInt() {
		try {
			int menu = scan.nextInt();
			scan.nextLine();
			return menu;
		} catch(InputMismatchException e) {
			scan.nextLine();
			return 0;
		}
	}
	
}
