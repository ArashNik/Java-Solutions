/***************************************************************************** 
(Palindrome integer) Write the methods with the following headers
//return the reversal of an integer 
        public static int reverse(int number)
// return true if is a Palindrome
        public static boolean isPalindrome(int number)
Use the reverse method to implement isPalindrome. A number is a palindrome 
if its reversal is the same as itself.
******************************************************************************/
package numbers;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(10001));    
    }
    
    /** will return the reversal of an integer **/
    public static int reverse(int number) {
        String num = number + "";
        String reverse = "";
        
        for (int x = num.length() - 1; x >= 0; x--)
            reverse += num.charAt(x);       // reverse our string
        return Integer.parseInt(reverse);  
        
    }

    /** determines if a number is a palindrome: same read forward and backward
     * @param the integer
     * @return true if the given integer is a palindrome, false otherwise */
    public static boolean isPalindrome(int n) {
        // avoid redudant conditional statement
        return ((n == reverse(n)));
        
    }

    
    
}
