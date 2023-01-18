package inherit;

public class overload {

	static int addition(int a, int b) {
		return a + b;
	}

	static int addition(int a, int b, int c) {
		return a + b + c;
	}

	static double addition(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println(addition(12, 13, 14));
		System.out.println(addition(15, 80));
		System.out.println(addition(12.5, 89.8));

	}
}
