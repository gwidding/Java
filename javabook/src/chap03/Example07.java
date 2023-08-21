package chap03;

public class Example07 {
//캐스팅 형 변환(작은 자료형에 할당할 땐 명시적 유형 캐스팅)
	public static void main(String[] args) {
		double d = 3.14;
		long l = (long)d;
		int i = (int)l;
		System.out.println(d);
		System.out.println(l);
		System.out.println(i);
	}
}
