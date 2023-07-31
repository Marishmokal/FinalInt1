package basic.core;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter any String");
	String name=s.next();
	System.out.println(name.substring(0,3));
	
	
}

}
