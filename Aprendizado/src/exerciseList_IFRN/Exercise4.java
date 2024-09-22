package exerciseList_IFRN;

import java.util.Scanner;

public class Exercise4 {
/*
 * "Write an algorithm that reads:
 * 1. The tax percentage to be added to the value of the parts
 * 2. The code of part 1, unit value of part 1, quantity of part 1
 * 3. The code of part 2, unit value of part 2, quantity of part 2
 * 
 * The algorithm should calculate the total amount to be paid and present the result. 
 * Formula: (value1*quantity1 + value2*quantity2)*(tax/100 + 1)"
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double taxPercentage;
		@SuppressWarnings("unused")
		String part1Code, part2Code;
		double part1UnitValue, part2UnitValue, dueValue;
		int part1Quantity, part2Quantity;
		
		//Get tax percentage
		System.out.print("Please input the tax percentage: ");
		taxPercentage = scan.nextDouble();
		
		//Get Part 1 info
		System.out.print("Please input the code of part 1: ");
		part1Code = scan.next();
		System.out.print("Please input the unit value of part 1: ");
		part1UnitValue = scan.nextDouble();
		System.out.print("Please input the quantity of part 1: ");
		part1Quantity = scan.nextInt();
		
		//Get Part 2 info
		System.out.print("Please input the code of part 2: ");
		part2Code = scan.next();
		System.out.print("Please input the unit value of part 2: ");
		part2UnitValue = scan.nextDouble();
		System.out.print("Please input the quantity of part 2: ");
		part2Quantity = scan.nextInt();
		
		//Calculating the due value as in the formula presented on the exercise
		dueValue = ((part1UnitValue*part1Quantity)+(part2UnitValue*part2Quantity)) * (1+(taxPercentage/100));
		
		//Printing results
		System.out.println("The total due value is: " + dueValue);
		
		//Closing Scanner 'scan' to avoid memory leak
		scan.close();
	}
}