
public class ExceptionDemo {

	public static void main(String[] args) 
	{
		try
		{
			int a[]=null;
			a[6]=8;
			int i=9;
			int j=2; 
			int k=i/j;
			System.out.println(k);
		
		}
		catch(ArithmeticException  e) //from jdk 7 we can use this 
		{
			System.err.println("can't divide num by 0");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("stay in limit");
		}
		catch(Exception e)
		{
			System.out.println("something wrong");
		}
		finally
		{
		System.out.println("Bye");
		}

	}

}
