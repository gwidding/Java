package assignment7;

import java.text.DecimalFormat;

public class ScoreSheet709 {
	public static void main(String[] args) {
		int allPerson = 200;
		int pagePerPerson = 30;
		
		InputData709 inData = new InputData709(allPerson);
		page01 p = new page01();
		
		DecimalFormat df = new DecimalFormat("000");
		
		for (int i = 0; i < allPerson; i++) { // 데이터 입력
			String name = "홍길" + df.format(i + 1);
			
			int kor = (int)(Math.random() * 100);
			int eng = (int)(Math.random() * 100);
			int mat = (int)(Math.random() * 100);
			
			inData.setData(i, name, kor, eng, mat);
		}
		
		// 데이터 출력
		int pageNum = 0;
		int pageMax = (allPerson % pagePerPerson == 0) ? (allPerson/pagePerPerson) : (allPerson/pagePerPerson + 1);
		
		while (pageNum < pageMax) {
			p.printInfo(pageNum); // 안내표
			inData.printScore(pageNum * pagePerPerson, pagePerPerson, allPerson); // 항목 30개(시작번호, 당)
			inData.summThirty(pageNum * pagePerPerson, pagePerPerson, allPerson); // 항목 30개 평균
			inData.cumulPage(pageNum, pagePerPerson);
			System.out.println();
			pageNum++;			
		}		
	}
}
