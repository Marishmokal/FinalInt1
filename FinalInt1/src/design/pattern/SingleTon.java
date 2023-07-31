package design.pattern;

public class SingleTon {
private static SingleTon obj=null;

SingleTon() {
	super();
	// TODO Auto-generated constructor stub
}

public static SingleTon singleTon()
{
	if(obj==null)
	{
		obj=new SingleTon();
	}
	return obj;
}
}
