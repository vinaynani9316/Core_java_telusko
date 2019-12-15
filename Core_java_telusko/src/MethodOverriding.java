class AB
{
	public void show()
	{
		System.out.println("in a");
	}
}

class Bc extends AB
{
	@Override
	public void show()
	{
		super.show();
		System.out.println("in b");
	}
}
class Ca extends Bc
{
	public void show()
	{ 
		System.out.println("in c");
	}
}
public class MethodOverriding {

	public static void main(String[] args) 
	{
		
//		Bc b1=new Bc();
//         b1.show();
		AB obj= new Bc();  //run time polymorphisim
		obj.show();
		 obj= new Ca();
		obj.show();  // Dynamic method dispatch
	}

}
