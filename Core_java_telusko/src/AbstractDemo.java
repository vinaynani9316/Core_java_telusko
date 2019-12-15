abstract class Human // this is abstract class
{
	public abstract void eat();   //only declaring in abstract class
	 
	public void walk()
	{
		System.out.println("in walk");
	}
			
} 
class Man extends Human    // this is concrete class. defining in extends class of abstract() 
{
	public void eat()
	{
		System.out.println("in eat");
	}
}
public class AbstractDemo {

	public static void main(String[] args) 
	{
		 
		Human obj= new Man();
		obj.eat();
		obj.walk();

	}

}
