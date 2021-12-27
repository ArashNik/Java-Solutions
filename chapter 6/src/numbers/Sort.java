/*
(Sort three numbers) Write a method with the following header to display three
numbers in increasing order:
public static void displaySortedNumbers(
double num1, double num2, double num3)
Write a test program that prompts the user to enter three numbers and invokes the
method to display them in increasing order.
*/
package numbers;

public class Sort {
    
    public static void main(String[] args) {
        
        sort(4, 3, 1);
    }
    private static void sort(int n1, int n2, int n3) {
        
        int temp;
        // sort the three parameters-ascending
        do {
            if (n2 > n3) {
                temp = n3; n3 = n2; n2 = temp;
            }
            if (n1 > n3) {
                temp = n3; n3 = n1;n1 = temp;
            }
            if (n1 > n2) {
                temp = n2;n2 = n1; n1 = temp;
            }

       } while (n1 > n2 && n2 > n3 && n3 > n1);      
    
        System.out.printf("%d %d %d\n", n1,n2, n3);
    }
}
