package practice.collection;

import java.util.TreeSet;

public class TestEmployee {
public static void main(String[] args) {
	
	Employee e1=new Employee(15,"marish",457.6,"mumbai");
	Employee e2=new Employee(4,"vishwa",786.36,"kolkata");
	Employee e3=new Employee(22,"pranav",500,"benglore");
	
	
//	TreeSet<Employee>t=new TreeSet<>(new SortById());
//	t.add(e2);
//	t.add(e1);
//	t.add(e3);
//	System.out.println(t);
	
//	
//	TreeSet<Employee>t=new TreeSet<>(new SortByName());
//	t.add(e2);
//	t.add(e1);
//	t.add(e3);
//	System.out.println(t);
	
	
	
//	TreeSet<Employee>t=new TreeSet<>(new SortByCity());
//	t.add(e2);
//	t.add(e1);
//	t.add(e3);
//	System.out.println(t);
	
	
	TreeSet<Employee>t=new TreeSet<>(new SortBySalary());
	t.add(e2);
	t.add(e1);
	t.add(e3);
	System.out.println(t);
}
}
