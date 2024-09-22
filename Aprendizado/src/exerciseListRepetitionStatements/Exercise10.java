package exerciseListRepetitionStatements;

import java.util.Scanner;

public class Exercise10 {
/*
 * Create an algorithm that reads a number from the user and displays its multiplication table.
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i=1;
		
		System.out.print("Please write your number: ");
		int inputNumber = scan.nextInt();
		
		while (i<=10) {
			int multiplicationResult = inputNumber*i;
			System.out.println(inputNumber + "x" + i + ": "+multiplicationResult);
			i++;
		}
		
		//Closing Scanner 'scan' to avoid memory leak
		scan.close();
	}
}