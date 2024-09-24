package courseBroCode;


public class CourseSwitchCase {

	public static void main(String[] args) {
		//Statement that allows a variable to be tested for equality against a list of values.
		//No need to break the default case. But it is a good practice to avoid future issues.
		
		String day = "Pizza";
		
		switch (day) {
			case "Sunday": System.out.println("It is Sunday!");
			break;
			case "Monday": System.out.println("It is Monday!");
			break;
			case "Tuesday": System.out.println("It is Tuesday!");
			break;
			case "Wednesday": System.out.println("It is Wednesday!");
			break;
			case "Thursday": System.out.println("It is Thursday!");
			break;
			case "Friday": System.out.println("It is Friday!");
			break;
			case "Saturday": System.out.println("It is Saturday!");
			break;
			default: System.out.println("That is not a weekday.");
			break;
		}
		
	}

}
