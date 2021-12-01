/******************************************************************************
 * (Compute e) You can approximate e using the following series:
		e = 1 + 1 / 1! + 1 / 2! + 1 / 3! + 1 / 4! + ... + 1 / i!
Write a program that displays the e value for i = 1, 2, …, and 20. 
     (Hint: Because i! = i * (i - 1) * c * 2 * 1, then
		1 / i! is 1 / (i(i - 1)!)
Initialize e and item to be 1 and keep adding a new item to e. The new item is
the previous item divided by i for i = 2, 3, 4, ....)
 ******************************************************************************/
package euler;

public class ComputeE {
    /* compute e for 3 */
    public static void main(String[] args) {
        double e = 1, item = 1;
        
        for (int i = 1; i <= 20; i++) {
            item = item / i
                    ;
            e += item;
            System.out.println("natual e: " );
            System.out.printf("%.16f\n", e);
        }
    }
}


//        double e = 0.0;
//        double i = 8.0; // i = factorial
//        for (double x = 8.0;  x >= 2; x--) {
//            i *=  (x - 1);
//       
//        }
//        e = i;
//        
//        System.out.printf("natual e is %1.16f: " ,e);
