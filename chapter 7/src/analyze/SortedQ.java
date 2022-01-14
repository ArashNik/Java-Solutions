/*********************************************************************************
* (Sorted?) Write the following method that returns true if the list is already  *
* sorted in increasing order.                                                    *
*                                                                                *
* public static boolean isSorted(int[] list)                                     *
*                                                                                *
* Write a test program that prompts the user to enter a list and displays        *
* whether the list is sorted or not. Here is a sample run. Note that the first   *
* number in the input indicates the number of the elements in the list. This     *
* number is not part of the list.                                                *
*********************************************************************************/
package analyze;

import java.util.Scanner;

public class SortedQ {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the list");
        int n = in.nextInt();   // list size
        int[] list = new int[n];
        System.out.println("Enter the contents: ");
        for (int i = 0; i < n; i++) {
            list[i] = in.nextInt();
        }
        for (int e: list) {
            System.out.print(e + " ");
        }
        System.out.println((isSorted(list))? "is sorted": "is not sorted");
        
    }
    
    /** input and output */
    public static void fill() {

    }

    private static boolean isSorted(int...x) {
        
        for (int i = 0; i < x.length - 1; i++) {
            if (x[i] > x[i+1] ) 
                return false;
            
            //if (x[i] < x[i+1])
                //return false;
        }
        return true;
    }
    
}
