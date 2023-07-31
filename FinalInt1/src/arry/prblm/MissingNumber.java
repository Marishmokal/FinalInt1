package arry.prblm;

public class MissingNumber {
public static void main(String[] args) {
	
	int[]x= {1,4,2,5,6};
	
	int total_num=5;
	int Sum=total_num*((total_num+1)/2);
	int result=0;
	for (int i : x) {
		result=result+i;
	}
	System.out.println(Sum-result);
}
}
