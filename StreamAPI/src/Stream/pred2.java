package Stream;

import java.util.Arrays;
import java.util.List;

public class pred2 {
	public static void main(String[] args) {

		List<Integer> ls = Arrays.asList(100, 120, 155, 140, 190, 220, 230);
		ls.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println("print even:" + t));
	}

}
