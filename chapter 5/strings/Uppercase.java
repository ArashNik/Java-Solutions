/************************* 5.50 *********************************************
(Count uppercase letters) Write a program that prompts the user to enter a string
and displays the number of the uppercase letters in the string.
*/
package strings;

import java.util.Scanner;
public class Uppercase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = in.nextLine();
        
        int upper;
        upper = 0;      // accumalator
        /** count the number of uppercase letters **/
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (Character.isUpperCase(ch))
                    upper++;      
            
        }
        System.out.println(upper);
    }
}
