package assignment3;

public class Operator04 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c;// 정수형 변수 a,b,c 선언
		System.out.println(c = a);  // c에 a값(10) 할당
		System.out.println(b += a); // b에 a(10) 더한 값 30출력
		System.out.println(b -= a); // b(30)에 a(10) 뺀 값 20출력 
		System.out.println(b *= a); // b(20)에 a(10) 곱한 값 200출력
		System.out.println(b /= a); // b(200)에 a(10) 나눈 몫 20출력
		System.out.println(b %= a); // b(20)에 a(10) 나눈 나머지 0출력
	}
}
