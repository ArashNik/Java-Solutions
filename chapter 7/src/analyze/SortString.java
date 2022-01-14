/*
 * Sort a string 
 */
package analyze;

public class SortString {
    public static void main(String[] args) {
        // driver program
        System.out.println(sort("bac"));   
    }
    
    /** returns a sorted string representation of the String argv
     * @param s String
     * @return String  */
    public static String sort(String s) {
        String str; 
        char[] da = s.toCharArray();
        char min; 
        int j,k; 
        
        // sort array using selection sort
        for (int i = 0; i < da.length; i++) {
            min = da[i];
            j = i; // min index
            // check char against list
            for (k = i + 1; k < da.length; k++) {
                if (min > da[k]) {
                    min = da[k];
                    j = k; // new index
                }
            }
            // swap values
            if (j != i) {
                da[j] = da[i];
                da[i] = min;
            }
        }
        /* diffrent approaches to produce a String */
        //return str = new String(da);
        //return str = String.valueOf(da);
        //Arrays.toString(da);
        return str = String.copyValueOf(da);
    }
}
