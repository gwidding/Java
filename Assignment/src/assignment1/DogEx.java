package assignment1;

public class DogEx {
	public static void main(String[] args) {
		// 각 기호를 넣을 변수 선언
		String line = "|";
		char slash = '\\'; //슬래시를 텍스트로 인식하기 위해 슬래시 추가
		char underbar = '_';
		char backslash = '/';
		char paren_l = '(';
		char paren_r = ')';
		char braces_r = '}';
		
		System.out.println(line + slash + underbar + backslash + line);
		System.out.println(line + "q p" + line + '\t' + backslash + braces_r);
		System.out.println(paren_l + " 0 " + paren_r + "\"\"\"" + slash);
		System.out.println(line + "\"^\"` " + '\t' +" "+ line);
		System.out.println(line + line + underbar + backslash + '=' +slash + slash
				+ underbar + underbar +line);	
	}

}
