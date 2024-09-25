package courseBroCode;

import java.util.Scanner;

public class CourseNestedLoops {

	public static void main(String[] args) {

		// Nested loop = a loop inside a loop
		
		Scanner scan = new Scanner (System.in);
		int rows, columns;
		String symbol = "";
		
		System.out.print("Enter # of rows: ");
		rows = scan.nextInt();
		System.out.print("Enter # of columns: ");
		columns = scan.nextInt();
		System.out.print("Enter symbol to use: ");
		symbol = scan.next();
		
		for (int i=1; i<=rows; i++) {
			System.out.println();
			for (int j=1; j<=columns; j++) {
				System.out.print(symbol);
			}
		}
		scan.close();
	}

}
