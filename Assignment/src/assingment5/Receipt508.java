package assingment5;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Receipt508 {
	public static int price_total = 0;
	
	public static void main(String[] args) {
		 int itemCount = 3;
		titlePrint();
		timeStamp();
		
		for(int i = 0; i < itemCount; i++) {
			itemPrint(i);
		}
		
		totalPrint();
	}
	public static void titlePrint() {
		System.out.println("\t\t\"국민가게, 다이소\"");
		System.out.println("(주) 아성다이소_분당서현점");
		System.out.println("본사: 서울 강남구 남부순환로 1748 (도곡동)");
		System.out.println("대표: 박정부, 신호섭 213-81-52063");
		System.out.println("매장: 경기도 성남시 분당구 분당로53번길 11 (서현동)");
		System.out.println("===========================================");
		System.out.println("\t 소비자중심경영(CCM) 인증기업");
		System.out.println("\tISO 9001 품질경영시스템 인증기업");
		System.out.println("===========================================");
		System.out.println("\t교환/환불 14일 (03월 12일)이내,");
		System.out.println("(전자)영수증, 결제카드 지참 후 구입매장에서 가능");
		System.out.println("\t포장/가격 택 훼손시 교환/환불 불가");
		System.out.println("\t 체크카드 취소 시 최대 7일 소요");
		System.out.println("===========================================");
	}
	
	public static void timeStamp() {
		LocalDateTime now = LocalDateTime.now();
		String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss"));
		System.out.println("[POS 1058231]" + "\t\t" + formatedNow);
		System.out.println("===========================================");
	}
	public static void HearderPrint(int i) {
		String item_name1 = "퓨어에어 비말차단용마스크(최고급형)";
		String item_code1 = "1031615";
		int item_price1 = 3000;
		int item_amount1 = 1;
		
		String item_name2 = "슬라이드식명찰(가로형)(100호)";
		String item_code2 = "11008152";
		int item_price2 = 1000;
		int item_amount2 = 1;
		
		String item_name3 = "매직흡착 인테리어후크(알루미늄타입)";
		String item_code3 = "1020800";
		int item_price3 = 1000;
		int item_amount3 = 1;
		
		String[] item_name = {item_name1, item_name2, item_name3};
		String[] item_code = {item_code1, item_code2, item_code3};
		int[] item_price = {item_price1, item_price2, item_price3};
		int[] item_amount = {item_amount1, item_amount2, item_amount3};
		
		
		item_name[i] = item_name[i].substring(0, 15); 
		
		System.out.printf("%s %12d  %d  %d\n[%s]\n", item_name[i], item_price[i], 
				item_amount[i], item_price[i]*item_amount[i], item_code[i]);
		price_total += item_price[i];

	}
	
	public static void itemPrint(int n) {
		HearderPrint(n);
	}
	
	public static void totalPrint() {
		double sales = price_total / 1.1;
		double vat = sales * 0.1;
		
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.printf("\t\t과세합계\t%19s\n", df.format(sales));
		System.out.printf("\t\t 부가세\t%19s\n", df.format(vat));
		System.out.println("-------------------------------------------");
		System.out.printf("판매합계:\t\t\t%19s\n", df.format(price_total));
		System.out.println("===========================================");
		System.out.printf("신용카드:\t\t\t%19s\n", df.format(price_total));
		System.out.println("-------------------------------------------");
		System.out.printf("%s \t\t %26s\n", "우리카드", "538720***********");
		System.out.printf("%s \t  %9s %s\n", "승인번호 77982843 (0)", "승인금액", df.format(price_total));
		System.out.println("===========================================");
	}
}
