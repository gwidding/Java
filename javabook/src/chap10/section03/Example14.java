package chap10.section03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Example14 {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		String strDate = formatter.format(date);
		System.out.println("MM/dd/yyyy : " + strDate);
		
		formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss"); // M(달), mm(분)
		strDate = formatter.format(date);
		System.out.println("dd-M-yyyy hh:mm:ss : " + strDate);
		
		formatter = new SimpleDateFormat("dd MMMM yyyy");
		strDate = formatter.format(date);
		System.out.println("dd MMMM yyyy : " + strDate);
		// zzzz 잘 안 씀
		formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");
		strDate = formatter.format(date);
		System.out.println("dd MMMM yyyy zzzz : " + strDate);
	}

}
