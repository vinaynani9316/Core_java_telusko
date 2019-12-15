class Counter
{
	int count;
	public synchronized void increment() // when we don't use synchronized keyword then process will run parallel. 
	{
		count++; // count=count+1
	}
}
public class SyncDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		Counter c= new Counter();
//		c.increment();
		
		Thread t1= new Thread(new Runnable()
				{
			      public synchronized void run()
			      {
			    	  for(int i=1; i<=1000; i++) 
			    	  {
			    		  c.increment();
			    	  }
			      }
				});
		
		Thread t2= new Thread(new Runnable()
				{
			           public synchronized void run()
			           {
			        	   for(int i=1; i<=1000; i++)
			        	   {
			        		   c.increment();
			        	   }
			           }
				});
				
			t1.start();
			t2.start();
			t1.join();
			t2.join();
				
		System.out.println("Count:" +c.count);
		

	}

}
