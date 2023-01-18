
package collections;

import java.util.ArrayList;
import java.util.List;

public class democollection {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(60);
		System.out.println(list);

		list.add(3, 50);
		System.out.println(list);
		System.out.println(" the array element at position 3 is " + list.get(3));

		List<Integer> listt = new ArrayList<>();
		listt.add(200);
		listt.add(500);

		list.addAll(listt);
		System.out.println(list);

		list.remove(2);
		System.out.println(list);
	}

}
