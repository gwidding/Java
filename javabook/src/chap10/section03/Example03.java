package chap10.section03;

import chap10.mypackage.Cat;

public class Example03 {

	public static void main(String[] args) {
		Cat cat01 = new Cat();
		Cat cat02 = new Cat();
		// 객체를 문자화
		// toString이나 equals은 자주 쓰임
		System.out.println(cat01.toString());
		System.out.println(cat02.toString());
		System.out.println(cat01.equals(cat02));
		cat01 = cat02;
		System.out.println(cat01.equals(cat02));
		System.out.println(cat01.toString());
		System.out.println(cat02.toString());
	}

}
