package practice.collection;//comparable

import java.util.TreeSet;

public class TestStudent {
public static void main(String[] args) {
	
	Student s1=new Student(15,"vaibhav");
	Student s2=new Student(5,"marish");
	Student s3=new Student(22,"pranav");
	
	
	TreeSet<Student>t=new TreeSet<>();
	t.add(s3);
	t.add(s1);
	t.add(s2);
	System.out.println(t);
	
}
}
