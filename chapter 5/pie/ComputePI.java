/*
(Compute p) You can approximate p by using the following series:
PI = 4(1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + ... + ((-1)i + 1 /  2i - 1))
Write a program that displays the PI value for i = 10000, 20000, …, and
100000.
*/
package pie;

public class ComputePI {
    public static void main(String[] args) {
        /* compute PI for i = 10,000 */
        double sum = 0;
        double value = 10000.0;
        for (double d = 1; d <= (2 * value - 1); d += 2) {
            sum += 1 / d;
            d += 2;
            sum -= 1 / d;
        }
        double PI = 4 * sum;
        System.out.println("PI approximation for 10,000: "+ PI);
        
        /* compute PI for i = 20,000 */
        sum = 0;
        value = 20000.0;
        for (double d = 1; d <= (2 * value - 1); d += 2) {
            sum += 1 / d;
            d += 2;
            sum -= 1 / d;
        }
        PI = 4 * sum;
        System.out.println("PI approximation for 20,000: "+ PI);
        
        /* compute PI for i = 30,000 */
        sum = 0;
        value = 30000.0;
        for (double d = 1; d <= (2 * value - 1); d += 2) {
            sum += 1 / d;
            d += 2;
            sum -= 1 / d;
        }
        PI = 4 * sum;
        System.out.println("PI approximation for 30,000: "+ PI);
        
    }
}
