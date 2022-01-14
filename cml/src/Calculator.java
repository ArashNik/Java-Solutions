/** ************************************ 
  a calculator that performs operations 
  with arguments from the command line 
**************************************** */
public class Calculator {
	public static void main(String args[]) {
		if (args.length < 3 ) {
			System.out.print("Usage: Java calculator operand1 operand 2 operand3");
			Runtime.getRuntime().exit(1);
		}
		// The result of the operation '
		int result = 0;
		// determine the operator
		switch(args[1].charAt(0)) {
			case '+': result = Integer.parseInt(args[0]) +
							   Integer.parseInt(args[2]);
						break;
			case '-': result = Integer.parseInt(args[0]) -
							   Integer.parseInt(args[2]);
						break;
				// use the . symbol in cml not *
			case '.': result = Integer.parseInt(args[0]) *	
							   Integer.parseInt(args[2]);
						break;
			case '/': result = Integer.parseInt(args[0]) /
							   Integer.parseInt(args[2]);
						break;
		}
		// display the results
		System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + ' ' + "= " + result);
	}
}
		