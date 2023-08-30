package chap09;

public class Bike extends TwoWheeler {
	// 구현은 자식클래스(일반클래스)에서 구현
	public void printPrice() {
		System.out.println("가격 : 150,000");
	}
	public void printType() {
		System.out.println("이것은 자전거입니다.");
	}
	public void printBrand() {
		System.out.println("브랜드 : 삼천리");
	}
}
