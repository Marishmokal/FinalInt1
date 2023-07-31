package imutable.demo;

interface Customable
{
	
}
class Custom implements Customable
{
	public boolean create(Object o)
	{
		if(o instanceof Customable)
		return true;
		else
			return false;
	}
}
public class MarkerInterface implements Customable {
public static void main(String[] args) {
	
	Custom c=new Custom();
	String s=new String();
	MarkerInterface mk=new MarkerInterface();
	System.out.println(c.create(c));
	System.out.println(c.create(s));
	System.out.println(c.create(mk));
	
	
	
}
}
