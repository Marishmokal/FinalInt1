package copy.constructer;

public class EmployeeTest {
public static void main(String[] args) {
	
	Address ad=new Address(1234,"pune");
	Employee em=new Employee(11,"marish",ad);
	
	Employee employee=new Employee(em);
	
	System.out.println(em);
	System.out.println(employee);
	
	employee.address.city="mumbai";
	System.out.println(em);
	System.out.println(employee);
}
}