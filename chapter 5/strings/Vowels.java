/******************************5.69 ******************************************
(Count vowels and consonants) Assume letters A, E, I, O, and U as the vowels.
Write a program that prompts the user to enter a string and displays the number
of vowels and consonants in the string.
*******************************************************************************/
package strings;

import java.util.Scanner;
public class Vowels {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = in.nextLine();
        
        
        int vowels, 
                consonants;     // intialize the accumalators to 0;
        vowels = consonants = 0;
        
        for (int i = 0; i < string.length(); i++) {
           
            char ch = Character.toUpperCase(string.charAt(i));     // storthand var for char
            if (Character.isLetter(ch)) {
                
                if (ch == 'A' 
                        || ch == 'E' 
                        || ch == 'I' 
                        || ch == 'O' 
                        || ch == 'U') {
                    vowels++;
                }
                else 
                    consonants++; 
            }
        }
        /** display results */
        System.out.printf("Vowels: %s\nConsonants: %s\n", vowels, consonants);
    }
}
