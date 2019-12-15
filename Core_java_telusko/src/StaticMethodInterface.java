interface D
{
	int n=8; // by default, variables are final in interface
	void abc();
	static void show() // static () with declaration
	{
		System.out.println("in default");
	}
	static void raw()
	{
		System.out.println("in 1st static");
	}
	default void plan()
	{
		System.out.println("default implementation");
	}
}
class P implements D
{

	@Override
	public void abc() {
		
	}
	
}
public class StaticMethodInterface {

	public static void main(String[] args) 
	{
		  
		D.show(); // with out implementing any interface we can access object through calling a method static 
		D.raw();
		D d= new P();
		d.plan();
	

	}

}
