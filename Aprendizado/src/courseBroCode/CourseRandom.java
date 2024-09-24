package courseBroCode;

import java.util.Random;

public class CourseRandom {

	public static void main(String[] args) {
		Random random = new Random();
		
		//Not actually random. Pseudo-random.
		int x = random.nextInt(6)+1;
		double y = random.nextDouble();
		boolean z = random.nextBoolean();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}
