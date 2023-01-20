package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Cons {

	public static void main(String[] args) {
		Consumer<Integer> consumer = (t) -> System.out.println("printing:" + t);

		consumer.accept(100);

		List<Integer> List1 = Arrays.asList(10, 20, 40, 50);
		List1.stream().forEach(consumer);

	}

}
