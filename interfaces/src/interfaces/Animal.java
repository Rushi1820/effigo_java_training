package interfaces;

// Interface
interface Anima {
	public void animalSound(); // interface method (does not have a body)

	public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig implements Anima {
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("lion says he is the king of the forest");
	}

	public void sleep() {
		// The body of sleep() is provided here
		System.out.println("tiger and other animals says go n sleep we will rule this forest");
	}
}

class Animal {
	public static void main(String[] args) {
		Pig myPig = new Pig(); // Create a Pig object
		myPig.animalSound();
		myPig.sleep();
	}
}
