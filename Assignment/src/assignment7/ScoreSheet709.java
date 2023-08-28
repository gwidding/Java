package assignment7;

public class ScoreSheet709 {
	public static void main(String[] args) {
		int allPerson = 200;
		int pagePerPerson = 30;
		InputData inData = new InputData(allPerson);
		
		for (int i = 0; i < allPerson; i++) { // 데이터 입력
			String name;
			if (i < 9) name = "홍길0" + (i+1); // 번호 1번부터 시작
			else name = "홍길" + (i+1);
			
			int kor = (int)(Math.random() * 100);
			int eng = (int)(Math.random() * 100);
			int mat = (int)(Math.random() * 100);
			inData.setData(i, name, kor, eng, mat);
		}
		
		
		// 데이터 출력
		int pageNum = 0;
		int pageMax = (allPerson % pagePerPerson == 0) ? (allPerson/pagePerPerson) : (allPerson/pagePerPerson + 1);
		// 7페이지
		
		while (pageNum < pageMax) {
			inData.printInfo(pageNum); // 안내표
			inData.printThirty(pageNum * pagePerPerson, pagePerPerson, allPerson); // 항목 30개(시작번호, 당)
			inData.summThirty(pageNum * pagePerPerson, pagePerPerson, allPerson); // 항목 30개 평균
			inData.cumulPage(pageNum, pagePerPerson);
			System.out.println();
			pageNum++;			
		}		
	}
}
