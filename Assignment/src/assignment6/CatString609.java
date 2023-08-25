package assignment6;

public class CatString609 {

	public static void main(String[] args) {
		String str = "Ko2re4a0Po41ly4te2chn9ic3";
		char[] ch = new char[str.length()];
		String result = "";
		
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
			if (ch[i] >= 'a' && ch[i] <= 'z' || ch[i] >= 'A' && ch[i] <= 'Z') {
				result = result.concat(str.substring(i, i+1));
			}
		}
		
		System.out.println("result: " + result);
	}

}
