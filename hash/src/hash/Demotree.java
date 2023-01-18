package hash;

import java.util.Map;
import java.util.TreeMap;

public class Demotree {

	public static void main(String[] args) {
		Map<Integer, Integer> maa = new TreeMap<>();
		int m = 20;
		maa.put(1, m * 1);
		maa.put(2, m * 2);
		maa.put(3, m * 3);
		maa.put(4, m * 4);
		maa.put(5, m * 5);
		maa.put(6, m * 6);
		System.out.println("\nwelcome to table multplication of 20:");
		System.out.println("what is 4 multlipied by:" + m);
		System.out.println(maa.get(4));

		System.out.println("what is 6 multlipled by:" + m);
		System.out.println(maa.get(6));

		System.out.println("what is 2 multiplied by" + m);
		System.out.println(maa.get(2));
	}
}
