package exerciseList_IFRN;

import java.util.Scanner;

public class Exercise6 {
/*
 * Develop an algorithm that reads an integer and prints its predecessor and its successor.
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inputInteger, integerPredecessor, integerSuccessor;

		//Get integer
		System.out.print("Please input your integer: ");
		inputInteger = scan.nextInt();

		//Get predecessor and successor
		integerPredecessor = inputInteger - 1;
		integerSuccessor = inputInteger + 1;

		System.out.println("Your integer's predecessor: " + integerPredecessor);
		System.out.println("Your integer's successor: " + integerSuccessor);

		scan.close();
	}
}