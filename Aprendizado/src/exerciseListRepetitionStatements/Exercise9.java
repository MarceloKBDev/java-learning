package exerciseListRepetitionStatements;

import java.util.Scanner;

public class Exercise9 {
/*
 * Write an algorithm that reads the name and age of 10 people and display the name of the youngest person.
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String absoluteYoungestName="No one is the youngest.";
		int absoluteYoungestAge=999;
		int i=1;

		while (i<=10) {
			System.out.print("Please input the name to be checked: ");
			String possibleYoungestName = scan.next();
			System.out.print("Please input the age of that person: ");
			int possibleYoungestAge = scan.nextInt();
			
			if (possibleYoungestAge<absoluteYoungestAge) {
				absoluteYoungestName=possibleYoungestName;
				possibleYoungestAge=absoluteYoungestAge;
			}
			i++;
		}

		System.out.println("The youngest person is: " + absoluteYoungestName);
		
		//Closing Scanner 'scan' to avoid memory leak
		scan.close();
	}
}