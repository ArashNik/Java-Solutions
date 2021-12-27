/*************************************************************************
(Check password) Some web sites impose certain rules for passwords. Write a
method that checks whether a string is a valid password. Suppose the password
rules are as follows:
■ A password must have at least eight characters.
■ A password consists of only letters and digits.
■ A password must contain at least two digits.
Write a program that prompts the user to enter a password and displays Valid
Password if the rules are followed or Invalid Password otherwise.
*****************************************************************************/
package numbers;

public class CheckPassword {

    private static int count;
    public static void main(String[] args) {
        
        System.out.println(validPassword("fake21"));    
        
    }
    /** determines if the password is valid according to rules 
     * @param String password
     * @return boolean
     */
    protected static boolean validPassword(String args) {
        // check length of password
        if (args.length() < 8 )
            return false;
        // check if password is alphanumeric
        for (int i = 0; i < args.length();i++) {
            if (!Character.isLetterOrDigit(args.charAt(i)))
                return false;
            if (Character.isDigit(args.charAt(i)))
                count++;
        }
        // check if password contains at least two digits
        if (count < 2)
            return false;
        return true;    // if all conditions pass
    }
    
}
