/******************************Exercise- 5.43 *******************************
(Math: combinations) Write a program that displays all possible combinations
for picking two numbers from integers 1 to 7. Also display the total number of
all combinations.
*****************************************************************************/
package numbers;

public class Combinations {
    public static void main(String[] args) {
        int total = 0;      // store the total number of combinations      
        
        for (int x = 1; x < 8; x++) {
            for (int y = x + 1; y < 8; y++) {
                System.out.println(x + "\t" + y);
                total++;        // COUNT ALL COMBINATIONS
            }
        }
        // Display total number of all combinations
        System.out.println("The total number of all combinations is " + total);
    }
    
}
