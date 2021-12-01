/* display the ASCII character table 10: 10 per line*/
package asciitable;


public class ASCIITable {
    public static void main(String[] args) {
       int count = 0;
       for (int i = 33; i <= 126;i++) {
           count++;
           if (count % 10 == 0)
               System.out.printf("%11s\n", (char)i );
           else 
               System.out.printf("%11s", (char)i);
           
           
       }
        
    }
}
