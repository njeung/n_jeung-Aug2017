// Nicole Jeung
// September 5, 2017
// This will take in an integer and return its square
public class Calculate {
	public static int square(int number) {
		return number * number;
	}
	// Nicole Jeung
	//this will take in an integer and return its cube
	public static int cube(int number) {
		return number * number * number;
	}
	// Nicole Jeung
	//this will take in two doubles and find their averages
	public static double average(double number1, double number2)  {
		return (number1 + number2)/2;
	}
	// Nicole Jeung
		//this will take in three doubles and return its average
	public static double average(double number1, double number2, double number3) {
		return (number1 + number2 + number3)/3;
	}
	// Nicole Jeung
		//this will take in a double and return it in Radians 
	public static double toRadians(double number) {
		return (number * (3.14159/180));
	}
//Nicole Jeung
	//this will take in a double and return its its numbers in degrees
	public static double toDegrees(double number) {
		return (number * (180/3.14159));
	}
	// Nicole Jeung
		//this will return b squared minus 4(a)(c) in the quadratic formula
	public static double discriminant(double number1, double number2, double number3) {
		return ((number2*number2)-(4*number1*number3));
	}
	// Nicole Jeung
		//this will take in a mixed number and report its improper fraction
	public static String toImproperFrac(int number1, int number2, int number3) {
		return (((number1 * number3) + number2+"/"+number3));
	}
	public static String toMixedNum(int number1, int number2) {
		return number1/number2+"_"+ number1%number2+ "/"+ number2;
	}
	public static String foil(int number1, int number2, int number3, int number4, String variable) {
		return number1*number3+variable+"^2"+"+" + ((number1*number4)+(number2*number3))+variable+"+"+ (number2*number4);
	}
	//Part 2
	public static boolean isDivisibleBy (int dividend, int divisor) {
		if (dividend%divisor==0) {
			return true;
		}else {
			return false;
		}

	}
	public static double max (double number1, double number2) {
		if (number1>number2) {
			return number1;
		}else {
			return number2;
		}
	}
	public static double max (double number1, double number2, double number3) {
		if (number1>number2){
			// add an if?
				return number1;
			}else {
				if (number2>number3) {
					return number2;
				}else {
					return number3;
				}
				}
			}
		
		public static int min (int number1, int number2) {
			if (number1>number2) {
				return number2;
			}else return number1;
		}
		public static double absValue (double number1) {
			if (number1<=0){
					return -number1;
				
		}else return number1;
		}
		public static double round2(double input) {
			if(input * 1000 % 10 < 5) {
				return ((input * 1000) - (input * 1000 % 10))/1000;
			} else {
				return ((input * 1000) + (10 - (input * 1000 % 10)))/1000;
			}
		}
		 //Part 3
		public static double exponent (double number1, int number2) {
			if (number2 < 0) {
		
			}
			double result = 1;
			for (int i=0; i < number2; i++) {
				result *= number1;
				
			}
			return result;
			
			}
		public static int factorial (int number1) {
			int result = number1;
			for (int i=1; i< number1; i++) {
				result *= number1-1;
			}
			return result;
		}
		public static boolean isPrime(int input) {
			if(input < 2) {
				return false;
			} else if(input == 2) {
				return true;
			} else {
				for(int i = 2; i < input; i++) {
					if(isDivisibleBy(input, i)) {
						return false;
					}
				}
				return true;
			}
		}
		public static int gcf(int number1, int number2) {
			int i;
			for(i = number2; !(isDivisibleBy(number2, i) && isDivisibleBy(number1, i)); i--) {}
			return i;
		}
		public static double sqrt(double input) {
			if(input < 0) {
				throw new IllegalArgumentException();
			}
			double value = input/2;
			double result = 0;
			if(input != 0) {
				while(result != (input/value + value)/2) {
					result = (input/value + value)/2;
					value = result;
				}
			}
			return round2(result);
		}
// Part 4
		//This will take in 3 ints and return the roots of the numbers
		public static String quadForm(int number1, int number2, int number3) {
			String answer= "";
					double w;
					double x;
			double y;
			double z;
			if (Calculate.discriminant(number1, number2, number3)==0) {
				
	w = (-number2 + sqrt(discriminant(number1, number2, number3)))/(2 * number1);
	y= Calculate.round2(w);
	answer= String.valueOf(y);
			}else if(Calculate.discriminant(number1, number2, number3)<0) {
				
				answer= "no real roots";
	
				
			}else if (Calculate.discriminant(number1, number2, number3)>0) {
				x = ((-number2-Calculate.sqrt(Calculate.discriminant(number1, number2, number3)))/(2*number1));
				z = Calculate.round2(x);
				w = ((-number2+Calculate.sqrt(Calculate.discriminant(number1, number2, number3)))/(2*number1));
				y = Calculate.round2(w);
				if (y>z) {
					answer = String.valueOf(y) + "and"+ String.valueOf(z);
				}else { 
						answer= String.valueOf(z)+ "and"+ String.valueOf(y);
				}
			}
			return answer;
		}
}
				
				






//Nicole Jeung
//September 28, 2017
		
	
