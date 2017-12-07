
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(5));
		System.out.println(Calculate.cube(5));
		System.out.println(Calculate.average(2,4));
		System.out.println(Calculate.average(3,7,21));
		System.out.println(Calculate.toRadians(82));
		System.out.println(Calculate.toDegrees(12));
		System.out.println(Calculate.discriminant(4,3,5));
		System.out.println(Calculate.toImproperFrac(3,1,2));
		System.out.println(Calculate.toMixedNum(7, 2));
		System.out.println(Calculate.foil(2, 3, 6, -7, "n"));
		System.out.println(Calculate.isDivisibleBy(10,5));
		System.out.println(Calculate.max(8, 19));
		System.out.println(Calculate.max(4,2,9));
		System.out.println(Calculate.min(2, 6));
		System.out.println(Calculate.absValue(-8));
		System.out.println(Calculate.round2(2.44));
		System.out.println(Calculate.exponent(2.5, 3));
		System.out.println(Calculate.factorial(5));
		System.out.println(Calculate.quadForm(1, 7, 2.5));
	}

}
