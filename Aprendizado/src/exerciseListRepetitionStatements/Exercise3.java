package exerciseListRepetitionStatements;

import java.util.Scanner;

public class Exercise3 {
/*
 * Write an algorithm that reads the user's name and display their name on the screen 10 times.
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 1;

		System.out.print("Please input your name: ");
		String userName = scan.next();

		while (i<=10) {
			System.out.println(userName);
			i++;
		}
		scan.close();
	}
}