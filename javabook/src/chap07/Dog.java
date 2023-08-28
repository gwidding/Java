package chap07;

public class Dog {
	public String breed; // public 접근제한자 이용
	public String color;
	protected int age; // protected 접근제한자 이용
	private String name; // private 접근제한자 이용(실무에서 많이 씀)
	
	public String getName() { // getter <- private 때문에 사용
		return name;
	}
	public void setName(String name) { // setter
		this.name = name;
	}
	public void bowwow() { // public -> 어디든
		System.out.println("멍멍 짖다");
	}
	protected void run() { // protected -> 같은 패키지
		System.out.println("달리다");
	}
	private void sleep() { // private 메서드 -> 같은 클래스
		System.out.println("잠을 자다");
	}

}
