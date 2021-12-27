/***************************************************************************
(Display matrix of 0s and 1s) Write a method that displays an n-by-n matrix using
the following header:
public static void printMatrix(int n)
Each element is 0 or 1, which is generated randomly. Write a test program that
prompts the user to enter n and displays an n-by-n matrix.
******************************************************************************/
package numbers;

public class Matrix {
    public static void main(String[] args) {
        // test program
         printMatrix(3);     
    }
    public static void printMatrix(int n) {
        String bits;
        int x;
        
        for (int i = 1; i <= n; i++) { 
            for (int j = 1; j <= n; j++) {
                x = (int)(Math.random() * 10); 
                bits  = (x & 1) + " ";
                System.out.print(bits + "  ");
            }
             System.out.println();   
        }

    }
}
