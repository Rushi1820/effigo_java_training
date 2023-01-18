package car;

import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);

		System.out.println("Enter your percentage:");
		int grade = scann.nextInt();

		if (grade >= 80) {
			System.out.println("you got A grade");
		} else if (grade >= 70 && grade <= 80) {
			System.out.println("you got grade B");
		} else {
			System.out.println("you got c grade");
		}

	}

}
