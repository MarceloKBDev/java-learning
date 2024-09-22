package exerciseListRepetitionStatements;

import java.util.Scanner;

public class Exercise13 {
/*
 * Create an algorithm that reads 20 numbers and, at the end, displays how many are between 0 and 100.
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberCounter=0;
		int i=1;

		while (i<=20){
			System.out.print("Please input your number: ");
			double inputNumber = scan.nextDouble();
			
			if((inputNumber>0)&&(inputNumber<100)) {
				numberCounter++;
			}
			i++;
		}
		
		System.out.println("You've typed a total of " + numberCounter + " numbers between 0 and 100.");
		
		//Closing Scanner 'scan' to avoid memory leak
		scan.close();
	}
}