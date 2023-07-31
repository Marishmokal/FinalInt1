package deep.clone;

public class Engine implements Cloneable {
	int eid;
	String ename;
	private Engine() {
		super();
		// TODO Auto-generated constructor stub
	}
	Engine(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Engine [eid=" + eid + ", ename=" + ename + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	

}
