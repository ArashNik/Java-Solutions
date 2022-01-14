/** Listing 5.15 determines whether a number n is prime by checking
    whether 2,3,4,5,6,...n/2 is a divisor. If a divisor is found, n 
    is not prime. A more efficient approach is to check whether any 
    of the prime numbers less than or equal to <Math.sqrt(n)> can divide
    n evenly. If not, n is prime.*/
package numbers;

public class Prime {
    
    public static void main(String[] args) {
        int[] primes = primes();
        System.out.println(java.util.Arrays.toString(primes));
        // driver
        int n = 105;      // digit to check for primeness
        System.out.println(n + (isPrime(primes, n) ? " is prime": " is not prime"));
        
    }
    /** generate the first 100 prime numbers */
    public static int[] primes() {
        int[] primes = new int[100];        // to store primes
        int number = 2;     // first number to check primeness
        
        for (int k = 0; k < primes.length;) {
            boolean isPrime = true;
            // test whether the number is prime
            for (int j = 2; j <= number / 2; j++) {
                if (number % j == 0) {
                    isPrime = false;
                    break;  // exit the for loop
                }
            }
            if (isPrime)  {
                primes[k] = number;
                k++;        // step the array index
            }
            number++;   // step the number
            
        }
        return primes;
    }
    
    /** use efficient algorithm to determine primeness */
    public static boolean isPrime(int[] prime, int n) {
        double boundary = Math.sqrt(n);
        for (int i = 0; i < prime.length && prime[i] <= boundary; i++) {
            if (n % prime[i] == 0)
                return false;
        }
        return true;
    }
}
