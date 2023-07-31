package imutable.demo;

public class TestImmutable {
public static void main(String[] args) {
	
	Address ad=new Address(11,"pune");
	Student s1=new Student(111,"Marish",ad);
	
	System.out.println(s1);
	
	ad.setCity("mumbai");
	System.out.println(s1);
}
}
