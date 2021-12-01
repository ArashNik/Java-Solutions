/**************************5.46 ******************************************
 * write a program that prompts the user to enter a string and displays the 
 * string in REVERSE order
 *************************************************************************/
package strings;

import java.util.Scanner;
public class Reverse {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word, or sentence");
        String string = in.nextLine();        // store the word
        
        int length = string.length() - 1;     // shorthand string length
        
        // reverse the string
        String reverse = "";
        for (int i = length; i >= 0; i--) {
            reverse += string.charAt(i);
            
        }
        System.out.print(reverse);
    }
    
    
}
