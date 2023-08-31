package chap10.section03;

import java.util.StringTokenizer;

public class Example11 {
	public static void main(String[] args) {
		// ,를 구분자로 자른 후 String토큰화
		StringTokenizer st = new StringTokenizer("Java, C, Python, JSP, PHP", ",");
		while (st.hasMoreTokens()) { // 토큰 더 있는지
			System.out.println(st.nextToken());
		}
	}
}
