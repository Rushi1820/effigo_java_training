package stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class details {

	public static List<database> getAll() {
		return Stream
				.of(new database(1, "rushi", "rushi18@gmail.com", Arrays.asList("1109769681", "9087611546")),
						new database(1, "vardhan", "vardhan12@gmail.com", Arrays.asList("1211133333", "1345678897")),
						new database(3, "ram", "ram@gamil.com", Arrays.asList("1311334444", "3456247546")))
				.collect(Collectors.toList());

	}

}
