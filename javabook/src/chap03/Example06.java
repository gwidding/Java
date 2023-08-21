package chap03;

public class Example06 {
//자동 형 변환 사용 (더 큰 변수에 할당)
	public static void main(String[] args) {
		int i = 100;
		long l = i;
		float f = l;
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
	}
}
