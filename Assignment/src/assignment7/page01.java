package assignment7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class page01 {
	void printInfo(int page) {
		System.out.println("\t\t\t" + "성적집계표");
		LocalDateTime now = LocalDateTime.now();
		String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss"));
		System.out.println("PAGE : " + (page + 1) + "\t\t\t" + "출력일자: " + formatedNow);
		System.out.println("===========================================================");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("===========================================================");
	}

}
