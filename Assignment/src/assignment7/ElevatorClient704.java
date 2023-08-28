package assignment7;

public class ElevatorClient704 {
	// 같은 클래스 내에서만 쓰는 inval 변수 선언
	private static int inVal;
	// 메서드 선언
	public static void up() {
		inVal++; // 하나 증가
		System.out.println("그냥 메서드" + inVal);
	}
	
	public static void main(String[] args) {
		inVal = 0; // 0으로 초기화
		Elevator elev = new Elevator(); // Elevator클래스 받아 객체 생성
		
		up(); // 메인 클래스 내의 메서드 실행
		
		for(int i = 0; i < 10; i++) {
			elev.up(); // Elevator 클래스인 elev객체의 up() 멤버 메서드
			System.out.println("MSG: " +elev.help);
		}
		for (int i = 0; i < 10; i++) {
			elev.down(); // Elevator 클래스인 elev객체의 down() 멤버 메서드
			System.out.println("MSG: " + elev.help);
		}
	}
}
