package chap10.section03;

public class Package04 {

	public static void main(String[] args) {
		String str1 = "www.google.com";
		
		String[] arrStr1;
		// 공백이나 쓰레기값 날리기 좋음
		arrStr1 = str1.split("\\.");
		
		for (int i = 0; i < arrStr1.length; i++) {
			System.out.println(arrStr1[i]);
		}

	}

}
