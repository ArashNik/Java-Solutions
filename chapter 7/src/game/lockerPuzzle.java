/**
* (Game: locker puzzle) A school has 100 lockers and 100 students. All lockers   
* are closed on the first day of school. As the students enter, the first        
* student, denoted S1, opens every locker. Then the second student, S2,          
* begins with the second locker, denoted L2, and closes every other locker.      
* Student S3 begins with the third locker and changes every third locker (closes 
* it if it was open, and opens it if it was closed). Student S4 begins with      
* locker L4 and changes every fourth locker. Student S5 starts with L5 and       
* changes every fifth locker, and so on, until student S100 changes L100.        
*                                                                                
* After all the students have passed through the building and changed the        
* lockers, which lockers are open? Write a program to find your answer and       
* display all open locker numbers separated by exactly one space.                
* (Hint: Use an array of 100 Boolean elements, each of which indicates whether a 
* locker is open (true) or closed (false).Initially, all lockers are closed.)    
*/
package game;

public class lockerPuzzle {
    public static void main(String[] args) {
        boolean[] l = new boolean[100];
        final int LOCKER = l.length;   // length of locker array or students
        int i,j;
                
        // play game(change locker status)
        for (i = 0; i < LOCKER; i++) {
            for (j = i ; j < LOCKER; j += (i + 1))
                l[j] = !l[j]; // change status
        }
        printCount(l, LOCKER);

    }
    
    /** prints the number of lockers that are open */
    public static void printCount(boolean[] l, int length) {
        int count = 0;
        //count open lockers and print to console
        for (int i = 0; i < length; i++) {
            if (l[i])
                count++;
        }
        System.out.println(count + " are open.");
    } 
}
