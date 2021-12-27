/***************************************************************************
(Mersenne prime) A prime number is called a Mersenne prime if it can be written
in the form 2^p - 1 for some positive integer p. Write a program that finds all
Mersenne primes with p <= 31 and displays the output as follows:
p             2^p –1
-----------------------
2             3
3             7
5             31
...
*****************************************************************************/
package mersenne;
import primenumbers.PrimeNumberMethod;

public class MersennePrime extends PrimeNumberMethod{
    public static void main(String[] args) {
        System.out.println("p               2^p-1");
        System.out.println("---------------------");
        for (int i = 2; i <= 31; i++) {
            if (isPrime(i))
                System.out.printf("%-13d    %d\n",i, MersennePrime(i));
        }
        
    }
    public static int MersennePrime(int num) {
            return (int) (Math.pow(2, num) - 1);
    }
}
