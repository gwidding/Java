package chap08;

public class Son extends Father { // Father의 자식 클래스
	String name = "홍길동";
	
	void printDetails() {
		System.out.println("나의 이름은 " + this.name); 
		System.out.println("나의 아버지는 " + this.familyName); 
		// Father클래스의 familyName변수 상속받음
		System.out.println("나의 집은 " + this.houseAddress); 
		// Father클래스의 houseAddress변수 상속받음
	}
}
