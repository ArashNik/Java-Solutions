/*****************************6.7 Prime Number Method *************************/
package primenumbers;

import java.util.Scanner;
public class PrimeNumberMethod {
    public static void main(String[] args) {
        System.out.println("The first 50 prime numbers are: ");
        printPrimeNumbers(100);
        
        //testing
        Scanner in = new Scanner(System.in);
        String hex = in.nextLine();

    }
    /** encapsulate the code for finding gcd: isolate computation **/
    public static boolean isPrime(int number) {
         for (int divisor = 2; divisor <= number / 2; divisor++) {
             if (number % divisor == 0)
                 /* number is not prime **/
                 return false;     
         }
         return true;       // number is prime
    }

    private static void printPrimeNumbers(int i) {
        int number = 2;     // the first prime number
        int count = 0;      // to count the first 50 primes
        // display 10 numbers per line
        final int NUM_PER_LINE = 10;
        
        while (count < i) {
            if (isPrime(number)) {
                count++;        // increase the count
                if (count % NUM_PER_LINE == 0)
                        System.out.printf("%-5d\n", number);
                else 
                    System.out.printf("%-5d", number);
            } number++;     // check next number 
        }
        
    }
}
