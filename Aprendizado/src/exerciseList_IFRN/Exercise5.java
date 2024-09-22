package exerciseList_IFRN;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Exercise5 {
/*
 * "Write an algorithm that reads:
 * Create an algorithm that reads the value of the minimum wage and the value of a user's salary, calculates how many minimum wages this user earns, and prints the result.
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BigDecimal minimumWageValue, userSalary, salaryInMinimumWages;
		
		//Get minimum wage value
		System.out.print("Please input the minimum wage value: ");
		minimumWageValue = scan.nextBigDecimal();
		
		//Get user salary
		System.out.print("Please input your current salary: ");
		userSalary = scan.nextBigDecimal();
		
		salaryInMinimumWages = userSalary.divide(minimumWageValue, 2, RoundingMode.HALF_UP);
		
		System.out.println("You receive a total of " + salaryInMinimumWages + " minimum wages.");
		
		//Closing Scanner 'scan' to avoid memory leak
		scan.close();
	}
}