package chap05;

public class Method04 {
	public static void sum() { // sum 메서드 생성
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i; // sum에 0부터 10까지의 합 저장
		}
		System.out.println(sum); // sum 출력
	}
	public static void main(String[] args) { // 메인 메서드
		System.out.print("1부터 10의 합계 : "); 
		sum(); // sum 메서드 호출 -> 0부터 10까지의 합인 sum 출력됨
	}
}

