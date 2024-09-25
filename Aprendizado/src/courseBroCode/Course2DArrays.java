package courseBroCode;

public class Course2DArrays {

	public static void main(String[] args) {
		// 2D array = array of arrays
		String[][] cars = {
							{"Camaro","Corvette","Silverado"},
							{"Mustang","Ranger","F-150"},
							{"Ferrari", "Lambo","Tesla"}
						};
		for (int i=0; i<cars.length; i++) {
			System.out.println();
			for (int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i][j]+" ");
			}
		}
	}
}