package chap10.section03;

public class Example05 {
	public static void main(String[] args) {
		String str = new String("Java");
		for (int i = 0 ; i < str.length(); i++) {
			System.out.print(str.charAt(i) + " ");

		}
		System.out.println("\n");
		System.out.println(str.compareTo("JAVA")); // 대문자와 소문자 다름
		System.out.println(str.compareTo("Java"));
		System.out.println(str.compareToIgnoreCase("Java"));
	}
}
