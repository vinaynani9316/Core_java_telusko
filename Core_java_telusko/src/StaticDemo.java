class Emp
{
	int eid;
	int salary;
	static String ceo;  // static keyword create only object once 
	
	public void show()
	{
		System.out.println(eid + ":" +salary+ ":" +ceo);
	}
	
	static //when you load a class it executes, class loads only once, Static block will executes first
	{
		ceo="nikhil";
		System.out.println("in static");
	}
	
	public Emp() // when you create on object it executes & then constructor will execute next
	{
		eid=30;
		salary=70000;
		System.out.println("in constructor");  // it will create objects  
	}
}

public class StaticDemo

{
	static int i=0;
	public static void main(String[] args)
	{
		
		i=9;  // static variables only accessed by static blocks or static methods
		Emp vinay= new Emp();
		/* vinay.eid=10;
		vinay.salary=20000; */
		Emp.ceo="ram";   // not accepting because static keyword used, to access the static keyword don't need object 
		
		Emp vinod=new Emp();
	/*	vinod.eid=20;
		vinod.salary=30000; */
		Emp.ceo="rak";
		
		Emp.ceo="nikil";
		
		vinay.show();
		vinod.show();
		System.out.println(i);
		
		
	}

}
