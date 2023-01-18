package polymorphism;

class food {
	static void item() {
		System.out.println("items are dosa,idly,vada");
	}

	void items() {
		System.out.println("items arre upma,chapathi,maggie");
	}
}

class lunch extends food {
	static void item() {
		System.out.println("items are biryani,parota,curries");
	}

	void items() {
		System.out.println("chicken,mutton,panner");
	}
}

public class poly {

	public static void main(String[] args) {

		food a = new lunch();
		a.item();//binding
		a.items();//overloading

	}

}
