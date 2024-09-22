package exerciseListRepetitionStatements;

import java.util.Scanner;

public class Exercise14 {
/*
 * Create an algorithm that reads 20 numbers and, at the end, displays how many are between 0 and 100, how many are between 101 and 200, and how many are greater than 200.
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberCounterGreaterThan200=0;
		int numberCounterUpTo200=0;
		int numberCounterUpTo100=0;
		int i=1;

		while (i<=20){
			System.out.print("Please input your number: ");
			double inputNumber = scan.nextDouble();
			
			if(inputNumber>200) {
				numberCounterGreaterThan200++;
			} else if (inputNumber>100) {
				numberCounterUpTo200++;
			} else if (inputNumber>0) {
				numberCounterUpTo100++;
			}
			i++;
		}
		
		System.out.println("You've typed a total of " + numberCounterUpTo100 + " numbers between 0 and 100.");
		System.out.println("You've typed a total of " + numberCounterUpTo200 + " numbers between 101 and 200.");
		System.out.println("You've typed a total of " + numberCounterGreaterThan200 + " numbers greater than 200.");
		
		//Closing Scanner 'scan' to avoid memory leak
		scan.close();
	}
}