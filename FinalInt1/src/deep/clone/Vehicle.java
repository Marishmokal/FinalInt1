package deep.clone;

public class Vehicle implements Cloneable {
	int id;
	String name;
	Engine eng;
	private Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	Vehicle(int id, String name, Engine eng) {
		super();
		this.id = id;
		this.name = name;
		this.eng = eng;
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
	public Engine getEng() {
		return eng;
	}
	public void setEng(Engine eng) {
		this.eng = eng;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + ", eng=" + eng + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Engine edummy=new Engine(eng.eid,eng.ename);
		Vehicle vdummy=new Vehicle(id,name,edummy);
		return vdummy;
	}
	
	

	
	
}
