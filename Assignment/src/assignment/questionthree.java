package assignment;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class questionthree {

	public static void main(String[] args) {
		String word = "abababc";
		Map<String, Long> charCount = word.codePoints().mapToObj(Character::toString)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(charCount);
	}

}
