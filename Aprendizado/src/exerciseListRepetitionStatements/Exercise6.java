package exerciseListRepetitionStatements;

import java.util.Scanner;

public class Exercise6 {
/*
 * Write an algorithm that reads the ages of 20 people and display the sum of the ages.
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 1;
		double sum = 0;

		while (i<=20) {
			System.out.print("Please input the age to be added: ");
			sum =+ sum + scan.nextDouble();
			i++;
		}

		System.out.println("The total of the sum is: " + sum);
		
		//Closing Scanner 'scan' to avoid memory leak
		scan.close();
	}
}