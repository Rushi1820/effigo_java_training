package inherit;

class animal {
	void printA() {
		System.out.println("Animal is running");
	}
}

class dog extends animal {
	void printB() {
		System.out.println("Dog is small animal");
	}
}

class cat extends dog {
	void printC() {
		System.out.println("cat is eating fish");
	}
}

public class inhertdemo {

	public static void main(String[] args) {

		cat c = new cat();
		c.printC();
		c.printB();
		c.printA();
	}

}
