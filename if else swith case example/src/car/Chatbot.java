package car;

import java.util.Scanner;

public class Chatbot {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Hey.Welcome to chatbot,I am here to help you.What is your name?");
		String name = scan.nextLine();

		System.out.println("What is your age?");
		int age = scan.nextInt();

		System.out.println("So you are  " + age + " ,nice. I am 200 year old");
		System.out.println("That means i am " + (200 / age) + " times older than you");
		System.out.println("Now tell me what is your favourite cricket team:");
		scan.nextLine();
		String team = scan.nextLine();

		System.out.println(team + " is one of the best competitive team.");
		System.out.println("Thanks for your valuable time,hope u liked the conversation");
		System.out.println("byee,have a good day");
	}

}
