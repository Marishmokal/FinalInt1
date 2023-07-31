package copy.constructer;

public class TestStudent {
public static void main(String[] args) {
	
	Student s1=new Student(11,"Marish");
	Student s2=new Student(s1);
	
	System.out.println(s1);
	System.out.println(s2);
	
	s2.name="Vaibhav";
	
	System.out.println(s1);
	System.out.println(s2);
}
}
