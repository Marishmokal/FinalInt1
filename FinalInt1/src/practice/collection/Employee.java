package practice.collection;

import java.util.Objects;

public class Employee {
int id;
String name;
double salary;
String city;
private Employee() {
	super();
	// TODO Auto-generated constructor stub
}
Employee(int id, String name, double salary, String city) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.city = city;
}
@Override
public int hashCode() {
	return Objects.hash(city, id, name, salary);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return Objects.equals(city, other.city) && id == other.id && Objects.equals(name, other.name)
			&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", city=" + city + "]";
}


}
