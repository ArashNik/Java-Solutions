/********************************6-33**********************************
(current date and time) Invoking System.currentTimeMillis() returns the elapsed
 time since in milliseconds since midnight of Jan 1, 1970(epoch).Write a program 
 that displays the date and time.
*****************************************************************************/
package practice;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Milliseconds {
    public static void main(String[] args) {
        
        getDate();
        getTime();

        
    }
    /** displays the current time in GMT(Greenwich Mean Time) in format: h:m:s */
    public static void getManuelTime() {
        
        // returns the total milliseconds since Jan 1, 1970
        long totalMillis = System.currentTimeMillis();
        
        // obtain total seconds 
        long totalSeconds = totalMillis / 1000;
        
        // compute current second 
        long currentSeconds = totalSeconds % 60;
        
        // obtain the total minutes
        long totalMins = totalSeconds / 60;
        
        // compute the current minute
        long currentMin = totalMins % 60;
        
        // obtain the total hours
        long totalHours = totalMins / 60;
        
        // compute the current hour
        long currentHour = totalHours % 24;
        
        // obtain hour in EST(Eastern Standard Time)
        long est = currentHour + 19;
        
        // display the result
        System.out.println(est + ":" + currentMin + ":" 
                + currentSeconds + " GMT");
         
    }

    /** retrieves the current date */ 
    private static void getDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE;
        LocalDate localDate = LocalDate.now();
        System.out.println(dtf.format(localDate));
    }

    private static void getTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_TIME;
        LocalTime localTime = LocalTime.now();
        System.out.println(dtf.format(localTime));
        
    }

   
        
}
