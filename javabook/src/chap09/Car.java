package chap09;

public class Car extends FourWheeler{
	// FourWheeler는 아무것도 없지만, 그 부모클래스 Vehicle에 
	// printPrice가 추상화 메서드이므로 재정의 해줘야 함
	public void printPrice() { 
		System.out.println("가격 : 50,000,000");
	}
	
	public void printType() {
		System.out.println("이것은 자동차입니다.");
	}
	public void printBrand() {
		System.out.println("브랜드 : BMW");
	}
}
