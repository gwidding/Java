package chap08;

public class Inheritance03 {
	public static void main(String[] args) {
		SubSon objSon = new SubSon(); // 객체 생성
		objSon.printSon(); // 현재 객체
		objSon.printFather(); // 부모 클래스
		objSon.printGrandFather(); // 할아버지 클래스
	}
}
