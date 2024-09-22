package exerciseListRepetitionStatements;

import java.util.Scanner;

public class Exercise15 {
/*
 * Write an algorithm that reads a sequence of numbers from the user and calculates the sum of those numbers. End the execution when a negative number is entered.
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double numberSum=0;
		int i=0;

		while (i<=1){
			System.out.print("Please input a positive number: ");
			double inputNumber = scan.nextDouble();
			
			if (inputNumber>0) {
				numberSum = numberSum+inputNumber;	
			} else {
				System.out.println("You've inputted a negative number.");
				System.out.println("The sum of the positives you've inputted is: " + numberSum);
				break;
			}
		}
		
		//Closing Scanner 'scan' to avoid memory leak
		scan.close();
	}
}