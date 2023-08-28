package chap07;

public class AccessModifier03 {

	public static void main(String[] args) {
		Dog obj = new Dog(); // 인스턴스화
		
		obj.breed = "포메라니언"; // obj의 멤버 변수 접근
		obj.color = "갈색";
		System.out.println("강아지 품종 : " + obj.breed);
		System.out.println("강아지 색상 : " + obj.color);
		
		obj.bowwow(); // public : 어디든 접근 가능
		obj.age = 10; // protected : 같은 패키지에서 접근 가능
		System.out.println("강아지 나이 : " +obj.age);
		obj.run(); // protected : 같은 패키지에서 접근 가능
		
//		obj.name = "다운"; // private name은 은닉화되어 접근x
//		System.out.println("강아지 이름 : " + obj.name);
//		obj.sleep(); // private 메서드도 은닉화로 접근x
		
		obj.setName("다운"); // setter로 이름 저장
		System.out.println("강아지 이름 : " + obj.getName()); // getter로 이름 가져오기
	}
}
