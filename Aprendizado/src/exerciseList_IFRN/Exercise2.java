package exerciseList_IFRN;

public class Exercise2 {
/*
 * Create a program that prints the arithmetic mean of the numbers 7, 8 and 9. 
 * The mean of the numbers 4, 5, and 6. 
 * The sum of the two means. 
 * The mean of the means.
 */
	public static void main(String[] args) {
	double meanA = ((7+8+9)/3);
	double meanB = ((4+5+6)/3);
	double sumMeans = meanA+meanB;
	double meanOfMeans = ((meanA+meanB)/2);
	
	System.out.println("Mean of 7, 8 and 9: " + meanA);
	System.out.println("Mean of 4, 5 and 6: " + meanB);
	System.out.println("The sum of the two means: " + sumMeans);
	System.out.println("The mean of the means: " + meanOfMeans);
	}
}