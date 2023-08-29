package chap08;

public class SubDaughter extends SubFather { // SubFather의 자식 클래스
	void printDaughter () {
		System.out.println("나는 딸입니다.");
		System.out.println("나는 아버지로부터 상속받습니다.");
		System.out.println("나의 아버지는" + this.familyName); // 부모 클래스를 this로
		System.out.println("나의 집은 " + this.houseAddress);
	}
}
