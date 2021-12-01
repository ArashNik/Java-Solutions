/**********************************Exercise 4.22 *****************************
 * (Check substring) Prompt the user to enter two strings, and report whether 
 * the second string is a substring of the first string
 *****************************************************************************/
package strings;

import java.util.Scanner;
public class substring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // enter two strings
        System.out.print("Enter a string ");
        String s1 = in.nextLine();
        System.out.print("Enter a string ");
        String s2 = in.nextLine();
        
        
        // check if s1 contains s2
        if (s1.indexOf(s2) != -1 ) // s1.contains(s2) also works 
            System.out.println(s2 + " is a substring of " + s1);
        else 
            System.out.println(s2 + " is not a substring of " + s1);
  
    }
}
