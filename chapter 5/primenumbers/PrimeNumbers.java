
package primenumbers;

public class PrimeNumbers {
    public static void main(String[] ments) {
        final int NUMBER_OF_PRIMES = 50;    // primes to display
        final int NUMBER_OF_PRIMES_PL = 10; // per line
        int count = 0;                      // count the number of prime numbers
        int number = 2;                     // a number to test for primeness
        
        System.out.println("The first 50 prime numbers are \n");
        
        /* repeatedly find prime numbers */
        while (count < NUMBER_OF_PRIMES) {
            boolean isPrime = true;
            /* test for primeness */ 
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break; // exit the loop
                }
                
            }
            /* display the prime number */
            if (isPrime) {
                count++;
                if (count % NUMBER_OF_PRIMES_PL == 0)
                    System.out.println(number);
                else 
                    System.out.println(number + " ");
            }
            /* check if next number is prime */
            number++;
        }
    }
}
