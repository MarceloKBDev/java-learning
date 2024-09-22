package exerciseListRepetitionStatements;

import java.util.Scanner;

public class Exercise11 {
/*
 * Write an algorithm that reads 20 numbers from the user and displays how many numbers are greater than 8.
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberCount=0;
		int i=1;

		while (i<=20) {
			System.out.print("Please write your number: ");
			double inputNumber = scan.nextDouble();
			
			if (inputNumber>8){
				numberCount++;
			}
			i++;
		}
		
		System.out.println("There are a total of " + numberCount + " numbers greater then 8.");
		
		//Closing Scanner 'scan' to avoid memory leak
		scan.close();
	}
}