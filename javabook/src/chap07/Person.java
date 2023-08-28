package chap07;

public class Person {
	// 멤버 변수 선언
	String name;
	int reg_num;
	
	// 멤버 메서드 선언, default : 같은 패키지 내 접근o
	void walk() {
		System.out.println("걷습니다.");
	}
	
	void run() {
		System.out.println("달립니다.");
	}

}
