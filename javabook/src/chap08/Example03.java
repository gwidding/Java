package chap08;

public class Example03 {

	public static void main(String[] args) {
		Kitten objKitten = new Kitten(); // 객체 생성
		objKitten.meow2(); // 자식의 자식 메서드
		objKitten.meow(); // 자식 메서드
		objKitten.eat(); // 부모 메서드
	}

}
