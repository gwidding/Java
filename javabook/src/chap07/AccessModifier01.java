package chap07;

public class AccessModifier01 {
	public static void main(String[] args) {
		Dog dogObj = new Dog(); 
		// 같은 패키지 내에 있으므로 접근 가능
		
		// Dog의 멤버 변수 접근
		dogObj.breed = "포메라니언";
		dogObj.color = "갈색";
		
		// Dog 멤버 변수 출력
		System.out.println("강아지 품종 : " + dogObj.breed);
		System.out.println("강아지 색상 : " + dogObj.color);
		// Dog 메서드 호출
		dogObj.bowwow();
	}

}
