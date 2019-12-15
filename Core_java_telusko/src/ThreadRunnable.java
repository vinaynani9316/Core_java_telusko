class H implements Runnable
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Hi");
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}
class H1 implements Runnable
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Hello");
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}  

public class ThreadRunnable {

	public static void main(String[] args) 
	{
		H h= new H();
		H1 h1= new H1();
		Thread t1=new Thread(h);
		Thread t2=new Thread(h1);
		t1.start();
		try {Thread.sleep(100);}catch(Exception e) {}
		t2.start();
		
		

	}

}
