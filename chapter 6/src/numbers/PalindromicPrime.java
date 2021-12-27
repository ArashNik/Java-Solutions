/***************************************************************************
(Palindromic prime) A palindromic prime is a prime number and also palindromic.
For example, 131 is a prime and also a palindromic prime, as are 313 and
757. Write a program that displays the first 100 palindromic prime numbers. 
Display 10 numbers per line, separated by exactly one space, as follows:
2 3 5 7 11 101 131 151 181 191
313 353 373 383 727 757 787 797 919 929
...
******************************************************************************/
package numbers;

class PalindromicPrime {

   
    public static void main(String[] args) {
        final int TOTAL = 100;
        final int NUM_PER_LINE = 10;
        
        int count, i;
        count = i = 1;
        
        while (count < TOTAL) {
            if (isPalindromicPrime(i)) {
                count++;
                System.out.print((count % NUM_PER_LINE == 0)? i + "\n" : i + "  ");
            }
                i++;
        }

    }
    
    /* determines if argument is palindromic prime, that is, it is a palindrome 
    and a prime */
    public static boolean isPalindromicPrime(int n) {
        boolean isPrime, isPalindrome;
        isPrime = isPalindrome = true;
        int i, j, k;
        String reverse, number;
        reverse = number = "";
 
        
        // determine primeness
        for (j = 2; j <= n / 2; j++) {
            if (n % j == 0) {
                isPrime = false;
                return false;
            }      
        }
        
        if (isPrime) {
            number = n + "";
            // determine if palindrome
            for (k = number.length() - 1 ; k >= 0;k--) 
                reverse += number.charAt(k);
            if (!number.equals(reverse))
                 isPalindrome = false;
        }   
        return (isPalindrome && isPrime);
    }
}


