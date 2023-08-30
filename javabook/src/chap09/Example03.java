package chap09;

public class Example03 {
	public static void main(String[] args) {
		// 일반 클래스에서 객체화
		
		// 접근하고 싶으면 일반 클래스에서 구현하고 그 클래스의 생성자 통해 접근
		Bike myBike = new Bike();
		Car myCar = new Car();
		
		myBike.printType();
		myBike.printBrand();
		myBike.printPrice();
		System.out.println("--------------");
		myCar.printType();
		myCar.printBrand();
		myCar.printPrice();
	}
}
