
import java.util.*;
public class pickles {

	public static void main(String[] args) {
		boolean done= false;
	
	
	int evensum =0;
		

System.out.println ("input numbers, please");

Scanner scanner1 = new Scanner (System.in);
int x= scanner1.nextInt();

	int min =x;
			int max= x;
			int evenMax= 0;
			if (x%2==0) {
				evenMax= x;
				evensum+=x; 
			}
			int y;
			while (!done) {
				System.out.println("input more numbers, please");
				y= scanner1.nextInt();
				if (y<min) {
					min=y;
				}
				if (y>max) {
					max=y;
					
				}
if (y%2==0) {
	evensum += y;
	if (y>evenMax) {
		evenMax=y;
	}
}
System.out.println("Are you done? input true or false");
done = scanner1.nextBoolean();


	}
			System.out.println("min: " + min);
			System.out.println("max: " + max);
			System.out.println("max of even numbers: " + evenMax);
			System.out.println("sum of even numbers: " + evensum);
}
	}

