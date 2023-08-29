package chap08;

public class SubKitten extends SuperCat { // SuperCat의 자식 클래스
	String age = "2살";
	void printInfo() {
		System.out.println("아기 고양이입니다.");
	}
	void printDetail() {
		super.printInfo(); // 부모 클래스의 메서드
		System.out.println("품종은 " + super.breed + ", 나이는 " + super.age); // 부모 클래스의 변수
		printInfo(); // 현재 클래스의 메서드
		System.out.println("품종은 " + breed + ", 나이는 " + age); // 현재 클래스의 변수
		//System.out.println("아기 고양이는 " + this.breed + ", 나이는 " + this.age); // 현재클래스 받아옴
	}

}
