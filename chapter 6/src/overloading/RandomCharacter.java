/*
 * Generate a random character based on character type
 */
package overloading;

public class RandomCharacter {
    /** generate a random character between ch1 and ch2 **/
    public static final char getRandomCharacters(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    } 
    
    /** generate a random lowercase letter
     * @return generates a lowercase letter between a and z  */
    public static final char getRandomLowerCaseLetter() {
        return getRandomCharacters('a', 'z');
        
    } 
    
    /** generate a random uppercase letter
     * @return generates a random uppercase letter between A and Z  */
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacters('A', 'Z');
    }
    
    /** generate a random digit character
     * @return  **/
    public static char getRandomDigit() {
        return getRandomCharacters('0', '9');
    }
    
    /** generate a random character
     * @return  **/
    public static char getRandomCharacter() {
        return getRandomCharacters('\u0000', '\uFFFF');
    }
}
