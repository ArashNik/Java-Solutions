/*****************************************************************************
(Print distinct numbers) Write a program that reads in ten numbers and displays
the number of distinct numbers and the distinct numbers separated by exactly one
space (i.e., if a number appears multiple times, it is displayed only once). (Hint:
Read a number and store it to an array if it is new. If the number is already in the
array, ignore it.) After the input, the array contains the distinct numbers.
****************************************************************************** */
package numbers;

import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        final int SIZE = 10;
        int[] nums = new int[SIZE];       // to store all numbers
        int number;
        int count = 0;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            number = in.nextInt();
            if (distinct(nums, number)) {
                nums[i] = number;    // retain value if it is distinct   
                count++;
            }
        }
        System.out.println("The number of distinct numbers is " + count);
        System.out.println(java.util.Arrays.toString(nums));
        
    }
    public static boolean distinct(int[] list ,int key){
        for (int i = 0; i < list.length; i++) {
            if (list[i] == key)
                return false;       // return false if found
        }
        return true;
        
        
    }
}
