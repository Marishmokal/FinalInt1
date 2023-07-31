package practice.collection;

import java.util.Comparator;

public class SortByCity implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		int result=o1.city.compareTo(o2.city);
		return result;
	}

}
