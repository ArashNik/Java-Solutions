/***************************************************************************
(Sum series) Write a method to compute the following series:
	m(i) = 1 / 2 + 2 / 3 + ... + i / (i + 1)
Write a test program that displays the following table:
i       m(i)
--------------
1        0.5000
2        1.1667
...
19       16.4023
20       17.3546
*****************************************************************************/
package numbers;

public class SumASeries {
    public static void main(String[] args) {
        // display a table of the data between 1 and i
        sumASeries(20);    
    }

    private static void sumASeries(int i) {
        double sum = 0;
        System.out.println("i               m(i)");
        for (int j = 1;j <= i;j++) {
             sum += j / (j + 1.0);      // sum series to i / (i+1)
             
             // display table i         m(i)
             System.out.printf("%d%20.4f\n", j, sum);
        }
    } 
}

