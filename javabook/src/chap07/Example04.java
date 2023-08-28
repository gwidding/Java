package chap07;

public class Example04 {
	public static void main(String[] args) {
		Cat cat1 = new Cat(); // Cat클래스의 cat1 인스턴스화 
		cat1.breed = "페르시안"; // cat1의 멤버변수 breed 접근
		
		Cat cat2 = new Cat(); // Cat클래스의 cat2 객체 생성
		cat2.breed = "샴"; // cat2의 멤버변수 breed 접근
		
		Cat cat3 = new Cat(); // Cat클래스의 cat3 객체 생성
		cat3.breed = "러시안블루"; // cat3의 멤버변수 breed 접근
		// Cat의 멤버변수 출력
		System.out.println("첫 번째 고양이 품종 : " + cat1.breed);
		System.out.println("두 번째 고양이 품종 : " + cat2.breed);
		System.out.println("세 번째 고양이 품종 : " + cat3.breed);
	}
}
