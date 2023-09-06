package chap13;

import java.util.Collections;
import java.util.LinkedList;

public class Collection02 {
	public static void main(String[] args) {
		LinkedList<Integer> num = new LinkedList<Integer>();
		
		for (int i = 10; i >= 1; i--)
			num.add(i);
		
		System.out.println(num);
		
		System.out.print("정렬 전 : ");
		for (int i = 0; i < num.size(); i++)
			System.out.print(num.get(i) + " ");
		Collections.sort(num); // 이걸 더 자주 씀
		//num.sort(Comparator.naturalOrder());
		
		System.out.println();
		System.out.print("정렬 후 : ");
		for (int i = 0; i < num.size(); i++)
			System.out.print(num.get(i) + " ");

	}

}
