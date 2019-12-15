public class AnoynomousThreadInterface    // using lambda expressions without implementing Runnable Interface.
{
	public static void main(String []args) throws Exception 
	{
		Thread t1= new Thread(()-> 
		{
		for( int i=1; i<=5; i++)
		{
			System.out.println("in thread1 " + Thread.currentThread().getPriority());
			try {Thread.sleep(500);} catch(Exception e) {}
		}
		
	}, "vinod");
		 
		Thread t2= new Thread(()->
		{
			for(int i=1; i<=5; i++)
			{
				System.out.println("in Thread2 " + Thread.currentThread().getPriority());
				try {Thread.sleep(500);} catch(Exception e) {}
			}
		},"vinay");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		// System.out.println(t1.getName());
		//t1.setName("vinay");
		// t2.setName("vinod");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		t1.start();
		try {Thread.sleep(100);} catch(Exception e) {}
		t2.start();
	      t1.join(); 
		  t2.join();
		 
		System.out.println(t1.isAlive()); // boolean once thread completes its process it leads to dead state
		System.out.println("Bye");	
			
		
	}
}