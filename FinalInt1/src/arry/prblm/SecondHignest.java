package arry.prblm;

import java.util.Arrays;

public class SecondHignest {
public static void main(String[] args) {
	
	Integer[]x= {12,45,5,36,98,63,76};
	Arrays.sort(x);
//	System.out.println(x[x.length-2]);
	
	for(int i=0;i<x.length;i++)
	{
		for(int j=i+1;j<x.length;j++)
		{
			int temp=x[i];
			x[i]=x[x.length-1];
			x[x.length-1]=temp;
			
		}
	}
	System.out.println(x[x.length-1]);
}
}
