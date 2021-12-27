/***************************** Exercise 6.16 *******************************
 write a method that returns the number of days in  a year. The test program 
 should display the number of days from 2010 to 2020
****************************************************************************/
package practice;

import java.util.GregorianCalendar;
public class Days {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2013; i < 2022; i++){
            sum += numberOfDaysInAYear(i);
        }
        System.out.println("There are " + sum + " days, from 2010 to 2020");
    }
    
    /** determines the total number of days in a year 
     * @param year 
     * @return */
    public static int numberOfDaysInAYear(int year) {
 
        GregorianCalendar cal = (GregorianCalendar)GregorianCalendar.getInstance();
        // check if the year is a leap year
        boolean isLeapYear = cal.isLeapYear(year);
        if (isLeapYear)
            return 366;
        else 
            return 365;
    }
}
