/******************************************************************************
(Math: approximate the square root) There are several techniques for implementing
the sqrt method in the Math class. One such technique is known as the
Babylonian method. It approximates the square root of a number, n, by repeatedly
performing a calculation using the following formula:
nextGuess = (lastGuess + n / lastGuess) / 2
When nextGuess and lastGuess are almost identical, nextGuess is the
approximated square root. The initial guess can be any positive value (e.g., 1).
This value will be the starting value for lastGuess. If the difference between
nextGuess and lastGuess is less than a very small number, such as 0.0001,
you can claim that nextGuess is the approximated square root of n. If not, next-
Guess becomes lastGuess and the approximation process continues. Implement
the following method that returns the square root of n.
public static double sqrt(long n)
*******************************************************************************/
package squarerootapprox;

public class ApproxSqrRoot {
    
    public static void main(String[] args) {
        long n = 128;
             
        System.out.println("The approximated square root of " + n + " is "
                + sqrt(n) );   
    }
    
    /** approximates the sqaure root of n  */
    public static double sqrt(long n) { 
        final double EPSILON = 1E-14;       // EPSILON(a very small number)
        double sqrt = 0;
        long lastGuess, nextGuess, intialGuess;
        lastGuess = intialGuess = 1;
       
        // Babylonian Method
        nextGuess = (lastGuess + n / lastGuess) / 2;    
        
        while (Math.abs(nextGuess - lastGuess) > EPSILON) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;
        }
            return sqrt = nextGuess;
                              
    }
    
    
    
    
    
}
