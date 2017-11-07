
import java.util.Arrays;
public class Arrayminilab {
public static void main (String [] args) {
	int num=7;
	String strMain="APCS";
	int[] arrMain= {1, 2, 3, 4, 5};
	changeMe(num, strMain, arrMain);
	//System.out.println(num);
//	System.out.println(strMain);
//	System.out.println(Arrays.toString(arrMain));
			
	
}
public static void changeMe (int x, String str, int [] arr) {
	x=8;
	str="10";
	for (int i=0; i<arr.length; i++) {
		arr[i]++;
	}
	//a=startValue
//b=a
	//a=newValue
	int b=x;
	x=17;
	System.out.println("b:" +b);
	
	str="ddddd";
	String bStr=str;
	str = "hi there!";
	System.out.println("bstr:"+ bStr);
	
	//str="ddddd"
	int [] barr=arr;
	for (int i=0; i<arr.length; i++) {
		arr[i]=0;
	}
	System.out.println("barr:"+ Arrays.toString(barr));
	}
}


