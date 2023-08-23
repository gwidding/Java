package assignment4;

public class Example06 {
	public static void main(String[] args) {
		char grade = 'B';
		switch(grade) { // grade에 따라 스위치문 실행
		case 'A': // grade가 'A'일 때 실행 ->실행x
			System.out.println("매우 우수");
			break;
		case 'B': // grade가 'B'일 때 실행->실행
			System.out.println("우수");
			break; // 'B'일 때 원하는 동작을 모두 수행했으므로 스위치문 빠져나가기
		case 'C': // grade가 'C'일 때 실행->'C'에서 break했으므로 실행x
			System.out.println("좋음");
			break;
		case 'D': // grade가 'D'일 때 실행->'D'에서 break했으므로 실행x
			System.out.println("좀 더 열심히");
			break;
		case 'F': // grade가 'F'일 때 실행->'F'에서 break했으므로 실행x
			System.out.println("미흡");
			break;
		default: // 그 외의 경우 실행ㄷ
			System.out.println("잘못된 등급");
			//마지막 문장은 break 안 써도 나갈 테니
		}
	}
}
