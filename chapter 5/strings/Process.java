/********************** 5.48 *************************************************
   write a program that prompts the user to enter a string and displays the 
   the characters at odd positions.
 ***************************************************************************/
package strings;

import java.util.Scanner;
public class Process {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("enter a string");
        String string = in.nextLine();
        
        /** read the characters at odd positions and relay them to output */
        String odd = "";
        for (int i = 0; i < string.length(); i += 2) 
            odd += string.charAt(i);
        
        System.out.print(odd);
    }
}
