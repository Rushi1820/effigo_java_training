//lambda expression is used for showing anonymous function 

package Stream;

interface cal {
	void sum(int input);
}

public class Lambda {

	public static void main(String[] args) {

		cal cal = (input) -> {
			System.out.println("Sum: " + input);
		};
		cal.sum(540);
	}

}
