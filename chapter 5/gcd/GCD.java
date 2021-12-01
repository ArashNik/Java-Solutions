/* find the greatest common divisor(gcd) of two integers */
package gcd;

import java.util.Scanner;
public class GCD {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the first integer: ");
        int n1 = in.nextInt();
        System.out.println("Enter the second integer: ");
        int n2 = in.nextInt();
        
        int gcd = 1;    // intial gcd
        int k = 2;      // possible gcd
        while (k <= n1 && k <= n2) {
            if(n1 % k == 0 && n2 % k == 0)
                gcd = k;
            k++;
        }
        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
    }
    
}
