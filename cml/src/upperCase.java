/* (7.22)Write a program that passes a string to the cml and displays the 
 * the number of uppercase letters in the string.
 */
public class upperCase {
	public static void main(String[] argv) {
		String s = "coMmAmd";
		int i, count;
			count = 0;
		System.out.println(s);
		for (i = 0; i < s.length(); i++) {
			// check if char is uppercase and count it
			if ( Character.isUpperCase(s.charAt(i))) 
					count++;
		}
		System.out.print("The number of upperCase letters is " + count);
	}
}