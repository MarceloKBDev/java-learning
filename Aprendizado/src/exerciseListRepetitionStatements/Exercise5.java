package exerciseListRepetitionStatements;

import java.util.Scanner;

public class Exercise5 {
/*
 * Write an algorithm that reads 10 numbers from the user and calculates the sum of these numbers.
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 1;
		double sum = 0;

		while (i<=10) {
			System.out.print("Please input the number to be added: ");
			sum =+ sum + scan.nextDouble();
			i++;
		}

		System.out.println("The total of the sum is: " + sum);
		
		//Closing Scanner 'scan' to avoid memory leak
		scan.close();
	}
}