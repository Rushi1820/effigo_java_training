package Stream;

import java.util.function.Predicate;

public class pred {
	public static void main(String[] args) {
		Predicate<Integer> predicate = (t) -> {
			if (t % 2 == 0) {
				return true;
			} else {
				return false;
			}
		};
		System.out.println(predicate.test(32));
		System.out.println(predicate.test(31));
		System.out.println(predicate.test(310));
		System.out.println(predicate.test(64));
	}
}
