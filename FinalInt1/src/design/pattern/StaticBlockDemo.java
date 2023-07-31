package design.pattern;

public class StaticBlockDemo {

	private static StaticBlockDemo obj=null;

	private StaticBlockDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public static StaticBlockDemo staticBlockDemo()
	{
		return obj;
	}
	static
	{
		try {
			obj=new StaticBlockDemo();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
