/*****************************************************************************
(Display current date and time) Listing 2.7, ShowCurrentTime.java, displays the
current time. Improve this example to display the current date and time. The 
calendar example in Listing 6.12, PrintCalendar.java, should give you some ideas
on how to find the year, month, and day.
*******************************************************************************/
package practice;
import java.util.GregorianCalendar;

public class CurrentTime {
    public static void main(String[] args) {
        showCurrentTime();
    }
    public static void showCurrentTime() {
        GregorianCalendar cal = 
                (GregorianCalendar)GregorianCalendar.getInstance();
        System.out.println(cal.getTime());
       
    }
}
