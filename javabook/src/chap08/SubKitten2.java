package chap08;

public class SubKitten2 extends SuperCat2 { // SuperCat2의 자식 클래스
	String name;
	String age = "2살";
	
	public SubKitten2(String n1, String n2) { // 일반 생성자
		super(n1); // 부모 클래스의 기본 생성자 호출
		this.name = n2; // 현재클래스의 name 멤버 변수에 n2 대입
		System.out.println("아기 고양이입니다." + " 이름은 " + name);
	}
}
