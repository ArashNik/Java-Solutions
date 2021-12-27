/****************************************************************************
 * (sum the digits in an integer) Write a method that computes the sum of the
 *  in an integer. Use the following header: 
 * 
 *      public static int sumDigits(long n)
 * 
 *  for example, sumDigits(234) returns 9(= 2+3+4) (Hint: Use the % operator
    to extract digits, and the / operator to remove the extracted digit. 
    For instance, to extract 4 from 234, use 234 % 10 (= 4). To remove 4 from 234, 
    use 234 / 10 (= 23). Use a loop to repeatedly extract and remove the digit 
    until all the digits are extracted. Write a test program that prompts the 
    user to enter an integer and displays the sum of all its digits.
 *****************************************************************************/
package numbers;

import java.util.Scanner;

public class SumInts {
    public static void main(String[] args) {
        
        // prompt input
//      System.out.println("Enter a digit");
//      Scanner in = new Scanner(System.in);
//      long n = in.nextLong();
        System.out.println(sumDigits(Long.MAX_VALUE)); 
        //Long.MAX_VALUE = 9223372036854775807L
    }

    private static long sumDigits(long n) {
        int sum = 0;
        while (n > 0  ) {
            sum += n % 10;  // extract digit
            n /= 10;        // remove digit
        }
        return sum;
        
    }
    
}
