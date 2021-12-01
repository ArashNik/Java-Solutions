/** ****************************************************************************
 * (Occurrence of max numbers) Write a program that reads integers, finds the largest
 * of them, and counts its occurrences. Assume that the input ends with number
 * 0. Suppose that you entered 3 5 2 5 5 5 0; the program finds that the largest
 * is 5 and the occurrence count for 5 is 4.
 * (Hint: Maintain two variables, max and count. max stores the current max number,
 * and count stores its occurrences. First, assign the first number to max
 * and 1 to count. Compare each subsequent number with max. If the number is
 * greater than max, assign it to max and reset count to 1. If the number is equal
 * to max, increment count by 1.)
 ****************************************************************************** */
package numbers;

import java.util.Scanner;

public class MaxNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // prompt the user to enter a number
        System.out.print("Enter Numbers: ");
        int max = in.nextInt();     // holds the max integer
        int count = 1;              // store the occurance of max in set

        /**
         * ** find the max # and its occurrences *
         */
        int number;    // intialize var to store inputs

        do {
            number = in.nextInt();
            if (number == max) {
                count++;
            }
            if (number > max) {
                max = number;
                count = 1;
            }

        } while (number != 0);
        // display results
        System.out.println("The largest number is " + max);
        System.out.println("The occurence of the max number is: " + count);

    }

}
