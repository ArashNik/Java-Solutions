/***********************************************************************************
* (Count single digits) Write a program that generates 100 random integers between * 
* 0 and 9 and displays the count for each number. (Hint: Use an array of ten       *
* integers, say counts, to store the counts for the number of 0s, 1s, . . . , 9s.) *
************************************************************************************/
package numbers;

public class Counts {
        public static void main(String[] args) {
//        int nums[] = random();      // generate 1-- random integers
//        System.out.println(java.util.Arrays.toString(nums));
//        
//        int[] counts = countIntegers(nums); // count the integers
//        printArray(counts);
        counts();
    }
        
    /** an alternative design that is much more elegant */
    public static void counts() {
        int counts[] = new int[10];
        
        // count the occurrences of randomly generated integers
        for (int i = 1; i <= 100; i++) {
            counts[(int)(Math.random() * 10)]++;
        }
        // display results
        System.out.println();
        
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + " occured " + counts[i]+ 
                    ((counts[i] > 1)? " times": " time") );
        }
    }
    
    /** generate 1-- random integers between 0 and 9 */
    public static int[] random() {
        int[] r = new int[10];
        for (int i = 0; i < r.length; i++ )
            r[i] = (int)(Math.random() * 10);
        return r;  
    }
    
    /** count the occurrences of each integer */
    public static int[] countIntegers(int[] nums) {
        int[] counts = new int[10];
        
        // for each integer between 0-9, count it
        for (int i = 0; i < nums.length; i++) 
            counts[nums[i] - 0]++;
        return counts;
    }
    
    /** print the counts array */
    public static void printArray(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + " occurs " + counts[i]);
        }
    }
    
}
