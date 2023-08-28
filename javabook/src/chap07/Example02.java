package chap07;

public class Example02 {
	// 멤버 메서드 선언 예시
	static void myMethod1() { // 메모리 상에 항상 상주, 잘 사용x
		System.out.println("정적 메서드 호출");
	}
	
	public void myMethod2() { // 객체화 시켜서 접근 하게
		System.out.println("인스턴스 메서드 호출");
	}

	public static void main(String[] args) {
		myMethod1(); // static -> 정적메서드이므로 그냥 접근 가능
		
		Example02 myObj = new Example02();
		myObj.myMethod2(); // static 아니므로(인스턴스) 객체로 접근 
	}
}
