package exerciseList_IFRN;

import java.util.Scanner;

public class Exercise3 {
/*
 * Create a program that reads a balance and then prints the balance with a +1% adjustment.
 */
	public static void main(String[] args) {
	double currentBalance, adjustedBalance;
	double adjustment = 1.01;
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Please write your balance: ");
	currentBalance = scan.nextDouble();
	
	adjustedBalance = currentBalance*adjustment;
	System.out.println("/nThis is your adjusted balance: " + adjustedBalance);

	scan.close();	
	}
}