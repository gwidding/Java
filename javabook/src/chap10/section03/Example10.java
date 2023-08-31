package chap10.section03;

import java.util.Calendar;

public class Example10 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.print("현재 날짜 : ");
		System.out.print(calendar.get(Calendar.YEAR) + "년 ");
		System.out.print(calendar.get(Calendar.MONTH) + 1 + "월 ");
		// 월이 0부터 시작돼서 1 더해줘야 함. 그러다보면 31일 없는 달은 조심해야 함
		System.out.print(calendar.get(Calendar.DATE) + "일");
	}
}
