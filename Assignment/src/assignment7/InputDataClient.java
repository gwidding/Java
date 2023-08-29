package assignment7;

import java.text.DecimalFormat;

public class InputDataClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int person = 200;
		
		InputData1 inData = new InputData1(person);
		Page p = new Page();
		
		DecimalFormat df = new DecimalFormat("000");
		
		for(int i = 0; i < person; i++) {
			String name = "홍길" + df.format(i + 1);
			
			int kor = (int)(Math.random() * 100);
			int eng = (int)(Math.random() * 100);
			int mat = (int)(Math.random() * 100);
			
			inData.setData(i, name, kor, eng, mat);
		}
		
		int AllSum[] = new int[5]; // 현재 페이지 합
		int AllAvg[] = new int[5];
		
		for(int i = 0; i <= person / inData.pagePerPerson; i++) {
			p.printHead(i);
			
			int currSum[] = new int[5];
			int currAvg[] = new int[5];
			int start = inData.getStartPage(i);
			int end = inData.getEndPage(i);
			
			for(int j = start; j < end; j++) {
				System.out.println(df.format(j + 1) + "\t" + inData.name[j] + "\t" + inData.kor[j] + "\t" + inData.eng[j] + "\t" + inData.mat[j] + "\t" + inData.sum[j] + "\t" + inData.avg[j]);
				currSum[0] += inData.kor[j];
				currSum[1] += inData.eng[j];
				currSum[2] += inData.mat[j];
				currSum[3] += inData.sum[j];
				currSum[4] += inData.avg[j];
				currAvg[0] = currSum[0] / (end - start);
				currAvg[1] = currSum[1] / (end - start);
				currAvg[2] = currSum[2] / (end - start);
				currAvg[3] = currSum[3] / (end - start);
				currAvg[4] = currSum[4] / (end - start);
			}
			
			p.printCurrSummary(AllSum, currSum, AllAvg, currAvg, end);
			p.printAllSummary(AllSum, AllAvg);
		}
	}

}
