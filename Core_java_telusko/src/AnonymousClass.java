class Anu
{
	public void show()
	{
		System.out.println("im good");
	}
}

public class AnonymousClass 
{
	 public static void main(String[] args) 
	{
		
		Anu a= new Anu()                     // creating a class inside an object creation with out naming the class known as
				{                            // Anonymous class. we can't reuse anonymous class once initialized
			public void show()
			{
				System.out.println(" im best");
			}
				};
				
	     a.show();			

	}

}
