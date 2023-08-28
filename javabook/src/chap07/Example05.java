package chap07;

public class Example05 {

	public static void main(String[] args) {
		Cat cat1 = new Cat("페르시안"); // 일반생성자로 객체 생성
		Cat cat2 = new Cat("샴"); // 일반생성자로 객체 생성
		Cat cat3 = new Cat(); // 기본생성자로 객체 생성
		System.out.println("첫 번째 고양이 품종 : " + cat1.breed);
		System.out.println("두 번째 고양이 품종 : " + cat2.breed);
		System.out.println("세 번째 고양이 품종 : " + cat3.breed);
	}
}
