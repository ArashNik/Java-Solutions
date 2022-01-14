/*********************************************************************************
* (Sort students) Write a program that prompts the user to enter the number of  *
* students, the students’ names, and their scores, and prints student names in  *
* decreasing order of their scores.                                             *
*********************************************************************************/
package arrays;

import java.util.*;
public class PrintScores {
    
    public static void main(String[] args) {
        int n, i;      // students body size
        // prompt user input        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        n = in.nextInt();
        
        String[] names = new String[n];     // to store names
        double[] score = new double[n];     // to store scores 
        
        for (i = 0; n > 0; i++, n--) {
            System.out.println("Enter the student name:");
            names[i] = in.next();
            System.out.println("Enter the student score:");
            score[i] = in.nextDouble();
        }
        // sort list(names) in decreasing order
        PrintScores.sortPrint(names, score);
        System.out.println(java.util.Arrays.toString(names));
        System.out.println(java.util.Arrays.toString(score));
       
    }
    /** Will sort the names list in decreasing order based on the score
     * @param n
     * @param s */
    public static void sortPrint(String[] n, double[] s) {
        int i, j, k;
        double min; String temp = " ";
        // selection sort algor
        for (i = s.length - 1 ; i > 0; i--) {
            // find the minumum in the list
            min = s[i];     // min value
            j = i;      // current min index
            for (k = i - 1; k >= 0; k--) {
                if (min > s[k]) {
                    min = s[k];     // reassign min
                    j = k;      // reasign min index j
                    temp = n[k];
                }
            }
            // swap the min value and and min index(j) 
            if (j != i) {
                s[j] = s[i];
                s[i] = min;
                // duplicate for n(names list)
                n[j] = n[i];
                n[i] = temp;
                
            }
        }
    }
}
