/*****************************************************************************
(Financial application: compute commissions) Write a method that computes the
commission, using the scheme in Programming Exercise 5.39. 
                        sales Amount                   Commission Rate
			------------------------------------------------
			$0.01–$5,000                     8 percent
			$5,000.01–$10,000               10 percent
			$10,000.01 and above            12 percent

The header of the method is as follows:
    public static double computeCommission(double salesAmount)
Write a test program that displays the following table:
               Sales Amount        Commission
               --------------------------------
               10000                 900.0
               15000                1500.0
               ...
               95000               11100.0
               100000              11700.0
*****************************************************************************/
package financialapps;

public class Commission {
    
    public static void main(String[] args) {
        System.out.printf("$%.1f ",computeCommission(15_000));
    }
    
    /** determines the sales amount
     * @param salesAmount
     * @return commission for sales amount */
    public static double computeCommission(double salesAmount) {
        
        double commission = 0.0;        // comm rate
        double sale = 0.0;      // sale to tax for comm
        
            // If sales amount is $10.000.01 and above commission rate is 12%
            if (salesAmount >= 10_000.01) 
               commission += (sale = salesAmount - 10000) * .12;
            // If sales amount is $5.000.01-$10_000 commission rate is .10%
            if (salesAmount >= 5_000.01)
                commission += (sale -= sale - 5000) * .10;
            if (salesAmount >= .01)
                commission += sale  * .08;   

        return commission; 
    }
   
}
