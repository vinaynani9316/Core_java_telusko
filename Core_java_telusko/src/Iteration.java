
public class Iteration {

	// while, do while, for for-each
	public static void main(String[] args)
	{
		int i=1;  // Initialization
		while(i<=5)   // condition
		{
			System.out.println("hello");   
			i++;    //increment
		}
		
		System.out.println("****");
		
		int k=10;     // do while will print at least once statement irrespective of condition
		do
		{
			System.out.println("hi");
			k++;
		}
		while(k<5);
		
		
		System.out.println("***");
		
		int j=10;                           // when we know starting & ending of loop
		for(j=1; j<=5; j++)
		{
			System.out.println("bye");
		}

	}

}
