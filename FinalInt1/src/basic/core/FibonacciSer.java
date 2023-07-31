package basic.core;//using two variable

public class FibonacciSer {
public static void main(String[] args) {
	
	int a=0;
	int b=1;
	
	for(int i=1;i<10;i++)
	{
		b=a+b;
		a=b-a;
		System.out.println(b);
	}
}
}
