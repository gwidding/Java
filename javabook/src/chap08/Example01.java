package chap08;

public class Example01 {
	public static void main(String[] args) {
		BabyCat catObj = new BabyCat(); // BabyCat의 객체 생성
		System.out.println("품종 : " + catObj.breed); // 상속받아 접근 가능
		System.out.println("색상 : " + catObj.color); // 원래 BabyCat에 있으므로 가능
		
		catObj.eat();  // 상속받아 접근 가능
		catObj.meow(); // 원래 BabyCat에 있으므로 가능
	}
}
