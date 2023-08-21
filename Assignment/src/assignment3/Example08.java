package assignment3;

import java.util.Scanner; //Scanner 사용 위해 패캐지 임포트

public class Example08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		// 입력받은 객체와 연결된 Scanner 객체 생성
		
		System.out.println("당신의 이름을 입력하세요.");
		String name = input.nextLine();
		// 키보드로 데이터 입력받아 name에 저장
		System.out.println("당신의 이름 : "+ name);
		// name 출력

	}

}
