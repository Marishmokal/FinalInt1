package copy.constructer;

public class Student {
int id;
String name;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

Student(Student s)
{
	this.id=s.id;
	this.name=s.name;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + "]";
}
}
