package chap07;

public class AccessModifier02 {
	public static void main(String[] args) {
		Dog obj = new Dog(); // 인스턴스화
		
		obj.breed = "포메라니언"; // obj의 멤버 변수 접근
		obj.color = "갈색";
		
		System.out.println("강아지 품종 : " + obj.breed);
		System.out.println("강아지 색상 : " + obj.color);
		obj.bowwow(); // public : 어디서든 접근 가능
		obj.age = 10; // protected : 같은 패키지에서 접근 가능
		System.out.println("강아지 나이 : " +obj.age);
		obj.run(); // protected : 같은 패키지에서 접근 가능
	}
}
