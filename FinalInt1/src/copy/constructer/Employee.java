package copy.constructer;

public class Employee {
int id;
String name;
Address address;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name, Address address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}

Employee(Employee e)
{
	this.id=e.id;
	this.name=e.name;
	Address add=new Address(e.address);
	this.address=address;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
}

}
