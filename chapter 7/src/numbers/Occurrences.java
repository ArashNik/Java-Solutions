/*
(Count occurrence of numbers) Write a program that reads the integers between 1
and 100 and counts the occurrences of each. Assume the input ends with 0.
Note that if a number occurs more than one time, the plural word “times” is used
in the output.
*/
package numbers;
import java.util.Scanner;

public class Occurrences {
    public static void main(String[] args) {
        int[] counts = new int[100]; 
        // prompt user for intergers between 1-100
        System.out.println("Enter numbers between 1-100");
        
        count(counts);  // invocation
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0)
                System.out.println(i + " occurs " + counts[i] + " times");
        }
    }
    public static void count(int[] counts) {
        Scanner in = new Scanner(System.in);
        int num;        // to hold user input;
        do {
            num = in.nextInt();
            if (num >= 1 && num <=100)
                counts[num]++;
        } while (num != 000);    // double zero to accommodate deci(10) intervals
    }
}
