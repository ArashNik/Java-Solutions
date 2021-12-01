/*********************************************************************************
(Computer architecture: bit-level operations) A short value is stored in 16 bits.
Write a program that prompts the user to enter a short integer and displays the 16
bits for the integer. HINT:
                use the bitwise right shift operators(>>) and the bitwise AND
                        (&) operator.`

***********************************************************************************/
package architecture;

import java.util.Scanner;
public class BitlevelOp {
    public static void main(String[] args) {
        //short x = Short.MAX_VALUE;   32_758
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a short integer(1-32768): ");
        short x = in.nextShort();       // store the input
        
        String bits = " ";
        // get the 16 bits for the integer
        for (int i = 0; i < 16; i++) {
            bits = (x & 1) + bits;      // produce 0 or 1
            x >>= 1;    // right shift x
        }
        System.out.print("The bits are: "  + bits);
    }
}
