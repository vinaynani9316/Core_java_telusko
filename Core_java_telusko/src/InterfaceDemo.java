interface Writer  // in interface by default methods are abstract & public modifier
{
	void write();
}

class Pen implements Writer  // in interface we use implements keyword
{
	public void write()
	{
		System.out.println("in pen");
	}
}

class pencil implements Writer // we can implement as many as interface so it supports multiple inheritance
{
	public void write()
	{
		System.out.println("in pencil");
	}
}

//class Kit
//{
//	public void doSomething(Writer j)
//	{
//		j.write();
//	}
//}
public class InterfaceDemo {

	public static void main(String[] args) 
	{
		//Kit k =new Kit();
		Writer p= new Pen();
		Writer p1=new pencil();  // we can't create the object of interface 
		
//		k.doSomething(p);
//		k.doSomething(p1);
		p.write();
		p1.write();
		

	}

}
