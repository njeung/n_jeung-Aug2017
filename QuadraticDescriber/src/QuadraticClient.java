// Nicole Jeung 

// October 16, 2017
import java.util.*;
public class QuadraticClient {

	public static void main(String[] args) {
		boolean done=false;
		
		while (!done) {
			System.out.println("Welcome to Quadratic Describer!");
			System.out.println("Provide values for coefficents a, b, and c");
			System.out.println( );
			Scanner console= new Scanner(System.in);
			System.out.print("a:");
			double a = console.nextDouble();
			System.out.print("b:");
			double b = console.nextDouble();
			System.out.print("c:");
			double c = console.nextDouble();
			System.out.println( );

			System.out.println(Quadratic.quadrDescriber(a, b, c));
			System.out.println("");
			System.out.println("Do you want to keep going? (Type \"quit\" to end)");
			String complete=console.next();
			if (complete.equals("quit")) {
				done = true;
			}
		}
	
	}

}
