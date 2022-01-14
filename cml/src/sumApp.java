/** 
 *(sum integers)Program, that passes and unsepcified amount of integers from 
 *command and displays thier total.			
 */
class sumApp {
	static public void main(String[] arg) {
		int l = arg.length;	// length of elements
		int i, sum;
			sum  = 0;
		for (i = 0; i < l; i++) 
			sum += Integer.parseInt(arg[i]);; // sum the values
		System.out.printf("%d", sum);	
	}
}	