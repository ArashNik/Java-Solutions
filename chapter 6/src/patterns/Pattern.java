/* ****************************************************************************
(Display Patterns) Write a method to display a pattern as follows :
                    1
                2   1 
            3   2   1
...
n n-1 ...   3   2   1
    innovative programming*
******************************************************************************/
package patterns;

public class Pattern {
    public static void main(String[] args) {
        displayPattern(12);
    }
    
    public static void displayPattern(int n) {
        int blankSpace = n - 1 ;
        
        for (int r = 1; r <= n; r++) {
            // print blankspace to the left-padding
            for (int y = 0; y < blankSpace; y++)
                  System.out.print("  ");
          
            // print numbers
            for (int i = r; i >= 1 ; i--)  
                System.out.print(i + " ");
            
            System.out.println(); 
            blankSpace--;   // reduce padding to the left
        }
    }
}
