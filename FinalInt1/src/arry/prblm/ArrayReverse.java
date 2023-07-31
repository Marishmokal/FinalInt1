package arry.prblm;

import java.util.Arrays;

public class ArrayReverse {
public static void main(String[] args) {
	
	Integer[]x= {108,56,89,4782};
	Arrays.sort(x);
	System.out.println(Arrays.toString(x));
	
	for(int i=0;i<x.length/2;i++)
	{
		int temp=x[i];
		x[i]=x[x.length-i-1];
		x[x.length-i-1]=temp;
		
	}
	System.out.println(Arrays.toString(x));
	
}
}
