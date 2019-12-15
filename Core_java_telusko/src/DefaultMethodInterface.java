//from jdk 8 we can declare methods in interface

@java.lang.FunctionalInterface
interface Demo
{
	void abc();  //abstract ()
	default void show()  // now we can define default () in interface
	{
		System.out.println("in show"); // from jdk 8 we can have n number of default () should contain only one abstract() for functional Interface
	}
}

interface MyDemo
{
	default void show()
	{
		System.out.println("in Mydemo");
	}
}
class Sesk implements Demo, MyDemo
{
	public void abc()
	{
		System.out.println("in abc");
	}
	
	public void show()
	{
		MyDemo.super.show();
		System.out.println("in B"); 
	}
}
public class DefaultMethodInterface {

	public static void main(String[] args) 
	{
		Demo d= new Sesk();
		d.abc();
		d.show();
	}

}
