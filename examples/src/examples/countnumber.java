package examples;

import java.util.Scanner;

public class countnumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number to count by difference:");
		int num = s.nextInt();
		System.out.println("enter a number to start from:");
		int n2 = s.nextInt();
		System.out.println("enter a number to end at:");
		int n3 = s.nextInt();

		for (int i = n2; i <= n3; i = i + num) {
			System.out.println(i + " ");
		}

	}

}
