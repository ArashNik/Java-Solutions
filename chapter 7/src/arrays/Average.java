 /************************************************************************************
* (Average an array) Write two overloaded methods that return the average of an     *
* array with the following headers:                                                 *
* public static int average(int[] array)                                            *
* public static double average(double[] array)                                      *
* Write a test program that prompts the user to enter ten double values, invokes    *
* this method, and displays the average value.                                      *
*************************************************************************************/
package arrays;
import java.util.Scanner;
public class Average {
	public static void main(String[] args) {
		// driver program
		double[] arr = new double[10];
		Scanner in = new Scanner(System.in);
		
		System.out.println("usage: Enter ten digits to return mean");
		for (int i = 0; i < arr.length; i++) 
			arr[i] = in.nextDouble();
		System.out.print("Arimithic Mean: " + average(arr));
	}
	
	/** returns the average of the array elements */
	public static double average(double[] array) {
            double sum = 0;
            for (int i = 0; i < array.length; i++) {
				sum += array[i];
            }
            return sum / array.length;		// arimithic mean x-bar
	}
	
	/** overloaded method */
	public static int average(int[] array) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
				sum += array[i];
            }
            return sum / array.length;		// arimithic mean x-bar
	}
		
 
} 