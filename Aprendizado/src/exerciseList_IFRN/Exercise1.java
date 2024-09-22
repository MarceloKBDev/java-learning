package exerciseList_IFRN;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise1 {
/*
 * Write an algorithm that reads an age input, expressed in years, months and days then shows it expressed in days.
 * Consider that a year has 365 days and that a month has 30 days.
 * eg: 3 years, 2 months and 15 days = 1170 days
 */

    //Method to get input and return a Map with age components
	@SuppressWarnings("resource")
	private static Map<String, Integer> inputAge() {
    	Map<String, Integer> mapAgeValues = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Type your age as indicated: ");
        System.out.print("Years: ");
        mapAgeValues.put("ageYears", scan.nextInt());
        System.out.print("Months: ");
        mapAgeValues.put("ageMonths", scan.nextInt());
        System.out.print("Days: ");
        mapAgeValues.put("ageDays", scan.nextInt());

        return mapAgeValues;
    }

    //Method to convert age to days//
	private static int convertToDays(int ageYears, int ageMonths, int ageDays) {
		int ageAsDays = ageDays+(ageMonths*30)+(ageYears*365);
		return ageAsDays;
	}

    //Method that summons methods 'inputAge' and 'convertToDays'//
    private static int convertUserInputToDays() {
    	//Get user input and store in mapAgeValues//
    	Map<String, Integer> mapAgeValues = inputAge();

    	//Get values from mapAgeValues
    	int ageYears = mapAgeValues.get("ageYears");
    	int ageMonths = mapAgeValues.get("ageMonths");
    	int ageDays = mapAgeValues.get("ageDays");

    	return convertToDays(ageYears, ageMonths, ageDays);
    }

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String checkCorrect;
		boolean shouldLoopStop=false;
		
		while (shouldLoopStop==false) {
			//Get user input and store in mapAgeValues//
			int totalDays = convertUserInputToDays();

			//Confirm user input//
			System.out.print("Is your age correct? (Y/N): ");
			checkCorrect = scan.next();

			if (checkCorrect.equalsIgnoreCase("Y")) {
				System.out.println("You have lived for a total of " + totalDays + " days!");
				shouldLoopStop=true;
			} else if (checkCorrect.equalsIgnoreCase("N")) {
				System.out.println("Please re-enter your age.\n");
			} else {
				System.out.print("Please respond with Y/N as indicated.\n");
			}

		}
		//Closing Scanner 'scan' to prevent memory leaks//
		scan.close();
	}
}