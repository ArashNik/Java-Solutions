/****************** ******* Exercise 5.47****************************************
(Business: check ISBN-13) ISBN-13 is a new standard for identifying books. It
uses 13 digits d1d2d3d4d5d6d7d8d9d10d11d12checksum. The last digit checksum 
is a checksum, which is calculated from the other digits using the following 
formula:        
    10 - (d1 + 3d2 + d3 + 3d4 + d5 + 3d6 + d7 + 3d8 + d9 + 3d10 + d11 + 3d12) % 10

* If the checksum is 10, replace it with 0. Your program should read the input as a
string.
*******************************************************************************/
package strings;

import java.util.Scanner;
public class ISBN13 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("Enter the first 12 digits of the ISBN-13 number: ");
        String isbn = in.nextLine();
        
        // verify the string
        if (isbn.length() != 12) {
            System.out.println(isbn + " is invalid");
            Runtime.getRuntime().exit(1);       // equivalent of System.exit(c);
        }
        int checksum = 0;       // store the checksum value
        for (int i = 0; i < isbn.length(); i++) {
            checksum += i % 2 == 0 ? 3 * Integer.parseInt(isbn.charAt(i) + "") 
                    : Integer.parseInt(isbn.charAt(i) + "");  
        }
        checksum = 10 - checksum % 10;
        // display the result
        System.out.println("The ISBN-14 # is " + isbn + (checksum == 10 ? 0 : checksum));
    }
}
