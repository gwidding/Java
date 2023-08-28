package chap07;

public class Example01 { 
	public static void main(String[] args) {
		Cat catObj = new Cat(); // Cat클래스의 catobj 객체 생성
		
		catObj.breed = "페르시안 고양이"; // 멤버 변수 breed 접근
		catObj.color = "흰색"; // 멤버 변수 color 접근
		System.out.println("품종 : " + catObj.breed); // 멤버 변수 breed 출력
		System.out.println("색상 : " + catObj.color); // 멤버 변수 color 출력
	}
}
