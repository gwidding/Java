package assignment7;

public class InputData1 {
	int person;
		
	String name[];
	int kor[];
	int eng[];
	int mat[];
	int sum[];
	double avg[];
	
	int pagePerPerson = 30;
	int startPage;
	int endPage;
	
	InputData1(int person) {
		this.person = person;
		
		name = new String[person];
		kor = new int[person];
		eng = new int[person];
		mat = new int[person];
		sum = new int[person];
		avg = new double[person];
		
	}
	
	void setData(int i, String name, int kor, int eng, int mat) {
		this.name[i] = name;
		this.kor[i] = kor;
		this.eng[i] = eng;
		this.mat[i] = mat;
		this.sum[i] = kor + eng + mat;
		this.avg[i] = (kor + eng + mat) / 3;
	}
	
	int getStartPage(int num) {
		return num * pagePerPerson;
	}
	
	int getEndPage(int num) {
		endPage = (num + 1) * pagePerPerson;
		if(person / pagePerPerson == num) endPage = person % pagePerPerson + num * pagePerPerson;
		return endPage;
	}
		


}
