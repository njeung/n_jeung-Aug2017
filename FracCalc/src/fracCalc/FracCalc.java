
package fracCalc;
import java.util.*;
public class FracCalc {
	static boolean done=false;
	
    public static void main(String[] args) 
    {
    	while (!done) {  // TODO: Read the input from the user and call produceAnswer with an equation
    		System.out.println("What is your equation?");
    		Scanner scanner1= new Scanner(System.in);
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
    
    public static String produceAnswer(String input){ 
    
    	String whole1= "0";
    	String numerator1="0";
    	
    	String denominator1="1";
   
    	String [] expression = input.split(" ");

    	String [] wholeSplit1 = expression[0].split("_");

    	String [] wholeSplit2 = expression[2].split("_");
	   String [] fractionparts = wholeSplit2[1].split ("/");
    	if (input.contains("_")==true && input.contains("/")==true){
    	
    		whole1=wholeSplit1[0];
    		numerator1=wholeSplit1[1].split("/")[0];
    		denominator1=fractionparts[1];

 	}else if(input.contains("_")==false&&input.contains("/")==true) {
    		numerator1=fractionparts[0];
    		denominator1=fractionparts[1];
    	}else{
    	whole1=input;
    	}
return("whole:"+ wholeSplit2[0]+" numerator:"+ fractionparts[0]+ " denominator:"+fractionparts[1]);



    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    
    
    	
    	
        // TODO: Implement this function to produce the solution to the input
        
     
    

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
}
