/***********************Exercise-5.37***************************************
(Decimal to binary) Write a program that prompts the user to enter a decimal
integer and displays its corresponding binary value. Don’t use Java’s Integer
.toBinaryString(int) in this program.
*****************************************************************************/
package numbers;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //System.out.print(Integer.toBinaryString(2));
        
        // prompt the user for a decimal integer
        System.out.println("Enter a decimal: ");
        int decimal = in.nextInt();
        
        String binary = " ";        // store the binary value
        /* convert the decimal to a binary string */
        for (int i = decimal; i > 0; i /= 2) {
            binary = (i % 2) + binary;
        }
        // Display the corresponding binary value of the decimal integer
        System.out.println( "The binary value of the decimial \"" 
                + decimal + "\" is: " + binary);
    }
    
}
