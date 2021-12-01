/******************************************************************************
   (Sum a series) Write a program to sum the following series:
    1 / 3 + 3 / 5 + 5 / 7 + 7 / 9 + 9 / 11 + 11 / 13 + ... + 95 / 97 + 97 / 99
 ******************************************************************************/
package precisionerrors;

public class SumASeries {
    public static void main(String[] args) {
        double sum = 0.0;
        for (double i = 99.0, x = 97.00; i >= 3; x -= 2, i -= 2) {
            sum += x / i;           
        }
        
        System.out.println(
			"Series: 1 / 3 + 3 / 5 + 5 / 7 + 7 / 9 + 9 / 11 + 11 / 13 + " + 
			" ... + 95 / 97 + 97 / 99");
		System.out.println("Sum of series: " + sum);
    }
} //45.124450303050196

/*  same result diffrent algorithim
        for (double n = 1.0; n <= 97.0; n += 2) {
			sum += n / (n + 2); 
*/
