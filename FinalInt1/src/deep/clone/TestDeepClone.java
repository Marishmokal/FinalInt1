package deep.clone;

public class TestDeepClone {
public static void main(String[] args) throws CloneNotSupportedException {
	
	Engine e=new Engine(786,"4Stroke");
	Vehicle v1=new Vehicle(11,"BMW",e);
	
	Vehicle v2=null;
	
	v2=(Vehicle)v1.clone();
	
	System.out.println(v1);
	System.out.println(v2);
	
	v2.getEng().setEname("2Stroke");
	System.out.println(v1);
	System.out.println(v2);
	
	
}
}
