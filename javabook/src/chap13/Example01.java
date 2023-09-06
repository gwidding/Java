package chap13;

import java.util.ArrayList;

public class Example01 {
	public static void main(String[] args) {
		ArrayList<String> cats = new ArrayList<String>();
		// 문자열 형태로 ArrayList 만듦
		cats.add("페르시안");
		cats.add(null); // "null"해도 동일
		System.out.println(cats);
		
		cats.add(1, "샴");
		System.out.println(cats);
		// 1번 자리에 있던 null은 밀림
		
		cats.set(2, "러시안블루");
		System.out.println(cats);
		// 2번 인덱스 값을 러시안블루로 설정
		
		cats.remove("페르시안");
		// 중복 값이 있어도 처음의 한 값만 삭제
		System.out.println(cats);
		// 페르시안 값 지우고, 비어있지 않게 채워짐
		cats.remove(1);
		System.out.println(cats);
		// 1번 인덱스 값 지움
		System.out.println(cats.size());
		System.out.println(cats.get(0));
		System.out.println(cats.contains("샴"));
		System.out.println(cats.indexOf("샴"));
		

	}

}
