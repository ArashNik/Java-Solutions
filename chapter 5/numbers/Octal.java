/*
(Decimal to octal) Write a program that prompts the user to enter a decimal
integer and displays its corresponding octal value. Don’t use Java’s Integer
.toOctalString(int) in this program.
*/
package numbers;

import java.util.Scanner;


public class Octal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner

	// Prompt the user to enter a decimal integer
	System.out.print("Enter a decimal integer: ");
	int decimal = input.nextInt();

	/***Convert decimal to octal: octal dabble method***/
	String octal = "";
        for (int i = decimal; i > 0; i /= 8 ) {
            octal = i % 8 + octal;
            
        }
        // Display the corresponding binary value of the decimal integer
        System.out.println( "The octal value of the decimial \"" 
                + decimal + "\" is: " + octal);
        
    }
    
}
