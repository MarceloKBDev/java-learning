package courseBroCode;

public class CourseWrapperClass {

	public static void main(String[] args) {
		// Wrapper Class = Provides a way to use primitive data types as reference data types
		// Reference data types contain useful methods
		// Can be used with collections (ex.ArrayList)
		
		// primitive	// Wrapper
		// ---------	// -------
		// boolean		// Boolean
		// char			// Character
		// int			// Integer
		// double		// Double
		
		// autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper class
		// unboxing	= the reverse of autoboxing. Automatic conversion of wrapper to primitive.
		
		Boolean a = true;
		Character b = '@';
		Integer c = 123;
		Double d = 3.14;
		String e = "Marcelo";
		
		if (a==true) {
			System.out.println("This is true.");
		}
		
	}
}