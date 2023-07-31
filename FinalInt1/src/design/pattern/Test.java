package design.pattern;

public class Test {
public static void main(String[] args) {
	
	SingleTon s1= SingleTon.singleTon();
	SingleTon s2=SingleTon.singleTon();
	System.out.println(s1==s2);
	
	
	
	EagerDemo e1=EagerDemo.eagerDemo();
	EagerDemo e2= EagerDemo.eagerDemo();
	System.out.println(e1==e2);
	
	StaticBlockDemo b1=StaticBlockDemo.staticBlockDemo();
	StaticBlockDemo b2=StaticBlockDemo.staticBlockDemo();
	System.out.println(b1==b2);
	
	
	LazyDemo l1=LazyDemo.lazyDemo();
	LazyDemo l2=LazyDemo.lazyDemo();
	System.out.println(l1==l2);
	
	ThreadSafeDemo t1=ThreadSafeDemo.threadSafeDemo();
	ThreadSafeDemo t2=ThreadSafeDemo.threadSafeDemo();
	System.out.println(t1==t2);
	
	
	BillPughDemo c1=BillPughDemo.billPughDemo();
	BillPughDemo c2=BillPughDemo.billPughDemo();
	System.out.println(c1==c2);
	
	SingleEn f1=SingleEn.INSTANCE;
	SingleEn f2=SingleEn.INSTANCE;
	System.out.println(f1==f2);
}
}
