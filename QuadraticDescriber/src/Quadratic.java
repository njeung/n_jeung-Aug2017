//Nicole Jeung
	//October 16, 2017
public class Quadratic {
	
	public static String quadrDescriber (double a, double b, double c) {
	if (a==0){ 
	throw new IllegalArgumentException("not a quadratic");
	}
	String output = "";
	output += "Description of the graph of: \n";
	output +=  "y =" +a+ "x^2+" +b+ "x+" +c + "\n\n";
	output += Quadratic.direction (a);
	output += "\n";
	output += Quadratic.aos(a, b);
	output += "\n";
	output += Quadratic.vertex (a, b, c);
	
	output += "\n";
	output += Quadratic.xint(a, b, c);
	
	output += "\ny-intercept:" +c;
	return output;
	}
	// min from Calc library (but use doubles)
	public static double min (double number1, double number2) {
		if (number1>number2) {
			return number2;
		}else return number1;
	}
	public static double absValue (double number1) {
		if (number1<=0){
				return -number1;
			
	}else return number1;
	}
	// max from Calc library (doubles)
	public static double max (double number1, double number2) {
		if (number1>number2) {
			return number1;
		}else {
			return number2;
		}
	}
	//discriminant
	public static double discriminant(double number1, double number2, double number3) {
		return ((number2*number2)-(4*number1*number3));
	}
	//round2
	public static double round2(double input) {
		if(input * 1000 % 10 < 5) {
			return ((input * 1000) - (input * 1000 % 10))/1000;
		} else {
			return ((input * 1000) + (10 - (input * 1000 % 10)))/1000;
		}
	}
	//squareroot (sqrt)
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
	//QuadForm
	public static String quadForm(double number1, double number2, double number3) {
		String answer= "";
				double w;
				double x;
		double y;
		double z;
		if (discriminant(number1, number2, number3)==0) {
			
w = (-number2 + sqrt(discriminant(number1, number2, number3)))/(2 * number1);
y= round2(w);
answer= String.valueOf(y);
		}else if(discriminant(number1, number2, number3)<0) {
			
			answer= "no real roots";

			
		}else if (discriminant(number1, number2, number3)>0) {
			x = ((-number2-sqrt(discriminant(number1, number2, number3)))/(2*number1));
			z = round2(x);
			w = ((-number2+sqrt(discriminant(number1, number2, number3)))/(2*number1));
			y = round2(w);
			if (y>z) {
				answer = String.valueOf(y) + " and "+ String.valueOf(z);
			}else { 
					answer= String.valueOf(z)+ " and "+ String.valueOf(y);
			}
		}
		return answer;
	}



			
	//Aos

	public static String aos (double a, double b){
	return "Axis of Symmetry: "+round2((-b)/(2*a));
	}
	//vertex
	public static String vertex (double a, double b, double c) {
	double x;
	double y;
	x= round2((-b)/(2*a));
	y=round2(a *x*x+b*x+c);
	return "Vertex: ("+x+"," + y+")";
	}
	//x-int
	public static String xint (double a, double b, double c){
	String QuadForm= quadForm(a, b, c);
	return "x-intercepts are: " + QuadForm;
	}


		

//this will tell whether the quadratic opens up or down
public static String direction (double a){
	if(a>0) {
		return "Opens: Up";
	} else if (a<0) {
			return "Opens: Down";
	}else {
				return "Linear";
			}
}
			
		
	}
	
