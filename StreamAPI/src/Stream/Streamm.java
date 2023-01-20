package Stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Streamm {
	public static void main(String[] args) {
		List<String> name = new ArrayList<>();
		name.add("rushi");
		name.add("ram");
		name.add("jay");
		name.add("rohan");

		name.stream().forEach(t -> System.out.println(t));
		System.out.println("*************");
		name.stream().filter(t -> t.startsWith("r")).forEach(t -> System.out.println(t));
		System.out.println("*************");
		Map<Integer, String> map = new HashMap<>();
		map.put(10, "rus");
		map.put(11, "shi");
		map.put(12, "pen");
		map.put(14, "cat");
		map.put(16, "ant");

		map.entrySet().stream().filter(obj -> obj.getKey() % 2 == 0).forEach(obj -> System.out.println(obj));

	}
}
