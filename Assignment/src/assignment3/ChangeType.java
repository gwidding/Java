package assignment3;

public class ChangeType {

	public static void main(String[] args) {
		String s = "12345"; 		 // 문자열 변수 s 선언
		int i = Integer.parseInt(s); // 문자열 s를 정수로 변환하여 정수형 변수 i에 저장
		// 정수에 10을 더했으므로 12355 출력됨
		System.out.printf("문자를 숫자로 %d (%d) \n", i, i + 10);
		
		String a;					// 문자열 변수 a 선언
		a = String.format("%d", i); //정수형 i 문자열 포맷을 a에 저장
		// 문자열에 텍스트abcde를 더했으므로 이어서 출력됨
		System.out.printf("숫자를 문자로 %s (%s) \n", a, a + "abcde");
	}
}
