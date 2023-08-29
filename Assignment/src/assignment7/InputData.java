package assignment7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InputData {
	String name[];
	int kor[], eng[], mat[], sum[];
	double avg[];
	int sumT[] = new int[5];
	int avgT[] = new int[5];

	InputData(int x) {
		name = new String[x];
		kor = new int[x];
		eng = new int[x];
		mat = new int[x];
		sum = new int[x];
		avg = new double[x];
	}

	void setData(int i, String Pname, int Pkor, int Peng, int Pmat) {
		name[i] = Pname;
		kor[i] = Pkor;
		eng[i] = Peng;
		mat[i] = Pmat;
		sum[i] = kor[i] + eng[i] + mat[i];
		avg[i] = sum[i] / 3;
	}

	void printInfo() { // 7-8 클래스
		System.out.println("\t\t\t" + "성적집계표");
		LocalDateTime now = LocalDateTime.now();
		String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss"));
		System.out.println("\t\t\t\t\t" + "출력일자: " + formatedNow);
		System.out.println("================================================================");
		System.out.println("번호" + "\t" + "이름" + "\t" + "국어" + "\t" 
							+ "영어" + "\t" + "수학" + "\t" + "총점" + "\t" + "평균" + "\t");
		System.out.println("================================================================");
	}

	void printThirty() { // 번호, 이름, 점수 출력
		for (int i = 0; i < 30; i++) {
			if (i < 9) System.out.print("00" + (i + 1) + "\t");
			else System.out.print("0" + (i + 1) + "\t");
			
			System.out.println(name[i] + "\t" + kor[i] + "\t" + eng[i] 
					+ "\t" + mat[i] + "\t" + sum[i] + "\t" + (int) avg[i]);
		}
	}
	
	void summThirty() { // 한 페이지 합계 
		for (int i = 0; i < 30; i++) {
			sumT[0] += kor[i];
			sumT[1] += eng[i];
			sumT[2] += mat[i];
			sumT[3] += sum[i];
			sumT[4] += avg[i];
		}
		for (int i = 0; i < 5; i++) {
			avgT[i] = sumT[i] / 30;
		}
		System.out.println("================================================================");
		System.out.println("합계 \t\t" + sumT[0] + "\t" + sumT[1] + "\t" + sumT[2] + "\t" + sumT[3] + "\t" + sumT[4]);
		System.out.println("평균 \t\t" + avgT[0] + "\t" + avgT[1] + "\t" + avgT[2] + "\t" + avgT[3] + "\t" + avgT[4]);
	}

}
