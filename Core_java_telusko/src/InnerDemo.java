class Outer

/*
 * Inner class-> three types
 * 1) member class
 * 2) static class
 * 3) Anonymous class
 */
{
	static int a;   // member variable
	public static void show()   //member method
	{
		System.out.println("outer");
	}
	
	static class Inner //class inside a class (member class) // Outer$Inner.class file name
	{
		public void display()
		{
			System.out.println("in display");
		}
	}
}
public class InnerDemo 
{

	public static void main(String[] args) 
	{
		Outer obj=new Outer();
		obj.show();
	//	Outer.Inner in=obj.new Inner(); // for *member class* object creation we have to use, reference of outer class & object of outer class
		Outer.Inner in=new Outer.Inner(); // to access *static class* we need only class name 
        in.display();
	}

}
