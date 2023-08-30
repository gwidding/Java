package chap09;

public abstract class Animal {
	public abstract void printSound(); // 내용 없이 선언만 해놓은 추상화
	// 내용은 자식 클래스에서 구현(재정의) -> 상속
	
	public void displatInfo() { // 일반 메서드
		System.out.println("나는 동물입니다.");
	}

}
