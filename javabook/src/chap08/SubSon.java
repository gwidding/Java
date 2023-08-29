package chap08;

public class SubSon extends SubFather{ // 자식 클래스
	void printSon() {
		System.out.println("나는 아들입니다.");
		System.out.println("나는 아버지로부터 상속받습니다.");
		System.out.println("나의 아버지는" + this.familyName); // SubFather의 클래스를 this로
		System.out.println("나의 집은" + this.houseAddress); // SubFather의 클래스를 this로
	}
}
