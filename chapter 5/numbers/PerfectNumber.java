/******************************************************************************
(Perfect number) A positive integer is called a perfect number if it is equal to
the sum of all of its positive divisors, excluding itself. For example, 6 is the first
perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2
+ 1. There are four perfect numbers less than 10,000. Write a program to find all
these four numbers.
 *******************************************************************************/
package numbers;


public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("The four perfect numbers less than 10000 are: ");
        
        int sum;    // store the sum of the positive divisors
        for (int i = 6; i < 10000; i++) {
            
            sum = 0;    // reset accumalator to 0;
            
            for (int k = 1; k < i; k++) {
                    // test for divisor
                    if (i % k == 0)
                        sum += k;  
            }
            // test if the sum of all the positive divisors is equal to nuumber
            if (i == sum) 
                    System.out.printf("%10d\n", i);  
        }
        
        
    
 
    }
 
}
