
package fracCalc;
import java.util.*;
public class FracCalc {

    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	System.out.println("What is your equation?");
Scanner scanner1= new Scanner(System.in);
String input=scanner1.nextLine();


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
    String [] input2 = input.split(" ");
   String input3= input2[2];
    
    
    	
    	
    	return input3;
        // TODO: Implement this function to produce the solution to the input
        
     
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
