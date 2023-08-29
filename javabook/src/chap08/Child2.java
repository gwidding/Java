package chap08;

public class Child2 extends Parent2 { // Parent2의 자식 클래스
	String name = "홍길동";
	
	Child2() { // 기본 생성자
		super(); // 부모인 Parent2 기본 생성자 호출
		System.out.println("자식 이름 : " + name); // 현재 name인 홍길동 출력
	}

}
