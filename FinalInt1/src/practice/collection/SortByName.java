package practice.collection;

import java.util.Comparator;

public class SortByName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		int result=o1.name.compareTo(o2.name);
		return result;
	}

}
