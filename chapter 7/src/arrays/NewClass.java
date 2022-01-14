/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author kayar
 */
public class NewClass {
    /** Main method */
        public static void main(String[] args) {
        int arr[] = {4, 3, 2 ,1, 0};
            System.out.println(java.util.Arrays.toString(arr));
            //reverse the array
            reverse(arr);
             System.out.println(java.util.Arrays.toString(arr));
        
        
        
       }
        public static int[] reverse(int[] arr) {
            for (int i = 0, j = arr.length - 1; i < 2 ; i++, j--) {                
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j] = temp;
                }
            return arr;
        }
      
}
