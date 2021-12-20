package application;

public class App {

	public static void main(String[] args) {
		// final is a keyword
		// used to prevent the value of a variable from changing
		// this makes it a constant
		
		// constants are usually written in all caps

		final int VALUE = 9;
		System.out.println(VALUE);

		/*
		 * value = 11;
		 * 
		 * System.out.println(value); 
		 * 
		 * won't run because Java gives an error saying that
		 * the variable can't be changed
		 */
	
	
	String password = "abc";
	password = "edg";
	/* Java is not changing the variable value.  The variable is 
	 * immutable.  Instead, Java is creating a new string and making
	 * the variable point to it.
	 */
	
	System.out.println(password);
	

	final String USER_PASSWORD = "abc";
	// with final, cannot change the variable
	
	System.out.println(USER_PASSWORD);
	}
}
