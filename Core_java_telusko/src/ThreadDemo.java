class Hi extends Thread
{
	public void run() 
	{
		for (int i=1; i<=5; i++)
		{
		System.out.println("Hi");
		try {Thread.sleep(500); } catch(Exception e) {}
		}
	}
}
class Hello extends Thread
{
	public void run()
	{
		for (int i=1; i<=5; i++)
		{
		System.out.println("Hello");
		try {Thread.sleep(500); } catch(Exception e) {}
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) 
	{
		
		Hi h = new Hi();
		Hello h1= new Hello();
		h.start();
		try {Thread.sleep(100); } catch(Exception e) {}
		h1.start();
		

	}

}
