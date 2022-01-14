/**(Math: combinations)Display the combo of picking two numbers from 10 integers */
public class Combo {
	public static void main(String[] args) {
		//if (args.length != 10)
			//System.out.print("You must enter 10 digits");
		int i, j, length;
		length = args.length;
		
		for (i = 0; i < length; i++) {
			for (j = 0; j < length;j++) {
				if (args[i]== args[j])
					continue;
				else
					System.out.println(args[i]+args[j]);
			}	
    	}		
	}
}