/* prompt user to enter integer from 1-15 and display a pyramid */
package pyramid;

import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number of lines");
        int number = in.nextInt();
        
        /* display pyramid */
        for (int rows = 1; rows <= number; rows++) {
            // create spaces in each row
            for (int j = number - rows; j >= 1; j--) {
                System.out.print("  ");
            } 
            // create decending numbers in each row
            for (int i = rows; i >= 2; i--) {
                System.out.print(i + " ");
            }
            // create ascending number in each row
            for (int r = 1; r <= rows; r++) {
                System.out.print(r + " ");
            }
            // end line
            System.out.println();
            
        }
        
    }
}
