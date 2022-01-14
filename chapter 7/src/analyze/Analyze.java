/*
 * intuitive selection sort algorithim & binary seach algorithim
 */
package analyze;

public class Analyze {
       public static void main(String[] args) {
        //driver
        int list[] = new int[8];
        for (int i = 0; i < list.length; i++ ) {
            list[i] =  (int)(1 + Math.random() * 10);     
        }

        System.out.println(java.util.Arrays.toString(list));
         
        long startTime = System.nanoTime();
        selectionSort(list);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        
        System.out.println(duration);
        System.out.println(java.util.Arrays.toString(list));
        
    }
    /** sorts the specified array into ascending numerical order
     * @param list */
    public static void selectionSort(int[] list ) {
        for (int i = 0; i < list.length - 1; i++) {
            // find the minimum in the list
            int currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < list.length;j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            // swap list currentMin and min index if needed
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
    
    /** will search an array that is already in order
     * @return the index if the search returns a match and a (-)negative value if no match was found */
    public static int binSearch (double[] list, int key ) {
        int low = 0;
        int high = list.length - 1;
        
        while (high >= low) {
            int mid = (low + high) / 2; // arimithic midpoint
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else 
                low = mid + 1;
        }
        return -low - 1; // now high < low, key not found
    }
    
    /** linear search will search a list in sequential order and return the value if found */
    public static int linearSearch(double[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) return i;
        }
        return -1;  // if not found
    }
    
}
