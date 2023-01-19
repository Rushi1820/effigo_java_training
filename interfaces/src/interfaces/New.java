package interfaces;

interface FirstInterface {
	public void myMethod(); // interface method
}

interface SecondInterface {
	public void myOtherMethod(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface {
	public void myMethod() {
		System.out.println("welcome to java interface method 1");
	}

	public void myOtherMethod() {
		System.out.println("welcome to java interface method 2");
	}
}

class New {
	public static void main(String[] args) {
		DemoClass myObj = new DemoClass();
		myObj.myMethod();
		myObj.myOtherMethod();
	}
}
