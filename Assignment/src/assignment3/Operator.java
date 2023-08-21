package assignment3;

public class Operator {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; //'A'의 문자코드 65
		
		System.out.println(1 + x << 33);
		// 33은 32보다 크므로 32로 나눈 나머지 1
		//3(00000011)을 왼쪽으로 1비트 이동 -> (00000110) = 6
		
		System.out.println(y >= 5 || x < 0 && x > 2);
		// and가 or보다 우선순위가 높으므로
		// true or (false and false) -> true or false -> true
		
		System.out.println(y += 10 - x++);
		// 우선순위 : ++ , 1 , +=, 증가연산자가 변수 뒤에 있으므로 x(2)사용 후 증가
		// (10 - 2 = 7) -> (y += 7) -> y = 5 + 7 = 12
		
		System.out.println(!('A' <= c && c <= 'Z'));
		// !(true && true) -> false
		
		System.out.println('C' - c);
		// 68 - 66 = 2
		
		System.out.println(c+1);
		// 65 + 1 = 66
		
		System.out.println(c++);
		// A출력 후 c에 다음 문자 B 대입
		
		System.out.println(c);
		// B 출력
		
		System.out.println(++c);
		// B의 다음 문자 C를 출력
	}

}
