package assignment7;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InputData709 {
	String name[];
	int kor[], eng[], mat[], sum[];
	double avg[];	
	
	InputData709(int x) {
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
		avg[i] = sum[i] / 3.0;
	}
	
	void printInfo(int page) {
		System.out.println("\t\t\t" + "성적집계표");
		LocalDateTime now = LocalDateTime.now();
		String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss"));
		System.out.println("PAGE : " + (page + 1) + "\t\t\t출력일자: " + formatedNow);
		System.out.println("===========================================================");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("===========================================================");
	}
	
	void printScore(int startNum, int per, int all) {
		int end; 
		if (startNum * per > all) { 	  // 안 나눠 떨어질 경우
			end = startNum + (all % per); // 나머지만큼만 출력
		}
		else {
			end = startNum + per;
		}
		
		for (int i = startNum; i < end; i++) {
			// 번호 생성
			int n = 0;
			if (i < per) n = (i + 1);
			else n = i - startNum + 1;
			
			// 번호 출력
			DecimalFormat df = new DecimalFormat("000");
			System.out.print(df.format(n) + "\t");
			// 학생 점수 출력
			System.out.println(name[i] + "\t" + kor[i] + "\t" + eng[i] 
					+ "\t" + mat[i] + "\t" + sum[i] + "\t" + (int)avg[i]);
		}
	}
	
	int sumT[] = new int[5];
	int avgT[] = new int[5];
	
	void summThirty(int startNum, int per, int all) {
		int end;
		if (startNum * per > all) {
			end = startNum + (all % per);
		}
		else {
			end = startNum + per;
		}
		
		for (int i = 0; i < 5; i++) { // 페이지 시작하면서 초기화
			sumT[i] = 0;
		}

		for (int i = startNum; i < end; i++) {
			sumT[0] += kor[i];
			sumT[1] += eng[i];
			sumT[2] += mat[i];
			sumT[3] += sum[i];
			sumT[4] += avg[i];
		}
		
		for (int i = 0; i < 5; i++) {
			if (startNum * per > all) {
				avgT[i] = sumT[i] / (all % per);
			}
			else {
				avgT[i] = sumT[i] / per;
			}
		}
		System.out.println("===========================================================");
		System.out.println("현재페이지");
		System.out.print("합계 \t\t");
		for (int i = 0; i < 5; i++) {
			System.out.print(sumT[i] + "\t");
		}
		System.out.println();
		System.out.print("평균 \t\t");
		for (int i = 0; i < 5; i++) {
			System.out.print(avgT[i] + "\t");
		}
		System.out.println();
	}
	
	int sumCumul[] = new int[5];
	int avgCumul[] = new int[5];
	
	void cumulPage(int k, int per) { // 누적합
		for (int i = 0; i < 5; i++) {
			sumCumul[i] += sumT[i];
			avgCumul[i] = sumCumul[i] / (per*(k+1));
		}
		System.out.println("===========================================================");
		System.out.println("누적페이지");
		System.out.println("합계 \t\t" + sumCumul[0] + "\t" + sumCumul[1] + "\t" + sumCumul[2] + "\t" + sumCumul[3] + "\t" + sumCumul[4]);
		System.out.println("평균 \t\t" + avgCumul[0] + "\t" + avgCumul[1] + "\t" + avgCumul[2] + "\t" + avgCumul[3] + "\t" + avgCumul[4]);
	}

}
