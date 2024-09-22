package exerciseListRepetitionStatements;

public class Exercise2 {
/*
 * Write an algorithm that calculates the sum of the numbers from 1 to 15.
 */
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 15; i++) {
		    sum += i;
		}
		System.out.println("Sum: " + sum);
	}
}