package arry.prblm;

import java.util.Arrays;
import java.util.*;

public class FindMultipleMissing {
public static void main(String[] args) {
	
	Integer[]y= {6,1,5,3};
	List l = Arrays.asList(y);
	Arrays.sort(y);
	int max=y[y.length-1];
	int min = y[0];
	for(int i=min;i<=max;i++)
	{
		if(!l.contains(i)){
			System.out.println(i);
		}
		
	}
	
	
}
}
