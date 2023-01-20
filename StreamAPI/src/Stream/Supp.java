package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Supp {
	public static void main(String[] args) {
		Supplier<String> supplier = () -> "Hi my name is rushi";
		System.out.println(supplier.get());

		List<String> lsi = Arrays.asList("a", "r", "t", "u");
		System.out.println(lsi.stream().findAny().orElseGet(supplier));

	}
}
