public class ArithmeticCalculatorApp {

/**
 * An arithmetic calculator using the switch statement for two numbers. Requires three arguments in the command line
 * Created 20-Apr-2018 by Silviu
 *   >java ArithmeticCalculatorApp 3 + 4
 */

		
	public static void main(String... args){


		try {
		double a = Double.parseDouble(args[0]);
		String operator = args[1];
		double b = Double.parseDouble(args[2]);
		double result;

				
		switch (operator) {
			case "+" : result = a + b;
				System.out.println("Result is: " + result);
						break;
			case "-" : result = a - b;
				System.out.println("Result is: " + result);
						break;
			case "*" : result = a * b;
				System.out.println("Result is: " + result);
						break;
			case "/" : result = a / b;
				System.out.println("Result is: " + result);
						break;
			case "%" : result = a % b;
				System.out.println("Result is: " + result);
						break;
			default: System.out.println("Invalid input!");
						break;
						
		}
	}

	  	 catch(NumberFormatException e) {
				//This catch block catches the exception
			System.out.println("Please insert numbers!");
			}
	
   }
}