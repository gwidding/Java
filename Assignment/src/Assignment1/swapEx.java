package Assignment1;

public class swapEx {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int temp = 0;
		
		// x, y 값 출력
		System.out.println("x와 y의 값을 확인합니다.");
		System.out.println("x값: " + x);
		System.out.println("y값: " + y + "\n");
		
		temp = x; // 기존 x를 임시로 temp에 저장
		x = y;    // x에 y값 대입
		y = temp; // 기존 x값(temp)을 y에 대입
		
		// 바뀐 x, y 값 출력
		System.out.println("x와 y의 값을 변경합니다.");
		System.out.println("x값: " + x);
		System.out.println("y값: " + y + "\n");

	}

}
