package chap07;

public class Add {
	// 덧셈 연산을 위한 생성자를 오버로딩
	Add() { // 기본 생성자
		System.out.println("기본 생성자 Add() 호출");
	}
	Add(int a, int b) { // 정수 2개가 매개변수인 일반 생성자
		System.out.println("일반 생성자 Add(int a, int b)호출");
		System.out.println(a + " + " + b + " + " + (a+b));
	}
	Add(double a, double b) { // 실수 2개가 매개변수인 일반 생성자
		System.out.println("일반 생성자 Add(int a, double b)호출");
		System.out.println(a + " + " + b + " = " + (a+b));
	}
}
