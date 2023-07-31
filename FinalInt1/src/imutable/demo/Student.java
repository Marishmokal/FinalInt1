package imutable.demo;

public final class Student {
	private final int id;
	private final String name;
	private final Address add;
	
	Student(int id, String name, Address add) {
		super();
		this.id = id;
		this.name = name;
		Address a=new Address();
		a.setCity(add.getCity());
		a.setId(add.getId());
		this.add =a;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Address getAdd() {
		Address dummy=new Address();
		dummy.setCity(add.getCity());
		dummy.setId(add.getId());
		return dummy;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", add=" + add + "]";
	}
	
	

}
