class A
{
	public A()
	{
		System.out.println("in A");
	}
	public A(int i)
	{
		System.out.println("in print");
	}
}

class B extends A
{
	public B()
	{
		super();
		System.out.println("in B");
	}
	
	public B(int i)
	{
		super(i);
		System.out.println("in write");
	}
}
public class SuperDemo {

	public static void main(String[] args) 
	{
		B b= new B(6);
	}

}
