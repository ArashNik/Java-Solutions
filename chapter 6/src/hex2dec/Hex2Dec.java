package hex2dec;

import java.util.Scanner;

//Horners Algorithim
public class Hex2Dec {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);    

        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();
        
        System.out.println("The decimal value for the hex number " + hex + 
                " is " + hexToDecimal(hex.toUpperCase()));
        
    } 
    
    static int hexToDecimal(String hex) {
        int decimalValue = 0;
        
        for(int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue =  decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        
        return decimalValue;
    }
    
    static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F')
            return ch - 'A' + 10;
        else 
            return ch - '0';
    }
}
