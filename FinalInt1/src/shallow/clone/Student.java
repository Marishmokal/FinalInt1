package shallow.clone;

public class Student implements Cloneable {
int id;
String name;
Address add;
private Student() {
	super();
	// TODO Auto-generated constructor stub
}
private Student(int id, String name, Address add) {
	super();
	this.id = id;
	this.name = name;
	this.add = add;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Address getAdd() {
	return add;
}
public void setAdd(Address add) {
	this.add = add;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", add=" + add + "]";
}


public static void main(String[] args) throws CloneNotSupportedException {
	
	Address ad=new Address(1245,"Mumbai");
	Student s1=new Student(11,"Tejas",ad);
	
	Student s2=null;
	s2=(Student)s1.clone();
	System.out.println(s1);
	System.out.println(s2);
	
	s2.getAdd().setCity("Pune");
	System.out.println(s1);
	System.out.println(s2);
}

	
}
