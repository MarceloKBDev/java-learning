package courseBroCode;

import java.util.Scanner;

public class CourseCalculateHypotenuse {

	public static void main(String[] args) {
		double catetoA, catetoB, hypotenuse;
		Scanner scan = new Scanner(System.in);
		
		//Getting triangle leg sizes
		System.out.println("Please type the first leg length: ");
		catetoA = scan.nextDouble();		
		System.out.println("Please type the second leg length: ");
		catetoB = scan.nextDouble();
		
		//Calculate hypotenuse 'C^2 = A^2 + B^2'
		hypotenuse = Math.sqrt((Math.pow(catetoA, 2))+(Math.pow(catetoB, 2)));
		
		System.out.println(hypotenuse);
	}

}
