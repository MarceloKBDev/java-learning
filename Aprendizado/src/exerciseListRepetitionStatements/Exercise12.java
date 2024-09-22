package exerciseListRepetitionStatements;

import java.util.Scanner;

public class Exercise12 {
/*
 * Write an algorithm that reads 20 numbers from the user and displays how many numbers are even.
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int evenCount=0;
		int i=1;

		while (i<=20) {
			System.out.print("Please write your number: ");
			double inputNumber = scan.nextDouble();
			
			if ((inputNumber%2)==0){
				evenCount++;
			}
			
			i++;
		}
		
		System.out.println("There are a total of " + evenCount + " even numbers.");
		
		//Closing Scanner 'scan' to avoid memory leak
		scan.close();
	}
}