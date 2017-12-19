package fracCalc;
import java.util.*;
import java.util.Arrays;
public class FracCalc {
	static boolean done=false;

	public static void main(String[] args){ 
		Scanner scanner1= new Scanner(System.in);
		while (!done) {  // TODO: Read the input from the user and call produceAnswer with an equation
			System.out.println("What is your equation?");

			String input1=scanner1.nextLine();
			String result =produceAnswer(input1);
			System.out.println(result);

			System.out.println("Do you want to keep going? (Type \"quit\" to end)");
			String complete=scanner1.next();
			if (complete.equals("quit")) {
				done = true;

			}
		}
		}

		// ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
		// This function takes a String 'input' and produces the result
		//
		// input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
		//      e.g. input ==> "1/2 + 3/4"
		//        
		// The function should return the result of the fraction after it has been calculated
		//      e.g. return ==> "1_1/4"
		public static String produceAnswer(String input){ 
			String [] expression = input.split(" ");
			Fraction fraction1 = new Fraction (expression[0]);
			Fraction fraction2 = new Fraction(expression[0]);
			return fraction2.toString();
		}

		// TODO: Fill in the space below with any helper methods that you think you will need

	}
