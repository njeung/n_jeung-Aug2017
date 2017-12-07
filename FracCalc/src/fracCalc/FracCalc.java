
package fracCalc;
import java.util.*;
import java.util.Arrays;
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
		String [] expression = input.split(" ");
		String part1= expression[0];
		String operator= expression[1];
		String part2= expression[2];
		int[] part1Array=parseFraction(part1);
		int [] part2Array=parseFraction(part2);
		if(operator.equals("*")||operator.equals("/")) {
			if(part1.equals("0")||part2.equals("0")) {
				return "0";
			}
			if(part2.equals("-1")) {
				return (-1)*Integer.parseInt(part1)+"";
			}
			return multiplyDivide(part1Array, operator, part2Array);
		}else {
			return addSubtract(part1Array, operator, part2Array);
		}

	}

	public static int[] parseFraction(String input) {
		String whole1= "0";
		String numerator1="0";
		String denominator1="1";
		String [] wholeSplit1=input.split("_");
		String [] fractionparts=input.split("/");

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
		int [] inputArray=new int [3];
		inputArray[0]=Integer.parseInt(whole1);
		inputArray[1]=Integer.parseInt(numerator1);
		inputArray[2]=Integer.parseInt(denominator1);
		//toImproper
		return inputArray;
	}
	public static int[] toImproperFrac1(int[] operand) {
		int [] improperFrac= new int[2];
		int whole=operand[0];
		int numerator=operand[1];
		int denominator=operand[2];
		improperFrac[0]=absValue(whole)*absValue(denominator)+absValue(numerator);
		improperFrac[1]=absValue(denominator);
		if((numerator<0&&denominator>0)||(numerator>0&&denominator<0)||(whole<0&&numerator>0&&denominator>0)) {
			improperFrac[0]*=(-1);
		}else if(numerator==0&&whole==0) {
			improperFrac[0]=0;
			improperFrac[1]=1;
		}else if(whole==0&&numerator!=0) {
			if((numerator<0&&denominator>0)||(numerator>0&&denominator<0)) {
				improperFrac[0]=(-1)*(absValue(numerator));
				improperFrac[1]=absValue(denominator);
			}else {
				improperFrac[0]=numerator;
				improperFrac[1]=denominator;
			}

		}else {
			if(whole<0) {
				improperFrac[0]=(-1)*absValue(whole)*absValue(denominator)+absValue(numerator);
			}else {
				improperFrac[0]=absValue(whole)*absValue(denominator)+absValue(numerator);
			}
		}
		return improperFrac;



	}

	public static String multiplyDivide (int[] fraction1, String operator, int[] fraction2 ) {
		int [] improperFrac1=toImproperFrac1(fraction1);
		int [] improperFrac2=toImproperFrac1(fraction2);
		int[] answerArray = new int [2];
		if (operator.equals ("*")) {
			answerArray[0] =improperFrac1[0] * improperFrac2[0];
			answerArray[1]=improperFrac1[1] * improperFrac2[1];

		}else {
			answerArray[0]=improperFrac1[0]*improperFrac2[1];
			answerArray[1]=improperFrac1[1]*improperFrac2[0];
		}
		return simplifyFrac(answerArray);
	}	


	public static String addSubtract (int [] fraction1, String operator, int[] fraction2) {
		int [] improperFrac1 = toImproperFrac1(fraction1);
		int [] improperFrac2= toImproperFrac1(fraction2);
		int [] answerArray = new int [2];
		int denominator1=improperFrac1[1];
		int denominator2=improperFrac2[1];
		improperFrac1[0]*=denominator2;
		improperFrac1[1]*=denominator2;
		improperFrac2[0]*= denominator1;
		improperFrac2[1] *= denominator2;

		answerArray[1]= improperFrac1[1];
		if (operator.equals("+")) {
			answerArray[0]= improperFrac1[0]+ improperFrac2[0];

		}else {
			answerArray[0]= improperFrac1[0]- improperFrac2[0];
		}
		return simplifyFrac(answerArray);
	}




	public static int absValue (int number1) {
		if (number1<=0){
			return -number1;

		}else { 
			return number1;
		}
	}
	public static String simplifyFrac(int[]improperFrac) {
		int whole=0;
		int numerator=improperFrac[0];
		int denominator=improperFrac[1];
		int greatestFactor=gcf(absValue(numerator), absValue(denominator));
		numerator/=greatestFactor;
		denominator/=greatestFactor;
		if(numerator<0&&denominator<0) {
			numerator=absValue(numerator);
			denominator=absValue(denominator);
		}
		if(absValue(numerator)%absValue(denominator)==0) {
			return numerator+"";
		}else {
			if(absValue(numerator)>absValue(denominator)) {
				
				whole=numerator/denominator;
				numerator=absValue(numerator)-absValue(whole)*absValue(denominator);

				return whole+"_"+numerator+"/"+absValue(denominator);
			}else {
				if((numerator<0&&denominator>0)||(numerator>0&&denominator<0)) {
					return "-"+absValue(numerator)+"/"+absValue(denominator);
				}else {
					return numerator+"/"+absValue(denominator);
				}					
			}
		}
	}
	public static boolean isDivisibleBy (int dividend, int divisor) {
		if (dividend%divisor==0) {
			return true;
		}else {
			return false;
		}

	}
	public static int gcf(int number1, int number2) {
		int i;
		for(i = number2; !(isDivisibleBy(number2, i) && isDivisibleBy(number1, i)); i--) {}
		return i;
	}
}


	// ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This functi
	//on will be used to test your code
	// This function takes a String 'input' and produces the result
	//
	// input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
	//      e.g. input ==> "1/2 + 3/4"
	//        
	// The function should return the result of the fraction after it has been calculated
	//      e.g. return ==> "1_1/4"




	// TODO: Implement this function to produce the solution to the input




	// TODO: Fill in the space below with any helper methods that you think you will need



