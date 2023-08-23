package midterm;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;

public class M408 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###,###");
		int price = 180000;
		double sales = price / 1.1;
		double vat = sales * 0.1;
		LocalDateTime now = LocalDateTime.now();
		String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
		
		System.out.println("\t매출전표(카드회사용)");
		System.out.println("맛꼬방치킨\t\t\t     하순희");
		System.out.println("124-25-54620\t     063-632-6614");
		System.out.println("전북 남원시 농고길 11 (도통동)");
		System.out.println();
		
		System.out.println("하나기업카드\t\t신용승인(I)");
		System.out.println("거래일시:" + formatedNow);
		System.out.println("4336-9200-****-982*\t    일시불");
		System.out.println("TID:***13440   230964317368(0001)");
		System.out.println("가맹점No 00921293692");
		System.out.println("매 입 사 하나카드(다우데이타)");
		System.out.println("승인번호 40860059");
		System.out.println("---------------------------------");
		
		System.out.printf("판매금액:\t\t\t%s원\n", df.format(sales));
		System.out.printf("부 가 세:\t\t\t %s원\n", df.format(vat));
		System.out.printf("합   계:\t\t\t%s원", df.format(price));
	}
}
