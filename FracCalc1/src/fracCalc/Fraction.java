package fracCalc;

public class Fraction {
	//encapsulates variables
	private int numerator;
	private int denominator;
	private int whole;
	private int sign;



	public Fraction(String input) {
		//splits fraction 
		String [] wholeSplit1=input.split("_");
		String [] fractionparts=input.split("/");
		whole=0;
		numerator=0;
		denominator=1;

		if  (input.contains("_")==true && input.contains("/")==true){

			//whole is put into whole #, etc
			whole =absValue(Integer.parseInt(wholeSplit1[0]));
			numerator = Integer.parseInt(wholeSplit1[1].split("/")[0]);
			denominator=  Integer.parseInt(fractionparts[1]);
		}else if (input.contains("_")==false&&input.contains("/")==true) {
			//integers
			numerator= Integer.parseInt(fractionparts[0]);
			denominator =Integer.parseInt(fractionparts[1]);
		}else{
			whole=absValue(Integer.parseInt(input));
			//determines negative or positive
			if (input.contains("-")) {
				sign=-1;
			}else{
				sign=1;
			}
		}
	}
	public static int absValue (int number1) {
		if (number1<=0){
			return -number1;

		}else { 
			return number1;
		}

	}
	public void toImproper() {
		// update whole to 0 and update numerator
		numerator=whole*denominator+numerator*sign;
		whole=0;

	}

	//gets numerator
	public int numerator1() {
		return numerator;
	}

	//sets numerator
	public void numerator2(int numerator) {
		this.numerator = numerator;
	}

	//gets denominator
	public int denominator1() {
		return denominator;
	}

	//sets denominator
	public void denominator2(int denominator) {
		this.denominator = denominator;
	}

	//gets whole
	public int whole1() {
		return whole;
	}

	//sets whole
	public void whole1(int whole) {
		this.whole = whole;
	}


	//reduce
	// to mixed number
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
	public String toString() {
		//creates the fraction string that is printed out by client code
		return "whole:"+ whole +" numerator:"+ numerator +" denominator:"+ denominator;
	}

	public static int gcf(int number1, int number2) {
		int i;
		for(i = number2; !(isDivisibleBy(number2, i) && isDivisibleBy(number1, i)); i--) {}
		return i;
	}

	public static boolean isDivisibleBy (int dividend, int divisor) {
		if (dividend%divisor==0) {
			return true;
		}else {
			return false;
		}

	}
}
