package chap07;

public class Student {
	// 멤버 변수 선언
	int id;
	String name;
	
	// 기본 생성자 선언
	Student() {
		System.out.println("기본 생성자 Student() 호출");
	}
	// 일반 생성자 선언
	Student(int parm1, String parm2){
		System.out.println("일반 생성자 Student(...) 호출");
		id = parm1;
		name = parm2;
	}
	
	// default 메서드 선언
	void insertRecord(int parm1, String parm2) {
		id = parm1;
		name = parm2;
	}
	// default 메서드 선언
	void printInfo() {
		System.out.println("아이디: " + id);
		System.out.println("이름: " + name);
	}
}
