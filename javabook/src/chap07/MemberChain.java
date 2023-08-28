package chap07;

public class MemberChain {
	// 멤버 변수 선언
	String firstName;
	String country;
	int age;
	
	// 기본생성자 선언
	public MemberChain() { 
		this("홍길순"); // String 값 하나 있는 일반 생성자 호출
	}
	// 일반생성자 선언
	public MemberChain(String mName) {
		this(mName, 20); // 문자열, 정수가 매개변수인 일반 생성자 호출
	}
	public MemberChain(String mName, int mAge) {
		this(mName, mAge, "대한민국");
	}
	public MemberChain(String mName, int mAge, String mCountry) {
		firstName = mName; // 멤버 변수에 저장
		age = mAge;
		country = mCountry;
	}
	
	// 멤버 메서드 생성
	void printInfo() { // 각 변수 값 출력, default접근제한자 : 같은 패키지 내
		System.out.println("이름 : " + firstName);
		System.out.println("국적 : " + country);
		System.out.println("나이 : " + age);
	}
}
