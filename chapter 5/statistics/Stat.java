/************************exercise 5.45*****************************************
(Statistics: compute mean and standard deviation) In business applications, you
are often asked to compute the mean and standard deviation of data. The mean is
simply the average of the numbers. The standard deviation is a statistic that tells
you how tightly all the various data are clustered around the mean in a set of data.
For example, what is the average age of the students in a class? How close are the
ages? If all the students are the same age, the deviation is 0.
Write a program that prompts the user to enter ten numbers, and displays the
mean and standard deviations of these numbers using the following formula:
********************************************************************************/
package statistics;

import java.util.Scanner;
public class Stat {
    public static void main(String[] args) {
        double mean,                    // stores the mean
                sdev, number;         // store the standard dev and input
        
        Scanner input = new Scanner(System.in); // scanner object
        System.out.println("Enter ten numbers:");
        
        mean = number = sdev = 0;     // intialize all variables
        for (int i = 1; i <= 10; i++) {
            number = input.nextDouble();       // sum the numbers
            mean += number;     // compute the mean
            sdev += Math.pow(number, 2);
        }
        sdev = Math.sqrt((sdev - (Math.pow(mean, 2) / 10)) / (10 - 1));
        mean /= 10;
        
        // display results 
        System.out.printf("Mean: %.2f\n", mean);
        System.out.printf("Standard Deviation: %.5f", sdev);
    }
    
}
