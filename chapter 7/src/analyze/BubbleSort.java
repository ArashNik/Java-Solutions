/*
* (Bubble sort) Write a sort method that uses the bubble-sort algorithm. The     
* bubblesort algorithm makes several passes through the array. On each pass,     
* successive neighboring pairs are compared. If a pair is not in order, its      
* values are swapped; otherwise, the values remain unchanged. The technique is   
* called a bubble sort or sinking sort because the smaller values gradually      
* “bubble” their way to the top and the larger values “sink” to the bottom.      
* Write a test program that reads in ten double numbers, invokes the method,     
* and displays the sorted numbers.                                               
 */
package analyze;

import java.util.Scanner;
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        //driver program: execution time
        int[] a = {8, 6, 2, 2, 1, 10, 4, 3, 9, 5};
        int[] t = {3, 1, 6, 5, 8, 9, 10};
        //int[] z = bSort(new int[]{4, 7, 2, 10, 6, 11, 8, 2, 9, 1});
        //System.out.println(Arrays.toString(z));
        bubbleSort(t);
        System.out.println(Arrays.toString(t));

    } 
    
    /** implementation note: sorts the specified array using the 
        bubble sort algorithm.*/
	public static void bubbleSort(int...n) {
            boolean swapped = true;
            int i, temp;
            do {
                swapped = false;            
                for (i = 0;  i < n.length - 1; i++) {
                    if (n[i] > n[i+1]) {
                        //swap
                        swap(i, n);
                        swapped = true;     // If values were swapped
                    }
                }
                
            } while (swapped);
	}
        
    /** implementation two note: sorts the specified array using the 
          bubble sort algorithm.*/
    public static int[] bSort(int...z) {
        final int SIZE = z.length;
        int i, j;
            i = 0;      //intialize
            while (i < SIZE ) {
                for (j = 0; j < SIZE - 1; ++j) {
                    if (z[j] > z[j+1])
                        swap(j, z);
                }
                ++i;    // increment i;
            }
        return z;
    }
    /** swap values */
    public static void swap(int i, int...z) {
        int temp;
        temp = z[i];
        z[i] = z[i+1];
        z[i+1] = temp;
    }
    
 }  // end class

