package assignment4;

public class Example03 {
	public static void main(String[] args) {
		int num = 20;// num 변수에 20 값 할당
		
		if (num == 10) { // 10이면 실행 -> 실행x
			System.out.println("숫자가 10입니다.");
		}
		else if (num == 15) { // 15면 실행 -> 실행x
			System.out.println("숫자가 15입니다.");
		}
		else if (num == 20) { // 20이면 실행 -> 실행o
			System.out.println("숫자가 20입니다.");
		}
		else { // 그 외에 실행 -> 실행x
			System.out.println("숫자가 존재하지 않습니다.");
		}

	}

}
