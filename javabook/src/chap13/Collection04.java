package chap13;

import java.util.HashSet;

public class Collection04 {
	public static void main(String[] args) {
		HashSet<String> str = new HashSet<String>();
		
		str.add("A");
		str.add("B");
		str.add("C");
		System.out.println(str);
		
		System.out.print("HashSet 요소 : ");
		for (String elements : str)
			System.out.print(elements + " ");
		
		String[] array = new String[str.size()];
		str.toArray(array);
		
		// array로 바꿨으니 인덱스로 출력 가능
		// get이 없어서
		System.out.println();
		System.out.print("Array 요소 : ");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}

}
