package assignment;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class details {

	public static List<Product> getAll() {
		return Stream.of(new Product(101, "shirts", 2098), new Product(102, "Pants", 9879),
				new Product(103, "tshirts", 7689), new Product(104, "shorts", 2345), new Product(105, "pens", 1089))
				.collect(Collectors.toList());

	}

}
