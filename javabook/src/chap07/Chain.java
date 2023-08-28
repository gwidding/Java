package chap07;

public class Chain {
	Chain(){ // 기본 생성자 선언
		this(10); // 정수 1개를 매개로 받는 일반 생성자 호출
		System.out.println("기본 생성자 Chain() 호출");
	}
	Chain(int x) { // 일반 생성자 선언 (매개변수: 정수 1개)
		this(5,6); // 정수 2개 매개로 받는 일반 생성자 호출
		System.out.println("일반 생성자 Chain(int x) 호출");
		System.out.println("x의 값 : " + x);
	}
	Chain(int x, int y) { // 일반 생성자 선언 (매개변수: 정수 2개)
		System.out.println("일반 생성자 Chain(int x, int y) 호출");
		System.out.println("x와 y 값 : " + x + " " + y);
	}
}
