/*
(Summation) Write a program to compute the following summation.
1 / (1 + √2) + 1 / (√2 + √3) + 1 / (√3 + √4) + ... +  1 / (√624 + √625)
*/
package precisionerrors;

public class Summation {
    public static void main(String[] args) {
        double sum = 0;
        
        for (int x = 1, y = 2; x <= 624 && y <= 625; x++ ,y++ ){
            sum += 1 / (Math.sqrt(x) + Math.sqrt(y));
        } 
        System.out.println(sum);
        
        
        double summation = 0.0;
		for (double i = 1.0; i <= 624.0; i++) {
			summation += 1 / (Math.sqrt(i) + Math.sqrt(i + 1));
		}
		System.out.println("Summation: " + summation);
    }
    
}
