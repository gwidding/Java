package assignment3;

public class YearAge {

	public static void main(String[] args) {
		int k01_year = 0; //변수 선언 및 초기화
		int k01_age = 14;
		
		// 변수의 해당 값 출력
		System.out.println("결과1 : " + k01_year);
		System.out.println("결과2 : " + k01_age);
		
	
		k01_year = k01_age + 2000;
		k01_age = k01_age + 1;
		
		// 변화 후 변수의 해당 값 출력
		System.out.println("결과3: " + k01_year);
		System.out.println("결과4: " + k01_age);

	}

}
