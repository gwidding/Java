package chap07;

public class Example06 {
	public static void main(String[] args) {
		Cat cat1 = new Cat();  // 기본 생성자 -> cat1 객체 인스턴스화
		Cat cat2 = new Cat("샴"); // 일반 생성자 -> cat2 객체 인스턴스화 
		Cat cat3 = new Cat("러시안블루", "회색"); // 일반 생성자 -> cat3 객체 인스턴스화
		// 각 객체의 멤버 변수 출력
		System.out.println("첫 번째 고양이 품종 : " + cat1.breed + "\t색상 : " + cat1.color);
		System.out.println("두 번째 고양이 품종 : " + cat2.breed + "\t색상 : " + cat2.color);
		System.out.println("세 번째 고양이 품종 : " + cat3.breed + "\t색상 : " + cat3.color);
		// 아무 값도 없으면 null
		// 변수 = ""; 저장하면 "" 값 그대로 출력
	}
}
