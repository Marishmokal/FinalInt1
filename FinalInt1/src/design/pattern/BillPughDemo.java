package design.pattern;

public class BillPughDemo {

	private static BillPughDemo obj=null;

	private BillPughDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static class SingleTonHelper
	{
		private static final BillPughDemo obj=new BillPughDemo();
	}
	public static BillPughDemo billPughDemo()
	{
		return SingleTonHelper.obj;
	}
}
