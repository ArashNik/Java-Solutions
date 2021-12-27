/***************************************************************************
 * (Math: Pentagonal Numbers) A pentagonal # is defined as n(3n-1)/2 for
 *  n = 1, 2, ..., so on. Therefore, the first few numbers are 1, 5, 12, 22,..
 *  Write a method with the following header that returns a pentagonal number:
 *          public static int getPentagonalNumber(int n)
 ****************************************************************************/
package numbers;

public class Pentagonal {
    public static void main(String[] args) {
        final int TOTAL_PENT = 100;         // first 100 pentagonal nums
        final int NUM_PER_LINE = 10;        // per line
        
        //  argument is n and value returned is pentagonal number
        
        for (int n = 1; n < TOTAL_PENT; n++) {
            if (n % NUM_PER_LINE == 0)
                System.out.printf("%6d\n", getPentagonalNumber(n));
            else 
                System.out.printf("%6d", getPentagonalNumber(n));
            
            
        }
    }
    
    public static int getPentagonalNumber(int n) { 
           return (n * (3*n-1) / 2);
    }
   
        
}
