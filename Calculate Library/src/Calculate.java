// Nicole Jeung
// September 5, 2017
// This will take in an integer and return its square
public class Calculate {
	public static int square(int number) {
		return number * number;
	}
	public static int cube(int number) {
		return number * number * number;
	}
	public static double average(double number1, double number2)  {
		return (number1 + number2)/2;
	}
	public static double average2(double number1, double number2, double number3) {
		return (number1 + number2 + number3)/3;
}
	public static double toRadians(double number) {
		return (number * (3.14159/180));
	}
	public static double toDegrees(double number) {
		return (number * (180/3.14159));
	}
	public static double discriminant(double number1, double number2, double number3) {
	return ((number1*number1)-(4*number2*number3));
	}
	public static String toImproperFrac(int number1, int number2, int number3) {
		return (((number1 * number3) + number2+"/"+number3));
	}
	public static String toMixedNum(int number1, int number2) {
		return number1/number2+"_"+ number1%number2+ "/"+ number2;
	}
	public static String foil(int number1, int number2, int number3, int number4, String variable) {
		return number1*number3+variable+"^2"+"+" + ((number1*number4)+(number2*number3))+variable+"+"+ (number2*number4);
	}
}



