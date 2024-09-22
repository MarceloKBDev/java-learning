package exerciseListRepetitionStatements;

import java.util.Scanner;

public class Exercise4 {
/*
 * Read user's Name and value 'N'. Then print user's Name N times.
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 1;

		System.out.print("Please input your name: ");
		String userName = scan.next();
		
		System.out.print("Please input how many time you'd like to have it repeated: ");
		int repeat = scan.nextInt();

		while (i<=repeat) {
			System.out.println(userName);
			i++;
		}
		scan.close();
	}
}