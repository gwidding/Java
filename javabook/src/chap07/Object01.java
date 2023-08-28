package chap07;

public class Object01 {
	public static void main(String[] args) {
		// 학생1 인스턴스화
		Student stObj1 = new Student(); 
		
		stObj1.id = 20221004; // 직접 멤버 변수 id에 저장
		stObj1.name = "홍길순"; // 직접 멤버 변수 name에 저장
		stObj1.printInfo(); // 멤버 메서드 호출
		
		// 학생2 인스턴스화
		Student stObj2 = new Student(); 
		
		stObj2.insertRecord(20021005, "홍길동"); // 메서드 이용해서 변수에 저장
		stObj2.printInfo(); // 멤버 메서드 호츌
	}
}
