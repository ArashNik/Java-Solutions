/*
(Financial application: find the sales amount) You have just started a sales job
in a department store. Your pay consists of a base salary and a commission. The
base salary is $5,000. The scheme shown below is used to determine the commission
rate.
			Sales Amount                   Commission Rate
			------------------------------------------------
			$0.01–$5,000                     8 percent
			$5,000.01–$10,000               10 percent
			$10,000.01 and above            12 percent
Note that this is a graduated rate. The rate for the first $5,000 is at 8%, the next
$5000 is at 10%, and the rest is at 12%. If the sales amount is 25,000, the commission
is 5,000 * 8% + 5,000 * 10% + 15,000 * 12% = 2,700.
Your goal is to earn $30,000 a year. Write a program that finds the minimum sales
you have to generate in order to make $30,000.
 */
package sales;

import java.util.Scanner;

public class Commision {

    public static void main(String[] args) {
        // create a constant value for commision sought
        Scanner in = new Scanner(System.in);
        double COMMISSION_GOAL = in.nextDouble();
        double sale, // SALE VALUE
                commission, // EMPLOYEE COMMISSION
                balance;            // SALES BALANCE
        sale = 0;
        for (commission = 0, sale = 0.0; commission < COMMISSION_GOAL; sale += 0.01) {
            // *break down the graduated rate for each sale

            balance = commission = 0;       // reset balance to commission = 0
//          sale += 0.01;                   // increment sales each iteration

            /**
             * if sales amount is $10,000.01 and above; rate is 12% *
             */
            if (sale > 10_000) {
                commission += (balance = sale - 10_000) * 0.12;
            }

            /* if sale is $5,000.01- $10,000; rate is 10% */
            if (sale > 5_000) {
                commission += (balance -= sale - 5_000) * 0.10;
            }

            /* if sales amount is $0.01-$5,000; rate is 8% */
            if (sale > 0) {
                commission += balance * 0.008;
            }

        }

        // Display results
        System.out.printf("Minimum sales to earn $30,000: $%.0f\n", sale);

    }
}
