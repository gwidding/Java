package chap07;

public class Constructor01 {
	public static void main(String[] args) {
		System.out.println("****학생 주소록****");
		Student stObj = new Student(); // Student클래스의 stObj 객체 생성
		
		stObj.insertRecord(20221004, "홍길순"); // default접근제한자 : 같은 패키지 접근 가능
		stObj.printInfo(); // default접근제한자
	}
}
