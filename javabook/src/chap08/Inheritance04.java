package chap08;

public class Inheritance04 {
	public static void main(String[] args) {
		SubSon objSon = new SubSon(); // SubSon 객체 생성
		objSon.printSon(); // SubSon의 메서드
		objSon.printFather(); // 그 부모 SubFather의 메서드
		
		SubDaughter objDaughter = new SubDaughter(); // SubDaughter 객체 생성
		objDaughter.printDaughter(); // SubDaughter의 메서드
		objDaughter.printFather(); // 그 부모 SubFather의 메서드
	}
}
