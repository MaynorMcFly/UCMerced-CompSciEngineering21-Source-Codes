package recursion;

public class Reverse {

	/*
	 * Now, write a recursive solution to reverse without using any helper methods.
	 * That is, reverse should only call reverse! (and some string manipulation methods).
	 */
	
	
	public String reverse (String s) {

		if (s.length() == 1) {
			// base case
			
		return s;
		
		} else {
			// the recursive case! 
		String partial = reverse(s.substring(1,s.length()));
		String firstLetter = s.substring(0,1);
		return (partial + firstLetter);
			
		}
		
	}
	
	
	//////// HELPER METHODS YOU MIGHT FIND USEFUL
	
	// returns a string containing all the characters except the first
	public static String allButFirst(String s) {
		return s.substring(1);
	}
	
	// returns a string  containing all the characters except the last
	public static String allButLast(String s) {
		return s.substring(0, s.length());
	}	
}
