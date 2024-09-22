package exerciseListRepetitionStatements;

import java.util.Scanner;

public class Exercise8 {
/*
 * Write an algorithm that read the ages of 20 people and display how many are adults.
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 1;
		double ageToCheck=0;
		int countAdults=0;

		while (i<=20) {
			System.out.print("Please input the age to be checked: ");
			ageToCheck = scan.nextInt();
			if (ageToCheck>=18) {
				countAdults++;
			}
			i++;
		}

		System.out.println("The total of the sum is: " + countAdults);

		//Closing Scanner 'scan' to avoid memory leak
		scan.close();
	}
}